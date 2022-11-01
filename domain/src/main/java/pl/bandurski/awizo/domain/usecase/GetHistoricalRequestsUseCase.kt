package pl.bandurski.awizo.domain.usecase

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.datetime.Clock
import pl.bandurski.awizo.domain.base.InOutUseCase
import pl.bandurski.awizo.domain.model.HistoricalRequest
import pl.bandurski.awizo.domain.model.HistoricalRequestResult
import pl.bandurski.awizo.domain.model.Payload
import pl.bandurski.awizo.domain.model.Request
import pl.bandurski.awizo.domain.model.RequestType
import pl.bandurski.awizo.domain.model.Response
import javax.inject.Inject

class GetHistoricalRequestsUseCase @Inject internal constructor()
    : InOutUseCase<GetHistoricalRequestsUseCase.Params, Flow<List<HistoricalRequest>>> {

    override fun invoke(input: Params): Flow<List<HistoricalRequest>> {
        return flowOf(
            listOf(
                HistoricalRequest(
                    date = Clock.System.now(),
                    request = Request(
                        type = RequestType.GET,
                        headers = emptyList(),
                        payload = Payload.Text.Json
                    ),
                    result = HistoricalRequestResult.ApiResponse(
                        value = Response()
                    )
                )
            )
        )
    }

    class Params()
}