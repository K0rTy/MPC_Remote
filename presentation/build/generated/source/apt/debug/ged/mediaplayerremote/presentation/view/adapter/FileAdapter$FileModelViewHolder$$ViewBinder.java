// Generated code from Butter Knife. Do not modify!
package ged.mediaplayerremote.presentation.view.adapter;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FileAdapter$FileModelViewHolder$$ViewBinder<T extends FileAdapter.FileModelViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends FileAdapter.FileModelViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.fileEntityLayout = finder.findRequiredViewAsType(source, 2131624053, "field 'fileEntityLayout'", RelativeLayout.class);
      target.fileName = finder.findRequiredViewAsType(source, 2131624055, "field 'fileName'", TextView.class);
      target.fileIcon = finder.findRequiredViewAsType(source, 2131624054, "field 'fileIcon'", ImageView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.fileEntityLayout = null;
      target.fileName = null;
      target.fileIcon = null;

      this.target = null;
    }
  }
}
