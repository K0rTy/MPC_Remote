package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.repository.ServerDataRepository;
import ged.mediaplayerremote.domain.repository.ServerRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideServerRepositoryFactory implements Factory<ServerRepository> {
  private final ApplicationModule module;
  private final Provider<ServerDataRepository> serverDataRepositoryProvider;

  public ApplicationModule_ProvideServerRepositoryFactory(ApplicationModule module, Provider<ServerDataRepository> serverDataRepositoryProvider) {  
    assert module != null;
    this.module = module;
    assert serverDataRepositoryProvider != null;
    this.serverDataRepositoryProvider = serverDataRepositoryProvider;
  }

  @Override
  public ServerRepository get() {  
    ServerRepository provided = module.provideServerRepository(serverDataRepositoryProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ServerRepository> create(ApplicationModule module, Provider<ServerDataRepository> serverDataRepositoryProvider) {  
    return new ApplicationModule_ProvideServerRepositoryFactory(module, serverDataRepositoryProvider);
  }
}

