package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.repository.ButtonDataRepository;
import ged.mediaplayerremote.domain.repository.ButtonRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideButtonRepositoryFactory implements Factory<ButtonRepository> {
  private final ApplicationModule module;
  private final Provider<ButtonDataRepository> buttonDataRepositoryProvider;

  public ApplicationModule_ProvideButtonRepositoryFactory(ApplicationModule module, Provider<ButtonDataRepository> buttonDataRepositoryProvider) {  
    assert module != null;
    this.module = module;
    assert buttonDataRepositoryProvider != null;
    this.buttonDataRepositoryProvider = buttonDataRepositoryProvider;
  }

  @Override
  public ButtonRepository get() {  
    ButtonRepository provided = module.provideButtonRepository(buttonDataRepositoryProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ButtonRepository> create(ApplicationModule module, Provider<ButtonDataRepository> buttonDataRepositoryProvider) {  
    return new ApplicationModule_ProvideButtonRepositoryFactory(module, buttonDataRepositoryProvider);
  }
}

