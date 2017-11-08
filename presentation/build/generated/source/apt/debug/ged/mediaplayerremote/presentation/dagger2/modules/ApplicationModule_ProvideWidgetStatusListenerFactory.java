package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.presentation.view.widget.WidgetProvider;
import ged.mediaplayerremote.presentation.view.widget.WidgetStatusListener;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideWidgetStatusListenerFactory implements Factory<WidgetStatusListener> {
  private final ApplicationModule module;
  private final Provider<WidgetProvider> widgetProvider;

  public ApplicationModule_ProvideWidgetStatusListenerFactory(ApplicationModule module, Provider<WidgetProvider> widgetProvider) {  
    assert module != null;
    this.module = module;
    assert widgetProvider != null;
    this.widgetProvider = widgetProvider;
  }

  @Override
  public WidgetStatusListener get() {  
    WidgetStatusListener provided = module.provideWidgetStatusListener(widgetProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<WidgetStatusListener> create(ApplicationModule module, Provider<WidgetProvider> widgetProvider) {  
    return new ApplicationModule_ProvideWidgetStatusListenerFactory(module, widgetProvider);
  }
}

