package ged.mediaplayerremote.domain.controller;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CommandDispatcher_Factory implements Factory<CommandDispatcher> {
  private final Provider<MpcClientRepository> mpcClientRepositoryProvider;
  private final Provider<PlaybackStatusProxy> playbackStatusProxyProvider;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;

  public CommandDispatcher_Factory(Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<PlaybackStatusProxy> playbackStatusProxyProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    assert mpcClientRepositoryProvider != null;
    this.mpcClientRepositoryProvider = mpcClientRepositoryProvider;
    assert playbackStatusProxyProvider != null;
    this.playbackStatusProxyProvider = playbackStatusProxyProvider;
    assert userPreferencesRepositoryProvider != null;
    this.userPreferencesRepositoryProvider = userPreferencesRepositoryProvider;
  }

  @Override
  public CommandDispatcher get() {  
    return new CommandDispatcher(mpcClientRepositoryProvider.get(), playbackStatusProxyProvider.get(), userPreferencesRepositoryProvider.get());
  }

  public static Factory<CommandDispatcher> create(Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<PlaybackStatusProxy> playbackStatusProxyProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    return new CommandDispatcher_Factory(mpcClientRepositoryProvider, playbackStatusProxyProvider, userPreferencesRepositoryProvider);
  }
}

