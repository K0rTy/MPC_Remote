package ged.mediaplayerremote.presentation.presenter;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.interactor.UseCase;
import ged.mediaplayerremote.presentation.model.mapper.ServerModelMapper;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ServerFinderPresenter_Factory implements Factory<ServerFinderPresenter> {
  private final Provider<UseCase> findServersUseCaseProvider;
  private final Provider<ServerModelMapper> mapperProvider;

  public ServerFinderPresenter_Factory(Provider<UseCase> findServersUseCaseProvider, Provider<ServerModelMapper> mapperProvider) {  
    assert findServersUseCaseProvider != null;
    this.findServersUseCaseProvider = findServersUseCaseProvider;
    assert mapperProvider != null;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public ServerFinderPresenter get() {  
    return new ServerFinderPresenter(findServersUseCaseProvider.get(), mapperProvider.get());
  }

  public static Factory<ServerFinderPresenter> create(Provider<UseCase> findServersUseCaseProvider, Provider<ServerModelMapper> mapperProvider) {  
    return new ServerFinderPresenter_Factory(findServersUseCaseProvider, mapperProvider);
  }
}

