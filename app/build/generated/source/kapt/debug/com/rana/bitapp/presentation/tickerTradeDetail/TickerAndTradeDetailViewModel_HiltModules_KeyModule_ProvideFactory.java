// Generated by Dagger (https://dagger.dev).
package com.rana.bitapp.presentation.tickerTradeDetail;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TickerAndTradeDetailViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static TickerAndTradeDetailViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(TickerAndTradeDetailViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final TickerAndTradeDetailViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TickerAndTradeDetailViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}