// Generated by Dagger (https://dagger.dev).
package com.rana.bitapp.presentation.tickerTradeDetail;

import androidx.lifecycle.SavedStateHandle;
import com.rana.bitapp.domain.use_case.getDetails.GetTickerUseCase;
import com.rana.bitapp.domain.use_case.getDetails.GetTradeUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TickerAndTradeDetailViewModel_Factory implements Factory<TickerAndTradeDetailViewModel> {
  private final Provider<GetTickerUseCase> getTickerUseCaseProvider;

  private final Provider<GetTradeUseCase> getTradeUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public TickerAndTradeDetailViewModel_Factory(Provider<GetTickerUseCase> getTickerUseCaseProvider,
      Provider<GetTradeUseCase> getTradeUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.getTickerUseCaseProvider = getTickerUseCaseProvider;
    this.getTradeUseCaseProvider = getTradeUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public TickerAndTradeDetailViewModel get() {
    return newInstance(getTickerUseCaseProvider.get(), getTradeUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static TickerAndTradeDetailViewModel_Factory create(
      Provider<GetTickerUseCase> getTickerUseCaseProvider,
      Provider<GetTradeUseCase> getTradeUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new TickerAndTradeDetailViewModel_Factory(getTickerUseCaseProvider, getTradeUseCaseProvider, savedStateHandleProvider);
  }

  public static TickerAndTradeDetailViewModel newInstance(GetTickerUseCase getTickerUseCase,
      GetTradeUseCase getTradeUseCase, SavedStateHandle savedStateHandle) {
    return new TickerAndTradeDetailViewModel(getTickerUseCase, getTradeUseCase, savedStateHandle);
  }
}
