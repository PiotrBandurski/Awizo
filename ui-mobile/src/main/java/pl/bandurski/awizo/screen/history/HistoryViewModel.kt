package pl.bandurski.awizo.screen.history

import androidx.compose.runtime.Immutable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import pl.bandurski.awizo.domain.model.HistoricalRequest
import pl.bandurski.awizo.domain.usecase.GetHistoricalRequestsUseCase
import javax.inject.Inject

@HiltViewModel
class HistoryViewModel @Inject constructor(
    private val getHistoricalRequestsUseCase: GetHistoricalRequestsUseCase
) : ViewModel() {

    private val _viewState = MutableStateFlow(HistoryViewState())
    private val viewState: StateFlow<HistoryViewState> = _viewState

    init {
        observeRequestHistory()
    }

    private fun observeRequestHistory() {
        getHistoricalRequestsUseCase(GetHistoricalRequestsUseCase.Params())
            .onEach { historicalRequests ->
                _viewState.update { it.copy(history = historicalRequests) }
            }
            .launchIn(viewModelScope)
    }


}

@Immutable
data class HistoryViewState(
    val history: List<HistoricalRequest> = emptyList()
)