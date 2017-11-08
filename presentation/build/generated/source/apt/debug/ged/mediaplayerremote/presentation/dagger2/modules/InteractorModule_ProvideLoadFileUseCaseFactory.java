package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.interactor.UseCaseParametrized;
import ged.mediaplayerremote.domain.model.RemoteFile;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class InteractorModule_ProvideLoadFileUseCaseFactory implements Factory<UseCaseParametrized<RemoteFile>> {
  private final InteractorModule module;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<MpcClientRepository> mpcClientRepositoryProvider;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;

  public InteractorModule_ProvideLoadFileUseCaseFactory(InteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    assert module != null;
    this.module = module;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert mpcClientRepositoryProvider != null;
    this.mpcClientRepositoryProvider = mpcClientRepositoryProvider;
    assert userPreferencesRepositoryProvider != null;
    this.userPreferencesRepositoryProvider = userPreferencesRepositoryProvider;
  }

  @Override
  public UseCaseParametrized<RemoteFile> get() {  
    UseCaseParametrized<RemoteFile> provided = module.provideLoadFileUseCase(threadExecutorProvider.get(), postExecutionThreadProvider.get(), mpcClientRepositoryProvider.get(), userPreferencesRepositoryProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<UseCaseParametrized<RemoteFile>> create(InteractorModule module, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    return new InteractorModule_ProvideLoadFileUseCaseFactory(module, threadExecutorProvider, postExecutionThreadProvider, mpcClientRepositoryProvider, userPreferencesRepositoryProvider);
  }
}

