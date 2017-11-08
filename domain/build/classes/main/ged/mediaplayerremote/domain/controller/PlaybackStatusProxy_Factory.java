package ged.mediaplayerremote.domain.controller;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.PlaybackStatusProxy.ApplicationStatus;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class PlaybackStatusProxy_Factory implements Factory<PlaybackStatusProxy> {
  private final Provider<MpcClientRepository> mpcClientRepositoryProvider;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<ApplicationStatus> applicationStatusProvider;

  public PlaybackStatusProxy_Factory(Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<ApplicationStatus> applicationStatusProvider) {  
    assert mpcClientRepositoryProvider != null;
    this.mpcClientRepositoryProvider = mpcClientRepositoryProvider;
    assert userPreferencesRepositoryProvider != null;
    this.userPreferencesRepositoryProvider = userPreferencesRepositoryProvider;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert applicationStatusProvider != null;
    this.applicationStatusProvider = applicationStatusProvider;
  }

  @Override
  public PlaybackStatusProxy get() {  
    return new PlaybackStatusProxy(mpcClientRepositoryProvider.get(), userPreferencesRepositoryProvider.get(), threadExecutorProvider.get(), postExecutionThreadProvider.get(), applicationStatusProvider.get());
  }

  public static Factory<PlaybackStatusProxy> create(Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<ApplicationStatus> applicationStatusProvider) {  
    return new PlaybackStatusProxy_Factory(mpcClientRepositoryProvider, userPreferencesRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider, applicationStatusProvider);
  }
}

