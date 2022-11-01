package pl.bandurski.awizo.screen.history

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import pl.bandurski.awizo.domain.model.HistoricalRequest
import pl.bandurski.awizo.domain.model.HistoricalRequestResult
import pl.bandurski.awizo.domain.model.Payload
import pl.bandurski.awizo.domain.model.Request
import pl.bandurski.awizo.domain.model.RequestType
import pl.bandurski.awizo.domain.model.Response

@Composable
fun HistoryScreenItem(
    item: HistoricalRequest
) {

    Row() {
        Text(text = "text")
        Column() {
            Row() {
                Text(text = "asd")
                Text(text = "asd")
            }
        }
        Text(text = "asddfg")
    }

}

@Preview
@Composable
private fun HistoryScreenItemPreview() {
    HistoryScreenItem(
        item = HistoricalRequest(
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

}