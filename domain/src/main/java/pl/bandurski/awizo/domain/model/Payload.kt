package pl.bandurski.awizo.domain.model

sealed class Payload {

    sealed class Text: Payload() {
        object Json: Text()
    }

}