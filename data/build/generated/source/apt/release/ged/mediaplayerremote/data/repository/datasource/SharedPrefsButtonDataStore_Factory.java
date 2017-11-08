package ged.mediaplayerremote.data.repository.datasource;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SharedPrefsButtonDataStore_Factory implements Factory<SharedPrefsButtonDataStore> {
  private final Provider<Context> contextProvider;

  public SharedPrefsButtonDataStore_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPrefsButtonDataStore get() {  
    return new SharedPrefsButtonDataStore(contextProvider.get());
  }

  public static Factory<SharedPrefsButtonDataStore> create(Provider<Context> contextProvider) {  
    return new SharedPrefsButtonDataStore_Factory(contextProvider);
  }
}

