package ged.mediaplayerremote.data.network;

import android.content.Context;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ServerFinder_Factory implements Factory<ServerFinder> {
  private final Provider<Context> contextProvider;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;

  public ServerFinder_Factory(Provider<Context> contextProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert userPreferencesRepositoryProvider != null;
    this.userPreferencesRepositoryProvider = userPreferencesRepositoryProvider;
  }

  @Override
  public ServerFinder get() {  
    return new ServerFinder(contextProvider.get(), userPreferencesRepositoryProvider.get());
  }

  public static Factory<ServerFinder> create(Provider<Context> contextProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    return new ServerFinder_Factory(contextProvider, userPreferencesRepositoryProvider);
  }
}

