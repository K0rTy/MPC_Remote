// Generated code from Butter Knife. Do not modify!
package ged.mediaplayerremote.presentation.view.adapter;

import android.support.v7.widget.CardView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ButtonAdapter$ButtonViewHolder$$ViewBinder<T extends ButtonAdapter.ButtonViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends ButtonAdapter.ButtonViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.buttonDescription = finder.findRequiredViewAsType(source, 2131624073, "field 'buttonDescription'", TextView.class);
      target.myself = finder.findRequiredViewAsType(source, 2131624072, "field 'myself'", CardView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.buttonDescription = null;
      target.myself = null;

      this.target = null;
    }
  }
}
