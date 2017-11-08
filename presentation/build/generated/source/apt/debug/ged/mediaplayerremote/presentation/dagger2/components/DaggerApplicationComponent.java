package ged.mediaplayerremote.presentation.dagger2.components;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import ged.mediaplayerremote.AndroidApplication;
import ged.mediaplayerremote.UIThread_Factory;
import ged.mediaplayerremote.data.entity.mapper.RemoteDirectoryEntityDataMapper;
import ged.mediaplayerremote.data.entity.mapper.RemoteDirectoryEntityDataMapper_Factory;
import ged.mediaplayerremote.data.entity.mapper.RemoteFileEntityDataMapper;
import ged.mediaplayerremote.data.entity.mapper.RemoteFileEntityDataMapper_Factory;
import ged.mediaplayerremote.data.entity.mapper.ServerEntityDataMapper_Factory;
import ged.mediaplayerremote.data.entity.mapper.StatusEntityDataMapper;
import ged.mediaplayerremote.data.entity.mapper.StatusEntityDataMapper_Factory;
import ged.mediaplayerremote.data.executor.JobExecutor_Factory;
import ged.mediaplayerremote.data.network.MpcApi;
import ged.mediaplayerremote.data.network.ServerFinder;
import ged.mediaplayerremote.data.network.ServerFinder_Factory;
import ged.mediaplayerremote.data.parser.HtmlParser_Factory;
import ged.mediaplayerremote.data.repository.ButtonDataRepository;
import ged.mediaplayerremote.data.repository.ButtonDataRepository_Factory;
import ged.mediaplayerremote.data.repository.ServerDataRepository;
import ged.mediaplayerremote.data.repository.ServerDataRepository_Factory;
import ged.mediaplayerremote.data.repository.SharedPreferencesRepositoryImpl;
import ged.mediaplayerremote.data.repository.SharedPreferencesRepositoryImpl_Factory;
import ged.mediaplayerremote.data.repository.datasource.ButtonDataStore;
import ged.mediaplayerremote.data.repository.datasource.SharedPrefsButtonDataStore;
import ged.mediaplayerremote.data.repository.datasource.SharedPrefsButtonDataStore_Factory;
import ged.mediaplayerremote.domain.controller.CommandDispatcher;
import ged.mediaplayerremote.domain.controller.CommandDispatcher_Factory;
import ged.mediaplayerremote.domain.controller.EditModeController;
import ged.mediaplayerremote.domain.controller.EditModeController_Factory;
import ged.mediaplayerremote.domain.controller.PlaybackStatusProxy;
import ged.mediaplayerremote.domain.controller.ServerSettingsChangedListener;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import ged.mediaplayerremote.domain.executor.ThreadExecutor;
import ged.mediaplayerremote.domain.interactor.UseCase;
import ged.mediaplayerremote.domain.repository.ButtonRepository;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import ged.mediaplayerremote.domain.repository.ServerRepository;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ButtonDataStoreFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideApplicationContextFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideButtonRepositoryFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideClientMpcFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideMPCApiFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvidePlaybackStatusProxyFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvidePostExecutionThreadFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideServerRepositoryFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideServerSettingsChangedListenerFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideThreadExecutorFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideUserPreferencesRepositoryFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.ApplicationModule_ProvideWidgetStatusListenerFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.WidgetInteractorModule;
import ged.mediaplayerremote.presentation.dagger2.modules.WidgetInteractorModule_ProvideFastForwardUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.WidgetInteractorModule_ProvideGetPlaybackStatusUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.WidgetInteractorModule_ProvidePlayPauseUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.WidgetInteractorModule_ProvideReconnectUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.WidgetInteractorModule_ProvideRewindUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.WidgetInteractorModule_ProvideVolumeDownUseCaseFactory;
import ged.mediaplayerremote.presentation.dagger2.modules.WidgetInteractorModule_ProvideVolumeUpUseCaseFactory;
import ged.mediaplayerremote.presentation.model.mapper.PlaybackStatusModelMapper;
import ged.mediaplayerremote.presentation.model.mapper.PlaybackStatusModelMapper_Factory;
import ged.mediaplayerremote.presentation.model.mapper.RemoteDirectoryModelMapper;
import ged.mediaplayerremote.presentation.model.mapper.RemoteDirectoryModelMapper_Factory;
import ged.mediaplayerremote.presentation.model.mapper.RemoteFileModelMapper;
import ged.mediaplayerremote.presentation.model.mapper.RemoteFileModelMapper_Factory;
import ged.mediaplayerremote.presentation.navigation.Navigator;
import ged.mediaplayerremote.presentation.navigation.Navigator_Factory;
import ged.mediaplayerremote.presentation.presenter.WidgetPresenter;
import ged.mediaplayerremote.presentation.presenter.WidgetPresenter_Factory;
import ged.mediaplayerremote.presentation.view.activity.BaseActivity;
import ged.mediaplayerremote.presentation.view.activity.BaseActivity_MembersInjector;
import ged.mediaplayerremote.presentation.view.widget.WidgetProvider;
import ged.mediaplayerremote.presentation.view.widget.WidgetProvider_Factory;
import ged.mediaplayerremote.presentation.view.widget.WidgetStatusListener;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Context> provideApplicationContextProvider;
  private Provider<SharedPreferencesRepositoryImpl> sharedPreferencesRepositoryImplProvider;
  private Provider<UserPreferencesRepository> provideUserPreferencesRepositoryProvider;
  private Provider<MpcApi> provideMPCApiProvider;
  private Provider<StatusEntityDataMapper> statusEntityDataMapperProvider;
  private Provider<RemoteFileEntityDataMapper> remoteFileEntityDataMapperProvider;
  private Provider<RemoteDirectoryEntityDataMapper> remoteDirectoryEntityDataMapperProvider;
  private Provider<MpcClientRepository> provideClientMpcProvider;
  private Provider<ThreadExecutor> provideThreadExecutorProvider;
  private Provider<PostExecutionThread> providePostExecutionThreadProvider;
  private Provider<PlaybackStatusProxy> providePlaybackStatusProxyProvider;
  private Provider<Navigator> navigatorProvider;
  private Provider<CommandDispatcher> commandDispatcherProvider;
  private Provider<UseCase> providePlayPauseUseCaseProvider;
  private Provider<UseCase> provideFastForwardUseCaseProvider;
  private Provider<UseCase> provideRewindUseCaseProvider;
  private Provider<UseCase> provideVolumeDownUseCaseProvider;
  private Provider<UseCase> provideVolumeUpUseCaseProvider;
  private Provider<UseCase> provideGetPlaybackStatusUseCaseProvider;
  private Provider<UseCase> provideReconnectUseCaseProvider;
  private Provider<WidgetPresenter> widgetPresenterProvider;
  private Provider<WidgetProvider> widgetProvider;
  private MembersInjector<BaseActivity> baseActivityMembersInjector;
  private Provider<SharedPrefsButtonDataStore> sharedPrefsButtonDataStoreProvider;
  private Provider<ButtonDataStore> buttonDataStoreProvider;
  private Provider<ButtonDataRepository> buttonDataRepositoryProvider;
  private Provider<ButtonRepository> provideButtonRepositoryProvider;
  private Provider<ServerFinder> serverFinderProvider;
  private Provider<ServerDataRepository> serverDataRepositoryProvider;
  private Provider<ServerRepository> provideServerRepositoryProvider;
  private Provider<EditModeController> editModeControllerProvider;
  private Provider<ServerSettingsChangedListener> provideServerSettingsChangedListenerProvider;
  private Provider<WidgetStatusListener> provideWidgetStatusListenerProvider;
  private Provider<RemoteFileModelMapper> remoteFileModelMapperProvider;
  private Provider<RemoteDirectoryModelMapper> remoteDirectoryModelMapperProvider;

  private DaggerApplicationComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideApplicationContextProvider = ScopedProvider.create(ApplicationModule_ProvideApplicationContextFactory.create(builder.applicationModule));
    this.sharedPreferencesRepositoryImplProvider = ScopedProvider.create(SharedPreferencesRepositoryImpl_Factory.create(provideApplicationContextProvider));
    this.provideUserPreferencesRepositoryProvider = ScopedProvider.create(ApplicationModule_ProvideUserPreferencesRepositoryFactory.create(builder.applicationModule, sharedPreferencesRepositoryImplProvider));
    this.provideMPCApiProvider = ScopedProvider.create(ApplicationModule_ProvideMPCApiFactory.create(builder.applicationModule, provideUserPreferencesRepositoryProvider, HtmlParser_Factory.create()));
    this.statusEntityDataMapperProvider = ScopedProvider.create(StatusEntityDataMapper_Factory.create());
    this.remoteFileEntityDataMapperProvider = ScopedProvider.create(RemoteFileEntityDataMapper_Factory.create());
    this.remoteDirectoryEntityDataMapperProvider = ScopedProvider.create(RemoteDirectoryEntityDataMapper_Factory.create(remoteFileEntityDataMapperProvider));
    this.provideClientMpcProvider = ScopedProvider.create(ApplicationModule_ProvideClientMpcFactory.create(builder.applicationModule, provideMPCApiProvider, ServerEntityDataMapper_Factory.create(), statusEntityDataMapperProvider, remoteDirectoryEntityDataMapperProvider));
    this.provideThreadExecutorProvider = ScopedProvider.create(ApplicationModule_ProvideThreadExecutorFactory.create(builder.applicationModule, JobExecutor_Factory.create()));
    this.providePostExecutionThreadProvider = ScopedProvider.create(ApplicationModule_ProvidePostExecutionThreadFactory.create(builder.applicationModule, UIThread_Factory.create()));
    this.providePlaybackStatusProxyProvider = ScopedProvider.create(ApplicationModule_ProvidePlaybackStatusProxyFactory.create(builder.applicationModule, provideClientMpcProvider, provideUserPreferencesRepositoryProvider, provideThreadExecutorProvider, providePostExecutionThreadProvider));
    this.navigatorProvider = ScopedProvider.create(Navigator_Factory.create());
    this.commandDispatcherProvider = ScopedProvider.create(CommandDispatcher_Factory.create(provideClientMpcProvider, providePlaybackStatusProxyProvider, provideUserPreferencesRepositoryProvider));
    this.providePlayPauseUseCaseProvider = WidgetInteractorModule_ProvidePlayPauseUseCaseFactory.create(builder.widgetInteractorModule, provideThreadExecutorProvider, providePostExecutionThreadProvider, commandDispatcherProvider);
    this.provideFastForwardUseCaseProvider = WidgetInteractorModule_ProvideFastForwardUseCaseFactory.create(builder.widgetInteractorModule, provideThreadExecutorProvider, providePostExecutionThreadProvider, commandDispatcherProvider);
    this.provideRewindUseCaseProvider = WidgetInteractorModule_ProvideRewindUseCaseFactory.create(builder.widgetInteractorModule, provideThreadExecutorProvider, providePostExecutionThreadProvider, commandDispatcherProvider);
    this.provideVolumeDownUseCaseProvider = WidgetInteractorModule_ProvideVolumeDownUseCaseFactory.create(builder.widgetInteractorModule, provideThreadExecutorProvider, providePostExecutionThreadProvider, commandDispatcherProvider);
    this.provideVolumeUpUseCaseProvider = WidgetInteractorModule_ProvideVolumeUpUseCaseFactory.create(builder.widgetInteractorModule, provideThreadExecutorProvider, providePostExecutionThreadProvider, commandDispatcherProvider);
    this.provideGetPlaybackStatusUseCaseProvider = WidgetInteractorModule_ProvideGetPlaybackStatusUseCaseFactory.create(builder.widgetInteractorModule, provideThreadExecutorProvider, providePostExecutionThreadProvider, providePlaybackStatusProxyProvider);
    this.provideReconnectUseCaseProvider = WidgetInteractorModule_ProvideReconnectUseCaseFactory.create(builder.widgetInteractorModule, provideThreadExecutorProvider, providePostExecutionThreadProvider, providePlaybackStatusProxyProvider);
    this.widgetPresenterProvider = ScopedProvider.create(WidgetPresenter_Factory.create(PlaybackStatusModelMapper_Factory.create(), providePlayPauseUseCaseProvider, provideFastForwardUseCaseProvider, provideRewindUseCaseProvider, provideVolumeDownUseCaseProvider, provideVolumeUpUseCaseProvider, provideGetPlaybackStatusUseCaseProvider, provideReconnectUseCaseProvider));
    this.widgetProvider = ScopedProvider.create(WidgetProvider_Factory.create(provideApplicationContextProvider, widgetPresenterProvider));
    this.baseActivityMembersInjector = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), providePlaybackStatusProxyProvider, navigatorProvider, provideUserPreferencesRepositoryProvider, widgetProvider);
    this.sharedPrefsButtonDataStoreProvider = SharedPrefsButtonDataStore_Factory.create(provideApplicationContextProvider);
    this.buttonDataStoreProvider = ScopedProvider.create(ApplicationModule_ButtonDataStoreFactory.create(builder.applicationModule, sharedPrefsButtonDataStoreProvider));
    this.buttonDataRepositoryProvider = ButtonDataRepository_Factory.create(buttonDataStoreProvider);
    this.provideButtonRepositoryProvider = ScopedProvider.create(ApplicationModule_ProvideButtonRepositoryFactory.create(builder.applicationModule, buttonDataRepositoryProvider));
    this.serverFinderProvider = ServerFinder_Factory.create(provideApplicationContextProvider, provideUserPreferencesRepositoryProvider);
    this.serverDataRepositoryProvider = ServerDataRepository_Factory.create(ServerEntityDataMapper_Factory.create(), serverFinderProvider);
    this.provideServerRepositoryProvider = ScopedProvider.create(ApplicationModule_ProvideServerRepositoryFactory.create(builder.applicationModule, serverDataRepositoryProvider));
    this.editModeControllerProvider = ScopedProvider.create(EditModeController_Factory.create());
    this.provideServerSettingsChangedListenerProvider = ScopedProvider.create(ApplicationModule_ProvideServerSettingsChangedListenerFactory.create(builder.applicationModule, providePlaybackStatusProxyProvider));
    this.provideWidgetStatusListenerProvider = ScopedProvider.create(ApplicationModule_ProvideWidgetStatusListenerFactory.create(builder.applicationModule, widgetProvider));
    this.remoteFileModelMapperProvider = ScopedProvider.create(RemoteFileModelMapper_Factory.create());
    this.remoteDirectoryModelMapperProvider = ScopedProvider.create(RemoteDirectoryModelMapper_Factory.create(remoteFileModelMapperProvider));
  }

  @Override
  public void inject(AndroidApplication androidApplication) {  
    MembersInjectors.noOp().injectMembers(androidApplication);
  }

  @Override
  public void inject(BaseActivity baseActivity) {  
    baseActivityMembersInjector.injectMembers(baseActivity);
  }

  @Override
  public Context context() {  
    return provideApplicationContextProvider.get();
  }

  @Override
  public MpcClientRepository CLIENT_MPC() {  
    return provideClientMpcProvider.get();
  }

  @Override
  public ThreadExecutor threadExecutor() {  
    return provideThreadExecutorProvider.get();
  }

  @Override
  public PostExecutionThread postExecutionThread() {  
    return providePostExecutionThreadProvider.get();
  }

  @Override
  public PlaybackStatusModelMapper PLAYBACK_STATUS_MODEL_MAPPER() {  
    return PlaybackStatusModelMapper_Factory.create().get();
  }

  @Override
  public ButtonRepository BUTTON_REPOSITORY() {  
    return provideButtonRepositoryProvider.get();
  }

  @Override
  public ServerRepository SERVER_REPOSITORY() {  
    return provideServerRepositoryProvider.get();
  }

  @Override
  public UserPreferencesRepository USER_PREFERENCES_REPOSITORY() {  
    return provideUserPreferencesRepositoryProvider.get();
  }

  @Override
  public EditModeController EDIT_MODE_CONTROLLER() {  
    return editModeControllerProvider.get();
  }

  @Override
  public ServerSettingsChangedListener SERVER_SETTINGS_CHANGED_LISTENER() {  
    return provideServerSettingsChangedListenerProvider.get();
  }

  @Override
  public CommandDispatcher COMMAND_DISPATCHER() {  
    return commandDispatcherProvider.get();
  }

  @Override
  public WidgetStatusListener WIDGET_STATUS_LISTENER() {  
    return provideWidgetStatusListenerProvider.get();
  }

  @Override
  public RemoteFileModelMapper REMOTE_FILE_MODEL_MAPPER() {  
    return remoteFileModelMapperProvider.get();
  }

  @Override
  public RemoteDirectoryModelMapper REMOTE_DIRECTORY_MODEL_MAPPER() {  
    return remoteDirectoryModelMapperProvider.get();
  }

  @Override
  public UseCase USE_CASE_PLAYBACK_STATUS() {  
    return provideGetPlaybackStatusUseCaseProvider.get();
  }

  @Override
  public UseCase USE_CASE_PLAY_PAUSE() {  
    return providePlayPauseUseCaseProvider.get();
  }

  @Override
  public UseCase USE_CASE_FAST_FORWARD() {  
    return provideFastForwardUseCaseProvider.get();
  }

  @Override
  public UseCase USE_CASE_REWIND() {  
    return provideRewindUseCaseProvider.get();
  }

  @Override
  public UseCase USE_CASE_VOLUME_DOWN() {  
    return provideVolumeDownUseCaseProvider.get();
  }

  @Override
  public UseCase USE_CASE_VOLUME_UP() {  
    return provideVolumeUpUseCaseProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;
    private WidgetInteractorModule widgetInteractorModule;
  
    private Builder() {  
    }
  
    public ApplicationComponent build() {  
      if (applicationModule == null) {
        throw new IllegalStateException("applicationModule must be set");
      }
      if (widgetInteractorModule == null) {
        this.widgetInteractorModule = new WidgetInteractorModule();
      }
      return new DaggerApplicationComponent(this);
    }
  
    public Builder applicationModule(ApplicationModule applicationModule) {  
      if (applicationModule == null) {
        throw new NullPointerException("applicationModule");
      }
      this.applicationModule = applicationModule;
      return this;
    }
  
    public Builder widgetInteractorModule(WidgetInteractorModule widgetInteractorModule) {  
      if (widgetInteractorModule == null) {
        throw new NullPointerException("widgetInteractorModule");
      }
      this.widgetInteractorModule = widgetInteractorModule;
      return this;
    }
  }
}

