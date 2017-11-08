package ged.mediaplayerremote.presentation.view.fragment;

import dagger.MembersInjector;
import ged.mediaplayerremote.presentation.presenter.MainPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainFragment_MembersInjector implements MembersInjector<MainFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<MainPresenter> mainPresenterProvider;

  public MainFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<MainPresenter> mainPresenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert mainPresenterProvider != null;
    this.mainPresenterProvider = mainPresenterProvider;
  }

  @Override
  public void injectMembers(MainFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.mainPresenter = mainPresenterProvider.get();
  }

  public static MembersInjector<MainFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<MainPresenter> mainPresenterProvider) {  
      return new MainFragment_MembersInjector(supertypeInjector, mainPresenterProvider);
  }
}

