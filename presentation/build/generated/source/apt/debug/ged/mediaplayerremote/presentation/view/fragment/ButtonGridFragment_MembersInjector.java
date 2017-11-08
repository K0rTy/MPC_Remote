package ged.mediaplayerremote.presentation.view.fragment;

import dagger.MembersInjector;
import ged.mediaplayerremote.presentation.presenter.ButtonGridPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ButtonGridFragment_MembersInjector implements MembersInjector<ButtonGridFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<ButtonGridPresenter> buttonGridPresenterProvider;

  public ButtonGridFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<ButtonGridPresenter> buttonGridPresenterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert buttonGridPresenterProvider != null;
    this.buttonGridPresenterProvider = buttonGridPresenterProvider;
  }

  @Override
  public void injectMembers(ButtonGridFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.buttonGridPresenter = buttonGridPresenterProvider.get();
  }

  public static MembersInjector<ButtonGridFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<ButtonGridPresenter> buttonGridPresenterProvider) {  
      return new ButtonGridFragment_MembersInjector(supertypeInjector, buttonGridPresenterProvider);
  }
}

