package ged.mediaplayerremote.data.entity.mapper;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class RemoteDirectoryEntityDataMapper_Factory implements Factory<RemoteDirectoryEntityDataMapper> {
  private final Provider<RemoteFileEntityDataMapper> mRemoteFileEntityDataMapperProvider;

  public RemoteDirectoryEntityDataMapper_Factory(Provider<RemoteFileEntityDataMapper> mRemoteFileEntityDataMapperProvider) {  
    assert mRemoteFileEntityDataMapperProvider != null;
    this.mRemoteFileEntityDataMapperProvider = mRemoteFileEntityDataMapperProvider;
  }

  @Override
  public RemoteDirectoryEntityDataMapper get() {  
    return new RemoteDirectoryEntityDataMapper(mRemoteFileEntityDataMapperProvider.get());
  }

  public static Factory<RemoteDirectoryEntityDataMapper> create(Provider<RemoteFileEntityDataMapper> mRemoteFileEntityDataMapperProvider) {  
    return new RemoteDirectoryEntityDataMapper_Factory(mRemoteFileEntityDataMapperProvider);
  }
}

