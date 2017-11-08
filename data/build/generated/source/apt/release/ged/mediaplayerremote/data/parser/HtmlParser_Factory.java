package ged.mediaplayerremote.data.parser;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum HtmlParser_Factory implements Factory<HtmlParser> {
INSTANCE;

  @Override
  public HtmlParser get() {  
    return new HtmlParser();
  }

  public static Factory<HtmlParser> create() {  
    return INSTANCE;
  }
}

