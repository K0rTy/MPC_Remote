package ged.mediaplayerremote.presentation.view.fragment;

import android.preference.PreferenceFragment;
import dagger.MembersInjector;
import ged.mediaplayerremote.domain.controller.ServerSettingsChangedListener;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import ged.mediaplayerremote.presentation.view.widget.WidgetStatusListener;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SettingsFragment_MembersInjector implements MembersInjector<SettingsFragment> {
  private final MembersInjector<PreferenceFragment> supertypeInjector;
  private final Provider<ServerSettingsChangedListener> serverSettingsChangedListenerProvider;
  private final Provider<WidgetStatusListener> widgetStatusListenerProvider;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;

  public SettingsFragment_MembersInjector(MembersInjector<PreferenceFragment> supertypeInjector, Provider<ServerSettingsChangedListener> serverSettingsChangedListenerProvider, Provider<WidgetStatusListener> widgetStatusListenerProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert serverSettingsChangedListenerProvider != null;
    this.serverSettingsChangedListenerProvider = serverSettingsChangedListenerProvider;
    assert widgetStatusListenerProvider != null;
    this.widgetStatusListenerProvider = widgetStatusListenerProvider;
    assert userPreferencesRepositoryProvider != null;
    this.userPreferencesRepositoryProvider = userPreferencesRepositoryProvider;
  }

  @Override
  public void injectMembers(SettingsFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.serverSettingsChangedListener = serverSettingsChangedListenerProvider.get();
    instance.widgetStatusListener = widgetStatusListenerProvider.get();
    instance.userPreferencesRepository = userPreferencesRepositoryProvider.get();
  }

  public static MembersInjector<SettingsFragment> create(MembersInjector<PreferenceFragment> supertypeInjector, Provider<ServerSettingsChangedListener> serverSettingsChangedListenerProvider, Provider<WidgetStatusListener> widgetStatusListenerProvider, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider) {  
      return new SettingsFragment_MembersInjector(supertypeInjector, serverSettingsChangedListenerProvider, widgetStatusListenerProvider, userPreferencesRepositoryProvider);
  }
}

