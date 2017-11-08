package ged.mediaplayerremote.domain.interactor.command;

import dagger.MembersInjector;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.CommandDispatcher;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SendPlayPauseCommand_Factory implements Factory<SendPlayPauseCommand> {
  private final MembersInjector<SendPlayPauseCommand> membersInjector;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<CommandDispatcher> commandDispatcherProvider;

  public SendPlayPauseCommand_Factory(MembersInjector<SendPlayPauseCommand> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<CommandDispatcher> commandDispatcherProvider) {  
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
  public SendPlayPauseCommand get() {  
    SendPlayPauseCommand instance = new SendPlayPauseCommand(threadExecutorProvider.get(), postExecutionThreadProvider.get(), commandDispatcherProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<SendPlayPauseCommand> create(MembersInjector<SendPlayPauseCommand> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<CommandDispatcher> commandDispatcherProvider) {  
    return new SendPlayPauseCommand_Factory(membersInjector, threadExecutorProvider, postExecutionThreadProvider, commandDispatcherProvider);
  }
}

