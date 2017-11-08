package ged.mediaplayerremote.domain.interactor;

import dagger.MembersInjector;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LoadFile_Factory implements Factory<LoadFile> {
  private final MembersInjector<LoadFile> membersInjector;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<MpcClientRepository> mpcClientRepositoryProvider;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;

  public LoadFile_Factory(MembersInjector<LoadFile> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
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
  public LoadFile get() {  
    LoadFile instance = new LoadFile(threadExecutorProvider.get(), postExecutionThreadProvider.get(), mpcClientRepositoryProvider.get(), userPreferencesRepositoryProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<LoadFile> create(MembersInjector<LoadFile> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<MpcClientRepository> mpcClientRepositoryProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    return new LoadFile_Factory(membersInjector, threadExecutorProvider, postExecutionThreadProvider, mpcClientRepositoryProvider, userPreferencesRepositoryProvider);
  }
}

