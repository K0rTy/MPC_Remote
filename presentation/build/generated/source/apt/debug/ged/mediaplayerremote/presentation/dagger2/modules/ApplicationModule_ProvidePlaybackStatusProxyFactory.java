package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.PlaybackStatusProxy;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvidePlaybackStatusProxyFactory implements Factory<PlaybackStatusProxy> {
  private final ApplicationModule module;
  private final Provider<MpcClientRepository> mpcClientRepositoryProvider;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  public ApplicationModule_ProvidePlaybackStatusProxyFactory(ApplicationModule module, Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    assert module != null;
    this.module = module;
    assert mpcClientRepositoryProvider != null;
    this.mpcClientRepositoryProvider = mpcClientRepositoryProvider;
    assert userPreferencesRepositoryProvider != null;
    this.userPreferencesRepositoryProvider = userPreferencesRepositoryProvider;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
  }

  @Override
  public PlaybackStatusProxy get() {  
    PlaybackStatusProxy provided = module.providePlaybackStatusProxy(mpcClientRepositoryProvider.get(), userPreferencesRepositoryProvider.get(), threadExecutorProvider.get(), postExecutionThreadProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<PlaybackStatusProxy> create(ApplicationModule module, Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    return new ApplicationModule_ProvidePlaybackStatusProxyFactory(module, mpcClientRepositoryProvider, userPreferencesRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider);
  }
}

