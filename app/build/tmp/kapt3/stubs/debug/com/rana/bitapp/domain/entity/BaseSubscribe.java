package com.rana.bitapp.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/rana/bitapp/domain/entity/BaseSubscribe;", "", "event", "", "channel", "symbol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getEvent", "getSymbol", "Companion", "app_debug"})
public abstract class BaseSubscribe {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String event = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String channel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String symbol = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.rana.bitapp.domain.entity.BaseSubscribe.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUBSCRIBE_EVENT = "subscribe";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TICKER_CHANNEL = "ticker";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRADE_CHANNEL = "trades";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BTCUSD_PAIR = "BTCUSD";
    
    public BaseSubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    java.lang.String channel, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/rana/bitapp/domain/entity/BaseSubscribe$Companion;", "", "()V", "BTCUSD_PAIR", "", "SUBSCRIBE_EVENT", "TICKER_CHANNEL", "TRADE_CHANNEL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}