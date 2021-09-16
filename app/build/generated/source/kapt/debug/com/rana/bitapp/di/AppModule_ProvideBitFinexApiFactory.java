// Generated by Dagger (https://dagger.dev).
package com.rana.bitapp.di;

import com.rana.bitapp.data.remote.restfullApi.BitFinexRetrofitApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideBitFinexApiFactory implements Factory<BitFinexRetrofitApi> {
  @Override
  public BitFinexRetrofitApi get() {
    return provideBitFinexApi();
  }

  public static AppModule_ProvideBitFinexApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BitFinexRetrofitApi provideBitFinexApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBitFinexApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideBitFinexApiFactory INSTANCE = new AppModule_ProvideBitFinexApiFactory();
  }
}
