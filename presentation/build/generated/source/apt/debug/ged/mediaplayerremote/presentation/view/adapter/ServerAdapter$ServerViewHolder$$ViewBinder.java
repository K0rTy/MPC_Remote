// Generated code from Butter Knife. Do not modify!
package ged.mediaplayerremote.presentation.view.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ServerAdapter$ServerViewHolder$$ViewBinder<T extends ServerAdapter.ServerViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends ServerAdapter.ServerViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.ip = finder.findRequiredViewAsType(source, 2131624110, "field 'ip'", TextView.class);
      target.hostname = finder.findRequiredViewAsType(source, 2131624109, "field 'hostname'", TextView.class);
      target.icon = finder.findRequiredViewAsType(source, 2131624108, "field 'icon'", ImageView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.ip = null;
      target.hostname = null;
      target.icon = null;

      this.target = null;
    }
  }
}
