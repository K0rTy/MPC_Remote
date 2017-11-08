package ged.mediaplayerremote.data.repository;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.entity.mapper.ServerEntityDataMapper;
import ged.mediaplayerremote.data.network.ServerFinder;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ServerDataRepository_Factory implements Factory<ServerDataRepository> {
  private final Provider<ServerEntityDataMapper> serverEntityDataMapperProvider;
  private final Provider<ServerFinder> serverFinderProvider;

  public ServerDataRepository_Factory(Provider<ServerEntityDataMapper> serverEntityDataMapperProvider, Provider<ServerFinder> serverFinderProvider) {  
    assert serverEntityDataMapperProvider != null;
    this.serverEntityDataMapperProvider = serverEntityDataMapperProvider;
    assert serverFinderProvider != null;
    this.serverFinderProvider = serverFinderProvider;
  }

  @Override
  public ServerDataRepository get() {  
    return new ServerDataRepository(serverEntityDataMapperProvider.get(), serverFinderProvider.get());
  }

  public static Factory<ServerDataRepository> create(Provider<ServerEntityDataMapper> serverEntityDataMapperProvider, Provider<ServerFinder> serverFinderProvider) {  
    return new ServerDataRepository_Factory(serverEntityDataMapperProvider, serverFinderProvider);
  }
}

