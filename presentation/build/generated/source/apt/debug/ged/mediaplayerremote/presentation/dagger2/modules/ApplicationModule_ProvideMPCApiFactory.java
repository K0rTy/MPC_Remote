package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.network.MpcApi;
import ged.mediaplayerremote.data.parser.HtmlParser;
import ged.mediaplayerremote.domain.repository.UserPreferencesRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideMPCApiFactory implements Factory<MpcApi> {
  private final ApplicationModule module;
  private final Provider<UserPreferencesRepository> userPreferencesRepositoryProvider;
  private final Provider<HtmlParser> htmlParserProvider;

  public ApplicationModule_ProvideMPCApiFactory(ApplicationModule module, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider, Provider<HtmlParser> htmlParserProvider) {  
    assert module != null;
    this.module = module;
    assert userPreferencesRepositoryProvider != null;
    this.userPreferencesRepositoryProvider = userPreferencesRepositoryProvider;
    assert htmlParserProvider != null;
    this.htmlParserProvider = htmlParserProvider;
  }

  @Override
  public MpcApi get() {  
    MpcApi provided = module.provideMPCApi(userPreferencesRepositoryProvider.get(), htmlParserProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MpcApi> create(ApplicationModule module, Provider<UserPreferencesRepository> userPreferencesRepositoryProvider, Provider<HtmlParser> htmlParserProvider) {  
    return new ApplicationModule_ProvideMPCApiFactory(module, userPreferencesRepositoryProvider, htmlParserProvider);
  }
}

