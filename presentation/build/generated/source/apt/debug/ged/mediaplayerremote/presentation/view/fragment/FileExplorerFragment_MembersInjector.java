package ged.mediaplayerremote.presentation.view.fragment;

import dagger.MembersInjector;
import ged.mediaplayerremote.presentation.presenter.FileExplorerPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FileExplorerFragment_MembersInjector implements MembersInjector<FileExplorerFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<FileExplorerPresenter> fileExplorerPresenterProvider;

  public FileExplorerFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<FileExplorerPresenter> fileExplorerPresenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert fileExplorerPresenterProvider != null;
    this.fileExplorerPresenterProvider = fileExplorerPresenterProvider;
  }

  @Override
  public void injectMembers(FileExplorerFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.fileExplorerPresenter = fileExplorerPresenterProvider.get();
  }

  public static MembersInjector<FileExplorerFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<FileExplorerPresenter> fileExplorerPresenterProvider) {  
      return new FileExplorerFragment_MembersInjector(supertypeInjector, fileExplorerPresenterProvider);
  }
}

