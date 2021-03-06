package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.EditModeController;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.interactor.UseCaseParametrized;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InteractorModule_ProvideSetEditModeUseCaseFactory implements Factory<UseCaseParametrized<Boolean>> {
  private final InteractorModule module;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<EditModeController> editModeControllerProvider;

  public InteractorModule_ProvideSetEditModeUseCaseFactory(InteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<EditModeController> editModeControllerProvider) {  
    assert module != null;
    this.module = module;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert editModeControllerProvider != null;
    this.editModeControllerProvider = editModeControllerProvider;
  }

  @Override
  public UseCaseParametrized<Boolean> get() {  
    UseCaseParametrized<Boolean> provided = module.provideSetEditModeUseCase(threadExecutorProvider.get(), postExecutionThreadProvider.get(), editModeControllerProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UseCaseParametrized<Boolean>> create(InteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<EditModeController> editModeControllerProvider) {  
    return new InteractorModule_ProvideSetEditModeUseCaseFactory(module, threadExecutorProvider, postExecutionThreadProvider, editModeControllerProvider);
  }
}

