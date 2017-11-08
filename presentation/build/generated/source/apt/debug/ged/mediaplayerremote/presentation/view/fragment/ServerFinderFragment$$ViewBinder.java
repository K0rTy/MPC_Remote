// Generated code from Butter Knife. Do not modify!
package ged.mediaplayerremote.presentation.view.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ServerFinderFragment$$ViewBinder<T extends ServerFinderFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends ServerFinderFragment> implements Unbinder {
    protected T target;

    private View view2131624106;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.loading = finder.findRequiredViewAsType(source, 2131624104, "field 'loading'", ProgressBar.class);
      target.recyclerView = finder.findRequiredViewAsType(source, 2131624105, "field 'recyclerView'", RecyclerView.class);
      view = finder.findRequiredView(source, 2131624106, "field 'fab' and method 'fabOnClick'");
      target.fab = finder.castView(view, 2131624106, "field 'fab'");
      view2131624106 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.fabOnClick();
        }
      });
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.loading = null;
      target.recyclerView = null;
      target.fab = null;

      view2131624106.setOnClickListener(null);
      view2131624106 = null;

      this.target = null;
    }
  }
}
