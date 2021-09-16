// Generated by Dagger (https://dagger.dev).
package com.rana.bitapp.presentation.ticketList;

import com.rana.bitapp.domain.use_case.getTickers.GetTickersUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TickerListViewModel_Factory implements Factory<TickerListViewModel> {
  private final Provider<GetTickersUseCase> getTickersUseCaseProvider;

  public TickerListViewModel_Factory(Provider<GetTickersUseCase> getTickersUseCaseProvider) {
    this.getTickersUseCaseProvider = getTickersUseCaseProvider;
  }

  @Override
  public TickerListViewModel get() {
    return newInstance(getTickersUseCaseProvider.get());
  }

  public static TickerListViewModel_Factory create(
      Provider<GetTickersUseCase> getTickersUseCaseProvider) {
    return new TickerListViewModel_Factory(getTickersUseCaseProvider);
  }

  public static TickerListViewModel newInstance(GetTickersUseCase getTickersUseCase) {
    return new TickerListViewModel(getTickersUseCase);
  }
}