package ged.mediaplayerremote.domain.interactor;

import dagger.MembersInjector;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.repository.ServerRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FindServers_Factory implements Factory<FindServers> {
  private final MembersInjector<FindServers> membersInjector;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<ServerRepository> serverRepositoryProvider;

  public FindServers_Factory(MembersInjector<FindServers> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<ServerRepository> serverRepositoryProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert serverRepositoryProvider != null;
    this.serverRepositoryProvider = serverRepositoryProvider;
  }

  @Override
  public FindServers get() {  
    FindServers instance = new FindServers(threadExecutorProvider.get(), postExecutionThreadProvider.get(), serverRepositoryProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<FindServers> create(MembersInjector<FindServers> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<ServerRepository> serverRepositoryProvider) {  
    return new FindServers_Factory(membersInjector, threadExecutorProvider, postExecutionThreadProvider, serverRepositoryProvider);
  }
}

