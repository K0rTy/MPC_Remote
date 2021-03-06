package ged.mediaplayerremote.presentation.dagger2.modules;

import dagger.internal.Factory;
import ged.mediaplayerremote.UIThread;
import ged.mediaplayerremote.domain.executor.PostExecutionThread;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvidePostExecutionThreadFactory implements Factory<PostExecutionThread> {
  private final ApplicationModule module;
  private final Provider<UIThread> uiThreadProvider;

  public ApplicationModule_ProvidePostExecutionThreadFactory(ApplicationModule module, Provider<UIThread> uiThreadProvider) {  
    assert module != null;
    this.module = module;
    assert uiThreadProvider != null;
    this.uiThreadProvider = uiThreadProvider;
  }

  @Override
  public PostExecutionThread get() {  
    PostExecutionThread provided = module.providePostExecutionThread(uiThreadProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<PostExecutionThread> create(ApplicationModule module, Provider<UIThread> uiThreadProvider) {  
    return new ApplicationModule_ProvidePostExecutionThreadFactory(module, uiThreadProvider);
  }
}

