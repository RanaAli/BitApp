package com.rana.bitapp.di

import com.rana.bitapp.data.remote.websockets.BitfinexDataSource
import com.rana.bitapp.data.remote.websockets.BitfinexDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModuleAbs {

    @Binds
    abstract fun bindBitfinexDataSource(
        bitfinexDataSourceImpl: BitfinexDataSourceImpl
    ): BitfinexDataSource
}