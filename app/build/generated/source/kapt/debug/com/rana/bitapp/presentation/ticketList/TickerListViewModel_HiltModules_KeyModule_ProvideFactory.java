// Generated by Dagger (https://dagger.dev).
package com.rana.bitapp.presentation.ticketList;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TickerListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static TickerListViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(TickerListViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final TickerListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TickerListViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
