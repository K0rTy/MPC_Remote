package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.interactor.UseCase;
import ged.mediaplayerremote.domain.repository.ServerRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InteractorModule_ProvideFindServersUseCaseFactory implements Factory<UseCase> {
  private final InteractorModule module;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<ServerRepository> serverRepositoryProvider;

  public InteractorModule_ProvideFindServersUseCaseFactory(InteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<ServerRepository> serverRepositoryProvider) {  
    assert module != null;
    this.module = module;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert serverRepositoryProvider != null;
    this.serverRepositoryProvider = serverRepositoryProvider;
  }

  @Override
  public UseCase get() {  
    UseCase provided = module.provideFindServersUseCase(threadExecutorProvider.get(), postExecutionThreadProvider.get(), serverRepositoryProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UseCase> create(InteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<ServerRepository> serverRepositoryProvider) {  
    return new InteractorModule_ProvideFindServersUseCaseFactory(module, threadExecutorProvider, postExecutionThreadProvider, serverRepositoryProvider);
  }
}

