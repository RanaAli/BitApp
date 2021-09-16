package com.rana.bitapp.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0017\u00a8\u0006\t"}, d2 = {"Lcom/rana/bitapp/common/FlowStreamAdapter;", "T", "Lcom/tinder/scarlet/StreamAdapter;", "Lkotlinx/coroutines/flow/Flow;", "()V", "adapt", "stream", "Lcom/tinder/scarlet/Stream;", "Factory", "app_debug"})
public final class FlowStreamAdapter<T extends java.lang.Object> implements com.tinder.scarlet.StreamAdapter<T, kotlinx.coroutines.flow.Flow<? extends T>> {
    
    public FlowStreamAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<T> adapt(@org.jetbrains.annotations.NotNull()
    com.tinder.scarlet.Stream<T> stream) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/rana/bitapp/common/FlowStreamAdapter$Factory;", "Lcom/tinder/scarlet/StreamAdapter$Factory;", "()V", "create", "Lcom/tinder/scarlet/StreamAdapter;", "", "type", "Ljava/lang/reflect/Type;", "app_debug"})
    public static final class Factory implements com.tinder.scarlet.StreamAdapter.Factory {
        @org.jetbrains.annotations.NotNull()
        public static final com.rana.bitapp.common.FlowStreamAdapter.Factory INSTANCE = null;
        
        private Factory() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.tinder.scarlet.StreamAdapter<java.lang.Object, java.lang.Object> create(@org.jetbrains.annotations.NotNull()
        java.lang.reflect.Type type) {
            return null;
        }
    }
}