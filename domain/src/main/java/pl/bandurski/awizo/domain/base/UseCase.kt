package pl.bandurski.awizo.domain.base

internal interface UseCase {
    operator fun invoke()
}

internal interface InUseCase<in Input> {
    operator fun invoke(input: Input)
}

internal interface OutUseCase<out Output> {
    operator fun invoke(): Output
}

internal interface InOutUseCase<in Input, out Output> {
    operator fun invoke(input: Input): Output
}

internal interface SuspendUseCase {
    suspend operator fun invoke()
}

internal interface SuspendInUseCase<in Input> {
    suspend operator fun invoke(input: Input)
}

internal interface SuspendOutUseCase<out Output> {
    suspend operator fun invoke(): Output
}

internal interface SuspendInOutUseCase<in Input, out Output> {
    suspend operator fun invoke(input: Input): Output
}




