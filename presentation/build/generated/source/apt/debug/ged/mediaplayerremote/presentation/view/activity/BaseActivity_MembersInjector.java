package ged.mediaplayerremote.presentation.view.activity;

import android.support.v7.app.AppCompatActivity;
import dagger.MembersInjector;
import ged.mediaplayerremote.domain.controller.PlaybackStatusProxy;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import ged.mediaplayerremote.presentation.navigation.Navigator;
import ged.mediaplayerremote.presentation.view.widget.WidgetProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final MembersInjector<AppCompatActivity> supertypeInjector;
  private final Provider<PlaybackStatusProxy> playbackStatusProxyProvider;
  private final Provider<Navigator> navigatorProvider;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;
  private final Provider<WidgetProvider> widgetProvider;

  public BaseActivity_MembersInjector(MembersInjector<AppCompatActivity> supertypeInjector, Provider<PlaybackStatusProxy> playbackStatusProxyProvider, Provider<Navigator> navigatorProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider, Provider<WidgetProvider> widgetProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert playbackStatusProxyProvider != null;
    this.playbackStatusProxyProvider = playbackStatusProxyProvider;
    assert navigatorProvider != null;
    this.navigatorProvider = navigatorProvider;
    assert userPreferencesRepositoryProvider != null;
    this.userPreferencesRepositoryProvider = userPreferencesRepositoryProvider;
    assert widgetProvider != null;
    this.widgetProvider = widgetProvider;
  }

  @Override
  public void injectMembers(BaseActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.playbackStatusProxy = playbackStatusProxyProvider.get();
    instance.navigator = navigatorProvider.get();
    instance.userPreferencesRepository = userPreferencesRepositoryProvider.get();
    instance.widgetProvider = widgetProvider.get();
  }

  public static MembersInjector<BaseActivity> create(MembersInjector<AppCompatActivity> supertypeInjector, Provider<PlaybackStatusProxy> playbackStatusProxyProvider, Provider<Navigator> navigatorProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider, Provider<WidgetProvider> widgetProvider) {  
      return new BaseActivity_MembersInjector(supertypeInjector, playbackStatusProxyProvider, navigatorProvider, userPreferencesRepositoryProvider, widgetProvider);
  }
}

