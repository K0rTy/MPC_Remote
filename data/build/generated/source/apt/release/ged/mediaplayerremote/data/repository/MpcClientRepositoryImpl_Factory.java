package ged.mediaplayerremote.data.repository;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.entity.mapper.RemoteDirectoryEntityDataMapper;
import ged.mediaplayerremote.data.entity.mapper.ServerEntityDataMapper;
import ged.mediaplayerremote.data.entity.mapper.StatusEntityDataMapper;
import ged.mediaplayerremote.data.network.MpcApi;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MpcClientRepositoryImpl_Factory implements Factory<MpcClientRepositoryImpl> {
  private final Provider<MpcApi> mpcApiProvider;
  private final Provider<ServerEntityDataMapper> serverEntityDataMapperProvider;
  private final Provider<StatusEntityDataMapper> statusEntityDataMapperProvider;
  private final Provider<RemoteDirectoryEntityDataMapper> directoryMapperProvider;

  public MpcClientRepositoryImpl_Factory(Provider<MpcApi> mpcApiProvider, Provider<ServerEntityDataMapper> serverEntityDataMapperProvider, Provider<StatusEntityDataMapper> statusEntityDataMapperProvider, Provider<RemoteDirectoryEntityDataMapper> directoryMapperProvider) {  
    assert mpcApiProvider != null;
    this.mpcApiProvider = mpcApiProvider;
    assert serverEntityDataMapperProvider != null;
    this.serverEntityDataMapperProvider = serverEntityDataMapperProvider;
    assert statusEntityDataMapperProvider != null;
    this.statusEntityDataMapperProvider = statusEntityDataMapperProvider;
    assert directoryMapperProvider != null;
    this.directoryMapperProvider = directoryMapperProvider;
  }

  @Override
  public MpcClientRepositoryImpl get() {  
    return new MpcClientRepositoryImpl(mpcApiProvider.get(), serverEntityDataMapperProvider.get(), statusEntityDataMapperProvider.get(), directoryMapperProvider.get());
  }

  public static Factory<MpcClientRepositoryImpl> create(Provider<MpcApi> mpcApiProvider, Provider<ServerEntityDataMapper> serverEntityDataMapperProvider, Provider<StatusEntityDataMapper> statusEntityDataMapperProvider, Provider<RemoteDirectoryEntityDataMapper> directoryMapperProvider) {  
    return new MpcClientRepositoryImpl_Factory(mpcApiProvider, serverEntityDataMapperProvider, statusEntityDataMapperProvider, directoryMapperProvider);
  }
}

