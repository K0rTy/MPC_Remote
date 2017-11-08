package ged.mediaplayerremote.presentation.presenter;

import dagger.internal.Factory;
import ged.mediaplayerremote.domain.interactor.UseCaseParametrized;
import ged.mediaplayerremote.domain.model.RemoteFile;
import ged.mediaplayerremote.presentation.model.mapper.RemoteDirectoryModelMapper;
import ged.mediaplayerremote.presentation.model.mapper.RemoteFileModelMapper;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FileExplorerPresenter_Factory implements Factory<FileExplorerPresenter> {
  private final Provider<UseCaseParametrized<RemoteFile>> loadFileUseCaseProvider;
  private final Provider<RemoteDirectoryModelMapper> remoteDirectoryModelMapperProvider;
  private final Provider<RemoteFileModelMapper> remoteFileModelMapperProvider;

  public FileExplorerPresenter_Factory(Provider<UseCaseParametrized<RemoteFile>> loadFileUseCaseProvider, Provider<RemoteDirectoryModelMapper> remoteDirectoryModelMapperProvider, Provider<RemoteFileModelMapper> remoteFileModelMapperProvider) {  
    assert loadFileUseCaseProvider != null;
    this.loadFileUseCaseProvider = loadFileUseCaseProvider;
    assert remoteDirectoryModelMapperProvider != null;
    this.remoteDirectoryModelMapperProvider = remoteDirectoryModelMapperProvider;
    assert remoteFileModelMapperProvider != null;
    this.remoteFileModelMapperProvider = remoteFileModelMapperProvider;
  }

  @Override
  public FileExplorerPresenter get() {  
    return new FileExplorerPresenter(loadFileUseCaseProvider.get(), remoteDirectoryModelMapperProvider.get(), remoteFileModelMapperProvider.get());
  }

  public static Factory<FileExplorerPresenter> create(Provider<UseCaseParametrized<RemoteFile>> loadFileUseCaseProvider, Provider<RemoteDirectoryModelMapper> remoteDirectoryModelMapperProvider, Provider<RemoteFileModelMapper> remoteFileModelMapperProvider) {  
    return new FileExplorerPresenter_Factory(loadFileUseCaseProvider, remoteDirectoryModelMapperProvider, remoteFileModelMapperProvider);
  }
}

