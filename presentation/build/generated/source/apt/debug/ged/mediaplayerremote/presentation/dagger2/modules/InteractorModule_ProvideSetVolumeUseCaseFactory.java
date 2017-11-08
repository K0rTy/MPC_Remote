package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.CommandDispatcher;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.interactor.UseCaseParametrized;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InteractorModule_ProvideSetVolumeUseCaseFactory implements Factory<UseCaseParametrized<Integer>> {
  private final InteractorModule module;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<CommandDispatcher> commandDispatcherProvider;

  public InteractorModule_ProvideSetVolumeUseCaseFactory(InteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<CommandDispatcher> commandDispatcherProvider) {  
    assert module != null;
    this.module = module;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert commandDispatcherProvider != null;
    this.commandDispatcherProvider = commandDispatcherProvider;
  }

  @Override
  public UseCaseParametrized<Integer> get() {  
    UseCaseParametrized<Integer> provided = module.provideSetVolumeUseCase(threadExecutorProvider.get(), postExecutionThreadProvider.get(), commandDispatcherProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UseCaseParametrized<Integer>> create(InteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<CommandDispatcher> commandDispatcherProvider) {  
    return new InteractorModule_ProvideSetVolumeUseCaseFactory(module, threadExecutorProvider, postExecutionThreadProvider, commandDispatcherProvider);
  }
}

