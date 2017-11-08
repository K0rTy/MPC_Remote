package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.repository.datasource.ButtonDataStore;
import ged.mediaplayerremote.data.repository.datasource.SharedPrefsButtonDataStore;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ButtonDataStoreFactory implements Factory<ButtonDataStore> {
  private final ApplicationModule module;
  private final Provider<SharedPrefsButtonDataStore> sharedPrefsButtonDataStoreProvider;

  public ApplicationModule_ButtonDataStoreFactory(ApplicationModule module, Provider<SharedPrefsButtonDataStore> sharedPrefsButtonDataStoreProvider) {  
    assert module != null;
    this.module = module;
    assert sharedPrefsButtonDataStoreProvider != null;
    this.sharedPrefsButtonDataStoreProvider = sharedPrefsButtonDataStoreProvider;
  }

  @Override
  public ButtonDataStore get() {  
    ButtonDataStore provided = module.buttonDataStore(sharedPrefsButtonDataStoreProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ButtonDataStore> create(ApplicationModule module, Provider<SharedPrefsButtonDataStore> sharedPrefsButtonDataStoreProvider) {  
    return new ApplicationModule_ButtonDataStoreFactory(module, sharedPrefsButtonDataStoreProvider);
  }
}

