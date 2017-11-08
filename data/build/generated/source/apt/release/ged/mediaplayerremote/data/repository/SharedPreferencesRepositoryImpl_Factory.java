package ged.mediaplayerremote.data.repository;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SharedPreferencesRepositoryImpl_Factory implements Factory<SharedPreferencesRepositoryImpl> {
  private final Provider<Context> contextProvider;

  public SharedPreferencesRepositoryImpl_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferencesRepositoryImpl get() {  
    return new SharedPreferencesRepositoryImpl(contextProvider.get());
  }

  public static Factory<SharedPreferencesRepositoryImpl> create(Provider<Context> contextProvider) {  
    return new SharedPreferencesRepositoryImpl_Factory(contextProvider);
  }
}

