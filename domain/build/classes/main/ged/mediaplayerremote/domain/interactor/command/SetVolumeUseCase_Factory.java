package ged.mediaplayerremote.domain.interactor.command;

import dagger.MembersInjector;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.CommandDispatcher;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SetVolumeUseCase_Factory implements Factory<SetVolumeUseCase> {
  private final MembersInjector<SetVolumeUseCase> membersInjector;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<CommandDispatcher> commandDispatcherProvider;

  public SetVolumeUseCase_Factory(MembersInjector<SetVolumeUseCase> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<CommandDispatcher> commandDispatcherProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
    assert commandDispatcherProvider != null;
    this.commandDispatcherProvider = commandDispatcherProvider;
  }

  @Override
  public SetVolumeUseCase get() {  
    SetVolumeUseCase instance = new SetVolumeUseCase(threadExecutorProvider.get(), postExecutionThreadProvider.get(), commandDispatcherProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<SetVolumeUseCase> create(MembersInjector<SetVolumeUseCase> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<CommandDispatcher> commandDispatcherProvider) {  
    return new SetVolumeUseCase_Factory(membersInjector, threadExecutorProvider, postExecutionThreadProvider, commandDispatcherProvider);
  }
}

