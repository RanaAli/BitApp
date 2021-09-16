package com.rana.bitapp.di

import android.app.Application
import com.rana.bitapp.BuildConfig
import com.rana.bitapp.common.Constants
import com.rana.bitapp.common.Constants.DEFAULT_BASE_DURATION_IN_MS
import com.rana.bitapp.common.Constants.DEFAULT_MAX_DURATION_IN_MS
import com.rana.bitapp.common.Constants.DEFAULT_TIMEOUT_IN_SEC
import com.rana.bitapp.common.FlowStreamAdapter
import com.rana.bitapp.data.remote.restfullApi.BitFinexRetrofitApi
import com.rana.bitapp.data.remote.websockets.BitfinexDataSource
import com.rana.bitapp.data.remote.websockets.BitfinexWebSocketApi
import com.rana.bitapp.data.repository.BitfinexRepositoryImpl
import com.rana.bitapp.data.repository.TicketRepositoryImpl
import com.rana.bitapp.domain.repository.BitfinexRepository
import com.rana.bitapp.domain.repository.TicketRepository
import com.tinder.scarlet.Lifecycle
import com.tinder.scarlet.Scarlet
import com.tinder.scarlet.lifecycle.android.AndroidLifecycle
import com.tinder.scarlet.messageadapter.moshi.MoshiMessageAdapter
import com.tinder.scarlet.retry.ExponentialWithJitterBackoffStrategy
import com.tinder.scarlet.websocket.okhttp.newWebSocketFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBitFinexApi(): BitFinexRetrofitApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(createClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BitFinexRetrofitApi::class.java)
    }

    private fun createClient(): OkHttpClient {
        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val loggingInterceptor = HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY)
            okHttpClientBuilder.addInterceptor(loggingInterceptor)
        }
        return okHttpClientBuilder.build()
    }

    @Singleton
    @Provides
    fun provideAppForegroundAndUserLoggedInLifecycle(appContext: Application) =
        AndroidLifecycle.ofApplicationForeground(application = appContext)

    @Singleton
    @Provides
    fun provideBackoffStrategy() = ExponentialWithJitterBackoffStrategy(
        DEFAULT_BASE_DURATION_IN_MS,
        DEFAULT_MAX_DURATION_IN_MS
    )

    fun provideOkHttpClient(): OkHttpClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
            .connectTimeout(DEFAULT_TIMEOUT_IN_SEC, TimeUnit.SECONDS)
            .readTimeout(DEFAULT_TIMEOUT_IN_SEC, TimeUnit.SECONDS)
            .writeTimeout(DEFAULT_TIMEOUT_IN_SEC, TimeUnit.SECONDS)

        if (BuildConfig.DEBUG) {
            val loggingInterceptor =
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            okHttpClientBuilder.addInterceptor(loggingInterceptor)
        }

        return okHttpClientBuilder.build()
    }

    @Singleton
    @Provides
    fun provideScarletInstance(
        backoffStrategy: ExponentialWithJitterBackoffStrategy,
        lifecycle: Lifecycle
    ): Scarlet {
        val okHttpClient: OkHttpClient = provideOkHttpClient()

        return Scarlet.Builder()
            .webSocketFactory(okHttpClient.newWebSocketFactory(Constants.BITFINEX_WEB_SOCKET_BASE_URL))
            .addMessageAdapterFactory(MoshiMessageAdapter.Factory())
            .addStreamAdapterFactory(FlowStreamAdapter.Factory)
            .backoffStrategy(backoffStrategy)
            .lifecycle(lifecycle)
            .build()
    }


    @Singleton
    @Provides
    fun provideScarletService(scarlet: Scarlet): BitfinexWebSocketApi {
        val create = scarlet.create<BitfinexWebSocketApi>()


        return create
    }


    @Singleton
    @Provides
    fun provideBitfinexRepositoryImpl(bitfinexDataSource: BitfinexDataSource): BitfinexRepository =
        BitfinexRepositoryImpl(bitfinexDataSource)

    @Provides
    @Singleton
    fun provideTickerRepository(api: BitFinexRetrofitApi): TicketRepository =
        TicketRepositoryImpl(api)

}