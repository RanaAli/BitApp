package com.rana.bitapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0006\u0010\u0011\u001a\u00020\u0004J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/rana/bitapp/di/AppModule;", "", "()V", "createClient", "Lokhttp3/OkHttpClient;", "provideAppForegroundAndUserLoggedInLifecycle", "Lcom/tinder/scarlet/Lifecycle;", "appContext", "Landroid/app/Application;", "provideBackoffStrategy", "Lcom/tinder/scarlet/retry/ExponentialWithJitterBackoffStrategy;", "provideBitFinexApi", "Lcom/rana/bitapp/data/remote/restfullApi/BitFinexRetrofitApi;", "provideBitfinexRepositoryImpl", "Lcom/rana/bitapp/domain/repository/BitfinexRepository;", "bitfinexDataSource", "Lcom/rana/bitapp/data/remote/websockets/BitfinexDataSource;", "provideOkHttpClient", "provideScarletInstance", "Lcom/tinder/scarlet/Scarlet;", "backoffStrategy", "lifecycle", "provideScarletService", "Lcom/rana/bitapp/data/remote/websockets/BitfinexWebSocketApi;", "scarlet", "provideTickerRepository", "Lcom/rana/bitapp/domain/repository/TicketRepository;", "api", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.rana.bitapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rana.bitapp.data.remote.restfullApi.BitFinexRetrofitApi provideBitFinexApi() {
        return null;
    }
    
    private final okhttp3.OkHttpClient createClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.tinder.scarlet.Lifecycle provideAppForegroundAndUserLoggedInLifecycle(@org.jetbrains.annotations.NotNull()
    android.app.Application appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.tinder.scarlet.retry.ExponentialWithJitterBackoffStrategy provideBackoffStrategy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.tinder.scarlet.Scarlet provideScarletInstance(@org.jetbrains.annotations.NotNull()
    com.tinder.scarlet.retry.ExponentialWithJitterBackoffStrategy backoffStrategy, @org.jetbrains.annotations.NotNull()
    com.tinder.scarlet.Lifecycle lifecycle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.rana.bitapp.data.remote.websockets.BitfinexWebSocketApi provideScarletService(@org.jetbrains.annotations.NotNull()
    com.tinder.scarlet.Scarlet scarlet) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.rana.bitapp.domain.repository.BitfinexRepository provideBitfinexRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.data.remote.websockets.BitfinexDataSource bitfinexDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rana.bitapp.domain.repository.TicketRepository provideTickerRepository(@org.jetbrains.annotations.NotNull()
    com.rana.bitapp.data.remote.restfullApi.BitFinexRetrofitApi api) {
        return null;
    }
}