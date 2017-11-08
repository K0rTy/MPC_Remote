package ged.mediaplayerremote.presentation.presenter;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.interactor.UseCase;
import ged.mediaplayerremote.domain.interactor.UseCaseParametrized;
import ged.mediaplayerremote.domain.repository.ButtonRepository;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ButtonGridPresenter_Factory implements Factory<ButtonGridPresenter> {
  private final Provider<ButtonRepository> buttonRepositoryProvider;
  private final Provider<UseCaseParametrized<Map<String, String>>> sendCommandUseCaseProvider;
  private final Provider<UseCaseParametrized<Boolean>> setEditModeUseCaseProvider;
  private final Provider<UseCase> editModeListenerUseCaseProvider;

  public ButtonGridPresenter_Factory(Provider<ButtonRepository> buttonRepositoryProvider, Provider<UseCaseParametrized<Map<String, String>>> sendCommandUseCaseProvider, Provider<UseCaseParametrized<Boolean>> setEditModeUseCaseProvider, Provider<UseCase> editModeListenerUseCaseProvider) {  
    assert buttonRepositoryProvider != null;
    this.buttonRepositoryProvider = buttonRepositoryProvider;
    assert sendCommandUseCaseProvider != null;
    this.sendCommandUseCaseProvider = sendCommandUseCaseProvider;
    assert setEditModeUseCaseProvider != null;
    this.setEditModeUseCaseProvider = setEditModeUseCaseProvider;
    assert editModeListenerUseCaseProvider != null;
    this.editModeListenerUseCaseProvider = editModeListenerUseCaseProvider;
  }

  @Override
  public ButtonGridPresenter get() {  
    return new ButtonGridPresenter(buttonRepositoryProvider.get(), sendCommandUseCaseProvider.get(), setEditModeUseCaseProvider.get(), editModeListenerUseCaseProvider.get());
  }

  public static Factory<ButtonGridPresenter> create(Provider<ButtonRepository> buttonRepositoryProvider, Provider<UseCaseParametrized<Map<String, String>>> sendCommandUseCaseProvider, Provider<UseCaseParametrized<Boolean>> setEditModeUseCaseProvider, Provider<UseCase> editModeListenerUseCaseProvider) {  
    return new ButtonGridPresenter_Factory(buttonRepositoryProvider, sendCommandUseCaseProvider, setEditModeUseCaseProvider, editModeListenerUseCaseProvider);
  }
}

