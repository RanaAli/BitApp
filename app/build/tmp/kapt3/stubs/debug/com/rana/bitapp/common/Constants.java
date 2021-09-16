package com.rana.bitapp.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/rana/bitapp/common/Constants;", "", "()V", "BASE_URL", "", "BITFINEX_WEB_SOCKET_BASE_URL", "DEFAULT_BASE_DURATION_IN_MS", "", "DEFAULT_MAX_DURATION_IN_MS", "DEFAULT_TIMEOUT_IN_SEC", "PARAM_COIN_ID", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.rana.bitapp.common.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api-pub.bitfinex.com/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_COIN_ID = "TickerId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BITFINEX_WEB_SOCKET_BASE_URL = "wss://api-pub.bitfinex.com/ws/1";
    public static final long DEFAULT_TIMEOUT_IN_SEC = 10L;
    public static final long DEFAULT_BASE_DURATION_IN_MS = 500L;
    public static final long DEFAULT_MAX_DURATION_IN_MS = 500L;
    
    private Constants() {
        super();
    }
}