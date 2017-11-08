package ged.mediaplayerremote.presentation.view.fragment;

import dagger.MembersInjector;
import ged.mediaplayerremote.presentation.presenter.ServerFinderPresenter;
import ged.mediaplayerremote.presentation.view.adapter.ServerAdapter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ServerFinderFragment_MembersInjector implements MembersInjector<ServerFinderFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<ServerFinderPresenter> serverFinderPresenterProvider;
  private final Provider<ServerAdapter> serverAdapterProvider;

  public ServerFinderFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<ServerFinderPresenter> serverFinderPresenterProvider, Provider<ServerAdapter> serverAdapterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert serverFinderPresenterProvider != null;
    this.serverFinderPresenterProvider = serverFinderPresenterProvider;
    assert serverAdapterProvider != null;
    this.serverAdapterProvider = serverAdapterProvider;
  }

  @Override
  public void injectMembers(ServerFinderFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.serverFinderPresenter = serverFinderPresenterProvider.get();
    instance.serverAdapter = serverAdapterProvider.get();
  }

  public static MembersInjector<ServerFinderFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<ServerFinderPresenter> serverFinderPresenterProvider, Provider<ServerAdapter> serverAdapterProvider) {  
      return new ServerFinderFragment_MembersInjector(supertypeInjector, serverFinderPresenterProvider, serverAdapterProvider);
  }
}

