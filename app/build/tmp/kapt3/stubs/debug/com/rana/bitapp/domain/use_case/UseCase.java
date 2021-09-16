package com.rana.bitapp.domain.use_case;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/rana/bitapp/domain/use_case/UseCase;", "", "FlowUseCase", "None", "Params", "app_debug"})
public abstract interface UseCase {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/rana/bitapp/domain/use_case/UseCase$FlowUseCase;", "P", "Lcom/rana/bitapp/domain/use_case/UseCase$Params;", "T", "", "Lcom/rana/bitapp/domain/use_case/UseCase;", "execute", "Lkotlinx/coroutines/flow/Flow;", "params", "(Lcom/rana/bitapp/domain/use_case/UseCase$Params;)Lkotlinx/coroutines/flow/Flow;", "app_debug"})
    public static abstract interface FlowUseCase<P extends com.rana.bitapp.domain.use_case.UseCase.Params, T extends java.lang.Object> extends com.rana.bitapp.domain.use_case.UseCase {
        
        @org.jetbrains.annotations.NotNull()
        public abstract kotlinx.coroutines.flow.Flow<T> execute(@org.jetbrains.annotations.NotNull()
        P params);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rana/bitapp/domain/use_case/UseCase$Params;", "", "()V", "app_debug"})
    public static abstract class Params {
        
        public Params() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rana/bitapp/domain/use_case/UseCase$None;", "Lcom/rana/bitapp/domain/use_case/UseCase$Params;", "()V", "app_debug"})
    public static final class None extends com.rana.bitapp.domain.use_case.UseCase.Params {
        
        public None() {
            super();
        }
    }
}