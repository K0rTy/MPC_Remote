package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.repository.SharedPreferencesRepositoryImpl;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideUserPreferencesRepositoryFactory implements Factory<UserPreferencesRepository> {
  private final ApplicationModule module;
  private final Provider<SharedPreferencesRepositoryImpl> sharedPreferencesRepositoryProvider;

  public ApplicationModule_ProvideUserPreferencesRepositoryFactory(ApplicationModule module, Provider<SharedPreferencesRepositoryImpl> sharedPreferencesRepositoryProvider) {  
    assert module != null;
    this.module = module;
    assert sharedPreferencesRepositoryProvider != null;
    this.sharedPreferencesRepositoryProvider = sharedPreferencesRepositoryProvider;
  }

  @Override
  public UserPreferencesRepository get() {  
    UserPreferencesRepository provided = module.provideUserPreferencesRepository(sharedPreferencesRepositoryProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UserPreferencesRepository> create(ApplicationModule module, Provider<SharedPreferencesRepositoryImpl> sharedPreferencesRepositoryProvider) {  
    return new ApplicationModule_ProvideUserPreferencesRepositoryFactory(module, sharedPreferencesRepositoryProvider);
  }
}

