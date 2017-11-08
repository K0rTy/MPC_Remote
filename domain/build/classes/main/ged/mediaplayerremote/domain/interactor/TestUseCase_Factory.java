package ged.mediaplayerremote.domain.interactor;

import dagger.MembersInjector;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TestUseCase_Factory implements Factory<TestUseCase> {
  private final MembersInjector<TestUseCase> membersInjector;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<MpcClientRepository> mpcClientRepositoryProvider;

  public TestUseCase_Factory(MembersInjector<TestUseCase> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<MpcClientRepository> mpcClientRepositoryProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert mpcClientRepositoryProvider != null;
    this.mpcClientRepositoryProvider = mpcClientRepositoryProvider;
  }

  @Override
  public TestUseCase get() {  
    TestUseCase instance = new TestUseCase(threadExecutorProvider.get(), postExecutionThreadProvider.get(), mpcClientRepositoryProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<TestUseCase> create(MembersInjector<TestUseCase> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<MpcClientRepository> mpcClientRepositoryProvider) {  
    return new TestUseCase_Factory(membersInjector, threadExecutorProvider, postExecutionThreadProvider, mpcClientRepositoryProvider);
  }
}

