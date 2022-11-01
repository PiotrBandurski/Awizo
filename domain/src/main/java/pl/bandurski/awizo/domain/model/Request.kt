package pl.bandurski.awizo.domain.model

data class Request(
    val type: RequestType,
    val headers: List<Header>,
    val payload: Payload
)