package ged.mediaplayerremote.data.repository;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.repository.datasource.ButtonDataStore;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ButtonDataRepository_Factory implements Factory<ButtonDataRepository> {
  private final Provider<ButtonDataStore> buttonDataStoreProvider;

  public ButtonDataRepository_Factory(Provider<ButtonDataStore> buttonDataStoreProvider) {  
    assert buttonDataStoreProvider != null;
    this.buttonDataStoreProvider = buttonDataStoreProvider;
  }

  @Override
  public ButtonDataRepository get() {  
    return new ButtonDataRepository(buttonDataStoreProvider.get());
  }

  public static Factory<ButtonDataRepository> create(Provider<ButtonDataStore> buttonDataStoreProvider) {  
    return new ButtonDataRepository_Factory(buttonDataStoreProvider);
  }
}

