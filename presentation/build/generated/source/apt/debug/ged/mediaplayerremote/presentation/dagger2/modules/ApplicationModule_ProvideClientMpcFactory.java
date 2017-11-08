package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.data.entity.mapper.RemoteDirectoryEntityDataMapper;
import ged.mediaplayerremote.data.entity.mapper.ServerEntityDataMapper;
import ged.mediaplayerremote.data.entity.mapper.StatusEntityDataMapper;
import ged.mediaplayerremote.data.network.MpcApi;
import ged.mediaplayerremote.domain.repository.MpcClientRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideClientMpcFactory implements Factory<MpcClientRepository> {
  private final ApplicationModule module;
  private final Provider<MpcApi> mpcApiProvider;
  private final Provider<ServerEntityDataMapper> serverEntityDataMapperProvider;
  private final Provider<StatusEntityDataMapper> statusEntityDataMapperProvider;
  private final Provider<RemoteDirectoryEntityDataMapper> remoteDirectoryEntityDataMapperProvider;

  public ApplicationModule_ProvideClientMpcFactory(ApplicationModule module, Provider<MpcApi> mpcApiProvider, Provider<ServerEntityDataMapper> serverEntityDataMapperProvider, Provider<StatusEntityDataMapper> statusEntityDataMapperProvider, Provider<RemoteDirectoryEntityDataMapper> remoteDirectoryEntityDataMapperProvider) {  
    assert module != null;
    this.module = module;
    assert mpcApiProvider != null;
    this.mpcApiProvider = mpcApiProvider;
    assert serverEntityDataMapperProvider != null;
    this.serverEntityDataMapperProvider = serverEntityDataMapperProvider;
    assert statusEntityDataMapperProvider != null;
    this.statusEntityDataMapperProvider = statusEntityDataMapperProvider;
    assert remoteDirectoryEntityDataMapperProvider != null;
    this.remoteDirectoryEntityDataMapperProvider = remoteDirectoryEntityDataMapperProvider;
  }

  @Override
  public MpcClientRepository get() {  
    MpcClientRepository provided = module.provideClientMpc(mpcApiProvider.get(), serverEntityDataMapperProvider.get(), statusEntityDataMapperProvider.get(), remoteDirectoryEntityDataMapperProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MpcClientRepository> create(ApplicationModule module, Provider<MpcApi> mpcApiProvider, Provider<ServerEntityDataMapper> serverEntityDataMapperProvider, Provider<StatusEntityDataMapper> statusEntityDataMapperProvider, Provider<RemoteDirectoryEntityDataMapper> remoteDirectoryEntityDataMapperProvider) {  
    return new ApplicationModule_ProvideClientMpcFactory(module, mpcApiProvider, serverEntityDataMapperProvider, statusEntityDataMapperProvider, remoteDirectoryEntityDataMapperProvider);
  }
}

