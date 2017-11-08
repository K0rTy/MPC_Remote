package ged.mediaplayerremote.presentation.view.widget;

import android.content.Context;
import dagger.internal.Factory;
import ged.mediaplayerremote.presentation.presenter.WidgetPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class WidgetProvider_Factory implements Factory<WidgetProvider> {
  private final Provider<Context> contextProvider;
  private final Provider<WidgetPresenter> widgetPresenterProvider;

  public WidgetProvider_Factory(Provider<Context> contextProvider, Provider<WidgetPresenter> widgetPresenterProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert widgetPresenterProvider != null;
    this.widgetPresenterProvider = widgetPresenterProvider;
  }

  @Override
  public WidgetProvider get() {  
    return new WidgetProvider(contextProvider.get(), widgetPresenterProvider.get());
  }

  public static Factory<WidgetProvider> create(Provider<Context> contextProvider, Provider<WidgetPresenter> widgetPresenterProvider) {  
    return new WidgetProvider_Factory(contextProvider, widgetPresenterProvider);
  }
}

