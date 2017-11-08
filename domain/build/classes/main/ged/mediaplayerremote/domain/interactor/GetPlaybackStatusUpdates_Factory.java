package ged.mediaplayerremote.domain.interactor;

import dagger.MembersInjector;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.PlaybackStatusProxy;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GetPlaybackStatusUpdates_Factory implements Factory<GetPlaybackStatusUpdates> {
  private final MembersInjector<GetPlaybackStatusUpdates> membersInjector;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<PlaybackStatusProxy> playbackStatusProxyProvider;

  public GetPlaybackStatusUpdates_Factory(MembersInjector<GetPlaybackStatusUpdates> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<PlaybackStatusProxy> playbackStatusProxyProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert playbackStatusProxyProvider != null;
    this.playbackStatusProxyProvider = playbackStatusProxyProvider;
  }

  @Override
  public GetPlaybackStatusUpdates get() {  
    GetPlaybackStatusUpdates instance = new GetPlaybackStatusUpdates(threadExecutorProvider.get(), postExecutionThreadProvider.get(), playbackStatusProxyProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<GetPlaybackStatusUpdates> create(MembersInjector<GetPlaybackStatusUpdates> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<PlaybackStatusProxy> playbackStatusProxyProvider) {  
    return new GetPlaybackStatusUpdates_Factory(membersInjector, threadExecutorProvider, postExecutionThreadProvider, playbackStatusProxyProvider);
  }
}

