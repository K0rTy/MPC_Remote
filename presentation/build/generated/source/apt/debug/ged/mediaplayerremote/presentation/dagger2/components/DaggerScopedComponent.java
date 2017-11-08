package ged.mediaplayerremote.presentation.dagger2.components;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import ged.mediaplayerremote.domain.controller.CommandDispatcher;
import ged.mediaplayerremote.domain.controller.EditModeController;
import ged.mediaplayerremote.domain.controller.ServerSettingsChangedListener;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.interactor.UseCase;
import ged.mediaplayerremote.domain.interactor.UseCaseParametrized;
import ged.mediaplayerremote.domain.model.RemoteFile;
import ged.mediaplayerremote.domain.repository.ButtonRepository;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import ged.mediaplayerremote.domain.repository.ServerRepository;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule_ProvideEditModeListenerUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule_ProvideFindServersUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule_ProvideGetSnapshotUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule_ProvideLoadFileUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule_ProvideSendCommandUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule_ProvideSetEditModeUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule_ProvideSetPositionUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.InteractorModule_ProvideSetVolumeUseCaseFactory;
import ged.mediaplayerremote.presentation.model.mapper.PlaybackStatusModelMapper;
import ged.mediaplayerremote.presentation.model.mapper.RemoteDirectoryModelMapper;
import ged.mediaplayerremote.presentation.model.mapper.RemoteFileModelMapper;
import ged.mediaplayerremote.presentation.model.mapper.ServerModelMapper_Factory;
import ged.mediaplayerremote.presentation.presenter.ButtonGridPresenter;
import ged.mediaplayerremote.presentation.presenter.ButtonGridPresenter_Factory;
import ged.mediaplayerremote.presentation.presenter.FileExplorerPresenter;
import ged.mediaplayerremote.presentation.presenter.FileExplorerPresenter_Factory;
import ged.mediaplayerremote.presentation.presenter.MainPresenter;
import ged.mediaplayerremote.presentation.presenter.MainPresenter_Factory;
import ged.mediaplayerremote.presentation.presenter.ServerFinderPresenter;
import ged.mediaplayerremote.presentation.presenter.ServerFinderPresenter_Factory;
import ged.mediaplayerremote.presentation.view.adapter.ServerAdapter;
import ged.mediaplayerremote.presentation.view.adapter.ServerAdapter_Factory;
import ged.mediaplayerremote.presentation.view.fragment.ButtonGridFragment;
import ged.mediaplayerremote.presentation.view.fragment.ButtonGridFragment_MembersInjector;
import ged.mediaplayerremote.presentation.view.fragment.FileExplorerFragment;
import ged.mediaplayerremote.presentation.view.fragment.FileExplorerFragment_MembersInjector;
import ged.mediaplayerremote.presentation.view.fragment.MainFragment;
import ged.mediaplayerremote.presentation.view.fragment.MainFragment_MembersInjector;
import ged.mediaplayerremote.presentation.view.fragment.ServerFinderFragment;
import ged.mediaplayerremote.presentation.view.fragment.ServerFinderFragment_MembersInjector;
import ged.mediaplayerremote.presentation.view.fragment.SettingsFragment;
import ged.mediaplayerremote.presentation.view.fragment.SettingsFragment_MembersInjector;
import ged.mediaplayerremote.presentation.view.widget.WidgetStatusListener;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerScopedComponent implements ScopedComponent {
  private Provider<ButtonRepository> BUTTON_REPOSITORYProvider;
  private Provider<ThreadExecutor> threadExecutorProvider;
  private Provider<PostExecutionThread> postExecutionThreadProvider;
  private Provider<CommandDispatcher> COMMAND_DISPATCHERProvider;
  private Provider<UseCaseParametrized<Map<String, String>>> provideSendCommandUseCaseProvider;
  private Provider<EditModeController> EDIT_MODE_CONTROLLERProvider;
  private Provider<UseCaseParametrized<Boolean>> provideSetEditModeUseCaseProvider;
  private Provider<UseCase> provideEditModeListenerUseCaseProvider;
  private Provider<ButtonGridPresenter> buttonGridPresenterProvider;
  private MembersInjector<ButtonGridFragment> buttonGridFragmentMembersInjector;
  private Provider<PlaybackStatusModelMapper> PLAYBACK_STATUS_MODEL_MAPPERProvider;
  private Provider<UserPreferencesRepository> USER_PREFERENCES_REPOSITORYProvider;
  private Provider<UseCase> USE_CASE_PLAYBACK_STATUSProvider;
  private Provider<MpcClientRepository> CLIENT_MPCProvider;
  private Provider<UseCase> provideGetSnapshotUseCaseProvider;
  private Provider<UseCase> USE_CASE_PLAY_PAUSEProvider;
  private Provider<UseCase> USE_CASE_FAST_FORWARDProvider;
  private Provider<UseCase> USE_CASE_REWINDProvider;
  private Provider<UseCase> USE_CASE_VOLUME_DOWNProvider;
  private Provider<UseCase> USE_CASE_VOLUME_UPProvider;
  private Provider<UseCaseParametrized<Long>> provideSetPositionUseCaseProvider;
  private Provider<UseCaseParametrized<Integer>> provideSetVolumeUseCaseProvider;
  private Provider<MainPresenter> mainPresenterProvider;
  private MembersInjector<MainFragment> mainFragmentMembersInjector;
  private Provider<UseCaseParametrized<RemoteFile>> provideLoadFileUseCaseProvider;
  private Provider<RemoteDirectoryModelMapper> REMOTE_DIRECTORY_MODEL_MAPPERProvider;
  private Provider<RemoteFileModelMapper> REMOTE_FILE_MODEL_MAPPERProvider;
  private Provider<FileExplorerPresenter> fileExplorerPresenterProvider;
  private MembersInjector<FileExplorerFragment> fileExplorerFragmentMembersInjector;
  private Provider<ServerRepository> SERVER_REPOSITORYProvider;
  private Provider<UseCase> provideFindServersUseCaseProvider;
  private Provider<ServerFinderPresenter> serverFinderPresenterProvider;
  private Provider<Context> contextProvider;
  private Provider<ServerAdapter> serverAdapterProvider;
  private MembersInjector<ServerFinderFragment> serverFinderFragmentMembersInjector;
  private Provider<ServerSettingsChangedListener> SERVER_SETTINGS_CHANGED_LISTENERProvider;
  private Provider<WidgetStatusListener> WIDGET_STATUS_LISTENERProvider;
  private MembersInjector<SettingsFragment> settingsFragmentMembersInjector;

  private DaggerScopedComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.BUTTON_REPOSITORYProvider = new Factory<ButtonRepository>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public ButtonRepository get() {
        ButtonRepository provided = applicationComponent.BUTTON_REPOSITORY();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.threadExecutorProvider = new Factory<ThreadExecutor>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public ThreadExecutor get() {
        ThreadExecutor provided = applicationComponent.threadExecutor();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.postExecutionThreadProvider = new Factory<PostExecutionThread>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public PostExecutionThread get() {
        PostExecutionThread provided = applicationComponent.postExecutionThread();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.COMMAND_DISPATCHERProvider = new Factory<CommandDispatcher>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public CommandDispatcher get() {
        CommandDispatcher provided = applicationComponent.COMMAND_DISPATCHER();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideSendCommandUseCaseProvider = InteractorModule_ProvideSendCommandUseCaseFactory.create(builder.interactorModule, threadExecutorProvider, postExecutionThreadProvider, COMMAND_DISPATCHERProvider);
    this.EDIT_MODE_CONTROLLERProvider = new Factory<EditModeController>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public EditModeController get() {
        EditModeController provided = applicationComponent.EDIT_MODE_CONTROLLER();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideSetEditModeUseCaseProvider = InteractorModule_ProvideSetEditModeUseCaseFactory.create(builder.interactorModule, threadExecutorProvider, postExecutionThreadProvider, EDIT_MODE_CONTROLLERProvider);
    this.provideEditModeListenerUseCaseProvider = InteractorModule_ProvideEditModeListenerUseCaseFactory.create(builder.interactorModule, threadExecutorProvider, postExecutionThreadProvider, EDIT_MODE_CONTROLLERProvider);
    this.buttonGridPresenterProvider = ScopedProvider.create(ButtonGridPresenter_Factory.create(BUTTON_REPOSITORYProvider, provideSendCommandUseCaseProvider, provideSetEditModeUseCaseProvider, provideEditModeListenerUseCaseProvider));
    this.buttonGridFragmentMembersInjector = ButtonGridFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), buttonGridPresenterProvider);
    this.PLAYBACK_STATUS_MODEL_MAPPERProvider = new Factory<PlaybackStatusModelMapper>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public PlaybackStatusModelMapper get() {
        PlaybackStatusModelMapper provided = applicationComponent.PLAYBACK_STATUS_MODEL_MAPPER();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.USER_PREFERENCES_REPOSITORYProvider = new Factory<UserPreferencesRepository>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public UserPreferencesRepository get() {
        UserPreferencesRepository provided = applicationComponent.USER_PREFERENCES_REPOSITORY();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.USE_CASE_PLAYBACK_STATUSProvider = new Factory<UseCase>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public UseCase get() {
        UseCase provided = applicationComponent.USE_CASE_PLAYBACK_STATUS();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.CLIENT_MPCProvider = new Factory<MpcClientRepository>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public MpcClientRepository get() {
        MpcClientRepository provided = applicationComponent.CLIENT_MPC();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideGetSnapshotUseCaseProvider = InteractorModule_ProvideGetSnapshotUseCaseFactory.create(builder.interactorModule, threadExecutorProvider, postExecutionThreadProvider, CLIENT_MPCProvider, USER_PREFERENCES_REPOSITORYProvider);
    this.USE_CASE_PLAY_PAUSEProvider = new Factory<UseCase>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public UseCase get() {
        UseCase provided = applicationComponent.USE_CASE_PLAY_PAUSE();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.USE_CASE_FAST_FORWARDProvider = new Factory<UseCase>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public UseCase get() {
        UseCase provided = applicationComponent.USE_CASE_FAST_FORWARD();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.USE_CASE_REWINDProvider = new Factory<UseCase>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public UseCase get() {
        UseCase provided = applicationComponent.USE_CASE_REWIND();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.USE_CASE_VOLUME_DOWNProvider = new Factory<UseCase>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public UseCase get() {
        UseCase provided = applicationComponent.USE_CASE_VOLUME_DOWN();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.USE_CASE_VOLUME_UPProvider = new Factory<UseCase>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public UseCase get() {
        UseCase provided = applicationComponent.USE_CASE_VOLUME_UP();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideSetPositionUseCaseProvider = InteractorModule_ProvideSetPositionUseCaseFactory.create(builder.interactorModule, threadExecutorProvider, postExecutionThreadProvider, COMMAND_DISPATCHERProvider);
    this.provideSetVolumeUseCaseProvider = InteractorModule_ProvideSetVolumeUseCaseFactory.create(builder.interactorModule, threadExecutorProvider, postExecutionThreadProvider, COMMAND_DISPATCHERProvider);
    this.mainPresenterProvider = ScopedProvider.create(MainPresenter_Factory.create(PLAYBACK_STATUS_MODEL_MAPPERProvider, USER_PREFERENCES_REPOSITORYProvider, BUTTON_REPOSITORYProvider, USE_CASE_PLAYBACK_STATUSProvider, provideGetSnapshotUseCaseProvider, provideEditModeListenerUseCaseProvider, USE_CASE_PLAY_PAUSEProvider, USE_CASE_FAST_FORWARDProvider, USE_CASE_REWINDProvider, USE_CASE_VOLUME_DOWNProvider, USE_CASE_VOLUME_UPProvider, provideSetEditModeUseCaseProvider, provideSetPositionUseCaseProvider, provideSetVolumeUseCaseProvider));
    this.mainFragmentMembersInjector = MainFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), mainPresenterProvider);
    this.provideLoadFileUseCaseProvider = InteractorModule_ProvideLoadFileUseCaseFactory.create(builder.interactorModule, threadExecutorProvider, postExecutionThreadProvider, CLIENT_MPCProvider, USER_PREFERENCES_REPOSITORYProvider);
    this.REMOTE_DIRECTORY_MODEL_MAPPERProvider = new Factory<RemoteDirectoryModelMapper>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public RemoteDirectoryModelMapper get() {
        RemoteDirectoryModelMapper provided = applicationComponent.REMOTE_DIRECTORY_MODEL_MAPPER();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.REMOTE_FILE_MODEL_MAPPERProvider = new Factory<RemoteFileModelMapper>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public RemoteFileModelMapper get() {
        RemoteFileModelMapper provided = applicationComponent.REMOTE_FILE_MODEL_MAPPER();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.fileExplorerPresenterProvider = ScopedProvider.create(FileExplorerPresenter_Factory.create(provideLoadFileUseCaseProvider, REMOTE_DIRECTORY_MODEL_MAPPERProvider, REMOTE_FILE_MODEL_MAPPERProvider));
    this.fileExplorerFragmentMembersInjector = FileExplorerFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), fileExplorerPresenterProvider);
    this.SERVER_REPOSITORYProvider = new Factory<ServerRepository>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public ServerRepository get() {
        ServerRepository provided = applicationComponent.SERVER_REPOSITORY();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.provideFindServersUseCaseProvider = InteractorModule_ProvideFindServersUseCaseFactory.create(builder.interactorModule, threadExecutorProvider, postExecutionThreadProvider, SERVER_REPOSITORYProvider);
    this.serverFinderPresenterProvider = ScopedProvider.create(ServerFinderPresenter_Factory.create(provideFindServersUseCaseProvider, ServerModelMapper_Factory.create()));
    this.contextProvider = new Factory<Context>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public Context get() {
        Context provided = applicationComponent.context();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.serverAdapterProvider = ServerAdapter_Factory.create((MembersInjector) MembersInjectors.noOp(), contextProvider);
    this.serverFinderFragmentMembersInjector = ServerFinderFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), serverFinderPresenterProvider, serverAdapterProvider);
    this.SERVER_SETTINGS_CHANGED_LISTENERProvider = new Factory<ServerSettingsChangedListener>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public ServerSettingsChangedListener get() {
        ServerSettingsChangedListener provided = applicationComponent.SERVER_SETTINGS_CHANGED_LISTENER();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.WIDGET_STATUS_LISTENERProvider = new Factory<WidgetStatusListener>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public WidgetStatusListener get() {
        WidgetStatusListener provided = applicationComponent.WIDGET_STATUS_LISTENER();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.settingsFragmentMembersInjector = SettingsFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), SERVER_SETTINGS_CHANGED_LISTENERProvider, WIDGET_STATUS_LISTENERProvider, USER_PREFERENCES_REPOSITORYProvider);
  }

  @Override
  public void inject(ButtonGridFragment buttonGridFragment) {  
    buttonGridFragmentMembersInjector.injectMembers(buttonGridFragment);
  }

  @Override
  public void inject(MainFragment remoteFragment) {  
    mainFragmentMembersInjector.injectMembers(remoteFragment);
  }

  @Override
  public void inject(FileExplorerFragment fileExplorerFragment) {  
    fileExplorerFragmentMembersInjector.injectMembers(fileExplorerFragment);
  }

  @Override
  public void inject(ServerFinderFragment serverFinderFragment) {  
    serverFinderFragmentMembersInjector.injectMembers(serverFinderFragment);
  }

  @Override
  public void inject(SettingsFragment settingsFragment) {  
    settingsFragmentMembersInjector.injectMembers(settingsFragment);
  }

  public static final class Builder {
    private InteractorModule interactorModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public ScopedComponent build() {  
      if (interactorModule == null) {
        this.interactorModule = new InteractorModule();
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerScopedComponent(this);
    }
  
    public Builder interactorModule(InteractorModule interactorModule) {  
      if (interactorModule == null) {
        throw new NullPointerException("interactorModule");
      }
      this.interactorModule = interactorModule;
      return this;
    }
  
    public Builder applicationComponent(ApplicationComponent applicationComponent) {  
      if (applicationComponent == null) {
        throw new NullPointerException("applicationComponent");
      }
      this.applicationComponent = applicationComponent;
      return this;
    }
  }
}

