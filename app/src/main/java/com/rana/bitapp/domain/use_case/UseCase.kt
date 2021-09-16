package com.rana.bitapp.domain.use_case

import kotlinx.coroutines.flow.Flow

interface UseCase {

    interface FlowUseCase<P : Params, T : Any> : UseCase {
        fun execute(params: P): Flow<T>
    }

    abstract class Params

    class None : Params()
}