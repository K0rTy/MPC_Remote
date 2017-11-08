package ged.mediaplayerremote.data.network;

import android.content.res.Resources;
import dagger.internal.Factory;
import ged.mediaplayerremote.data.parser.HtmlParser;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MpcApi_Factory implements Factory<MpcApi> {
  private final Provider<UserPreferencesRepository> userPreferencesProvider;
  private final Provider<HtmlParser> htmlParserProvider;
  private final Provider<Resources> resourcesProvider;

  public MpcApi_Factory(Provider<UserPreferencesRepository> userPreferencesProvider, Provider<HtmlParser> htmlParserProvider, Provider<Resources> resourcesProvider) {  
    assert userPreferencesProvider != null;
    this.userPreferencesProvider = userPreferencesProvider;
    assert htmlParserProvider != null;
    this.htmlParserProvider = htmlParserProvider;
    assert resourcesProvider != null;
    this.resourcesProvider = resourcesProvider;
  }

  @Override
  public MpcApi get() {  
    return new MpcApi(userPreferencesProvider.get(), htmlParserProvider.get(), resourcesProvider.get());
  }

  public static Factory<MpcApi> create(Provider<UserPreferencesRepository> userPreferencesProvider, Provider<HtmlParser> htmlParserProvider, Provider<Resources> resourcesProvider) {  
    return new MpcApi_Factory(userPreferencesProvider, htmlParserProvider, resourcesProvider);
  }
}

