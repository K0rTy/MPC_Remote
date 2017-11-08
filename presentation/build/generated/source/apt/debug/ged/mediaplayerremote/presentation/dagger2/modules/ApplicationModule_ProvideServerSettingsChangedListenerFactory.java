package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.PlaybackStatusProxy;
import ged.mediaplayerremote.domain.controller.ServerSettingsChangedListener;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideServerSettingsChangedListenerFactory implements Factory<ServerSettingsChangedListener> {
  private final ApplicationModule module;
  private final Provider<PlaybackStatusProxy> playbackStatusProxyProvider;

  public ApplicationModule_ProvideServerSettingsChangedListenerFactory(ApplicationModule module, Provider<PlaybackStatusProxy> playbackStatusProxyProvider) {  
    assert module != null;
    this.module = module;
    assert playbackStatusProxyProvider != null;
    this.playbackStatusProxyProvider = playbackStatusProxyProvider;
  }

  @Override
  public ServerSettingsChangedListener get() {  
    ServerSettingsChangedListener provided = module.provideServerSettingsChangedListener(playbackStatusProxyProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ServerSettingsChangedListener> create(ApplicationModule module, Provider<PlaybackStatusProxy> playbackStatusProxyProvider) {  
    return new ApplicationModule_ProvideServerSettingsChangedListenerFactory(module, playbackStatusProxyProvider);
  }
}

