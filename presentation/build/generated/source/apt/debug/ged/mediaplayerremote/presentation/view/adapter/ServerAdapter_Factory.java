package ged.mediaplayerremote.presentation.view.adapter;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ServerAdapter_Factory implements Factory<ServerAdapter> {
  private final MembersInjector<ServerAdapter> membersInjector;
  private final Provider<Context> contextProvider;

  public ServerAdapter_Factory(MembersInjector<ServerAdapter> membersInjector, Provider<Context> contextProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public ServerAdapter get() {  
    ServerAdapter instance = new ServerAdapter(contextProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<ServerAdapter> create(MembersInjector<ServerAdapter> membersInjector, Provider<Context> contextProvider) {  
    return new ServerAdapter_Factory(membersInjector, contextProvider);
  }
}

