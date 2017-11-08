package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.PlaybackStatusProxy;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.interactor.UseCase;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class WidgetInteractorModule_ProvideReconnectUseCaseFactory implements Factory<UseCase> {
  private final WidgetInteractorModule module;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<PlaybackStatusProxy> playbackStatusProxyProvider;

  public WidgetInteractorModule_ProvideReconnectUseCaseFactory(WidgetInteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<PlaybackStatusProxy> playbackStatusProxyProvider) {  
    assert module != null;
    this.module = module;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert playbackStatusProxyProvider != null;
    this.playbackStatusProxyProvider = playbackStatusProxyProvider;
  }

  @Override
  public UseCase get() {  
    UseCase provided = module.provideReconnectUseCase(threadExecutorProvider.get(), postExecutionThreadProvider.get(), playbackStatusProxyProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UseCase> create(WidgetInteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<PlaybackStatusProxy> playbackStatusProxyProvider) {  
    return new WidgetInteractorModule_ProvideReconnectUseCaseFactory(module, threadExecutorProvider, postExecutionThreadProvider, playbackStatusProxyProvider);
  }
}

