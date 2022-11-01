package pl.bandurski.awizo.domain.model

import kotlinx.datetime.Instant

class HistoricalRequest(
    val date: Instant,
    val request: Request,
    val result: HistoricalRequestResult
)

sealed class HistoricalRequestResult {
    class ApiResponse(val value: Response): HistoricalRequestResult()
    class RequestError(): HistoricalRequestResult()
}