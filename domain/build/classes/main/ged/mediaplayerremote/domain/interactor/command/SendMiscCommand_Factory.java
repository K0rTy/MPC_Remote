package ged.mediaplayerremote.domain.interactor.command;

import dagger.MembersInjector;
import dagger.internal.Factory;
import ged.mediaplayerremote.domain.controller.CommandDispatcher;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SendMiscCommand_Factory implements Factory<SendMiscCommand> {
  private final MembersInjector<SendMiscCommand> membersInjector;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;
  private final Provider<CommandDispatcher> commandDispatcherProvider;

  public SendMiscCommand_Factory(MembersInjector<SendMiscCommand> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<CommandDispatcher> commandDispatcherProvider) {  
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
  public SendMiscCommand get() {  
    SendMiscCommand instance = new SendMiscCommand(threadExecutorProvider.get(), postExecutionThreadProvider.get(), commandDispatcherProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<SendMiscCommand> create(MembersInjector<SendMiscCommand> membersInjector, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider, Provider<CommandDispatcher> commandDispatcherProvider) {  
    return new SendMiscCommand_Factory(membersInjector, threadExecutorProvider, postExecutionThreadProvider, commandDispatcherProvider);
  }
}

