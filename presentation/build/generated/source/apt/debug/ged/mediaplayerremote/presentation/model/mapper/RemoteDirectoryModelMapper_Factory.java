package ged.mediaplayerremote.presentation.model.mapper;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class RemoteDirectoryModelMapper_Factory implements Factory<RemoteDirectoryModelMapper> {
  private final Provider<RemoteFileModelMapper> mRemoteFileMapperProvider;

  public RemoteDirectoryModelMapper_Factory(Provider<RemoteFileModelMapper> mRemoteFileMapperProvider) {  
    assert mRemoteFileMapperProvider != null;
    this.mRemoteFileMapperProvider = mRemoteFileMapperProvider;
  }

  @Override
  public RemoteDirectoryModelMapper get() {  
    return new RemoteDirectoryModelMapper(mRemoteFileMapperProvider.get());
  }

  public static Factory<RemoteDirectoryModelMapper> create(Provider<RemoteFileModelMapper> mRemoteFileMapperProvider) {  
    return new RemoteDirectoryModelMapper_Factory(mRemoteFileMapperProvider);
  }
}

