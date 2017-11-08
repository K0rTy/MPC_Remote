package ged.mediaplayerremote.domain.interactor;

import dagger.MembersInjector;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.EditModeController;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GetEditModeUpdates_Factory implements Factory<GetEditModeUpdates> {
  private final MembersInjector<GetEditModeUpdates> membersInjector;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<EditModeController> editModeControllerProvider;

  public GetEditModeUpdates_Factory(MembersInjector<GetEditModeUpdates> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<EditModeController> editModeControllerProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert editModeControllerProvider != null;
    this.editModeControllerProvider = editModeControllerProvider;
  }

  @Override
  public GetEditModeUpdates get() {  
    GetEditModeUpdates instance = new GetEditModeUpdates(threadExecutorProvider.get(), postExecutionThreadProvider.get(), editModeControllerProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<GetEditModeUpdates> create(MembersInjector<GetEditModeUpdates> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<EditModeController> editModeControllerProvider) {  
    return new GetEditModeUpdates_Factory(membersInjector, threadExecutorProvider, postExecutionThreadProvider, editModeControllerProvider);
  }
}

