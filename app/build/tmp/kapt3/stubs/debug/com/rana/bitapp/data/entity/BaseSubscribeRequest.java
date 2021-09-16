package com.rana.bitapp.data.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/rana/bitapp/data/entity/BaseSubscribeRequest;", "", "event", "", "channel", "symbol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getEvent", "getSymbol", "app_debug"})
public abstract class BaseSubscribeRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String event = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String channel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String symbol = null;
    
    public BaseSubscribeRequest(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "event")
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "channel")
    java.lang.String channel, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "symbol")
    java.lang.String symbol) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSymbol() {
        return null;
    }
}