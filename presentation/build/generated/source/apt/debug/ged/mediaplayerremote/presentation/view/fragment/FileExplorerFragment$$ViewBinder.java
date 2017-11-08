// Generated code from Butter Knife. Do not modify!
package ged.mediaplayerremote.presentation.view.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FileExplorerFragment$$ViewBinder<T extends FileExplorerFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends FileExplorerFragment> implements Unbinder {
    protected T target;

    private View view2131624052;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.location = finder.findRequiredViewAsType(source, 2131624049, "field 'location'", TextView.class);
      target.loading = finder.findRequiredViewAsType(source, 2131624050, "field 'loading'", ProgressBar.class);
      target.recyclerView = finder.findRequiredViewAsType(source, 2131624051, "field 'recyclerView'", RecyclerView.class);
      view = finder.findRequiredView(source, 2131624052, "method 'refreshFloatingButtonOnClick'");
      view2131624052 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.refreshFloatingButtonOnClick();
        }
      });
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.location = null;
      target.loading = null;
      target.recyclerView = null;

      view2131624052.setOnClickListener(null);
      view2131624052 = null;

      this.target = null;
    }
  }
}
