// Generated code from Butter Knife. Do not modify!
package ged.mediaplayerremote.presentation.view.fragment;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainFragment$$ViewBinder<T extends MainFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends MainFragment> implements Unbinder {
    protected T target;

    private View view2131624086;

    private View view2131624070;

    private View view2131624084;

    private View view2131624085;

    private View view2131624088;

    private View view2131624087;

    private View view2131624069;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.tabLayout = finder.findRequiredViewAsType(source, 2131624071, "field 'tabLayout'", TabLayout.class);
      target.viewPager = finder.findRequiredViewAsType(source, 2131624060, "field 'viewPager'", ViewPager.class);
      target.navDrawerLayout = finder.findRequiredViewAsType(source, 2131624058, "field 'navDrawerLayout'", DrawerLayout.class);
      target.navigationView = finder.findRequiredViewAsType(source, 2131624062, "field 'navigationView'", NavigationView.class);
      target.toolbar = finder.findRequiredViewAsType(source, 2131624063, "field 'toolbar'", Toolbar.class);
      target.positionLabel = finder.findRequiredViewAsType(source, 2131624077, "field 'positionLabel'", TextView.class);
      target.durationLabel = finder.findRequiredViewAsType(source, 2131624079, "field 'durationLabel'", TextView.class);
      target.progressBar = finder.findRequiredViewAsType(source, 2131624078, "field 'progressBar'", SeekBar.class);
      target.snapshotSmall = finder.findRequiredViewAsType(source, 2131624067, "field 'snapshotSmall'", ImageView.class);
      view = finder.findRequiredView(source, 2131624086, "field 'mainButton' and method 'mainButtonOnClick'");
      target.mainButton = finder.castView(view, 2131624086, "field 'mainButton'");
      view2131624086 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.mainButtonOnClick();
        }
      });
      target.title = finder.findRequiredViewAsType(source, 2131624008, "field 'title'", TextView.class);
      target.toolbarLayout = finder.findRequiredViewAsType(source, 2131624065, "field 'toolbarLayout'", RelativeLayout.class);
      view = finder.findRequiredView(source, 2131624070, "field 'editModeMenu' and method 'editModeMenuOnClick'");
      target.editModeMenu = finder.castView(view, 2131624070, "field 'editModeMenu'");
      view2131624070 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.editModeMenuOnClick();
        }
      });
      target.volumeSeekBar = finder.findRequiredViewAsType(source, 2131624082, "field 'volumeSeekBar'", SeekBar.class);
      target.volumeBarTextView = finder.findRequiredViewAsType(source, 2131624083, "field 'volumeBarTextView'", TextView.class);
      target.volumeIcon = finder.findRequiredViewAsType(source, 2131624081, "field 'volumeIcon'", ImageView.class);
      view = finder.findRequiredView(source, 2131624084, "field 'dockRewind' and method 'rewindClick'");
      target.dockRewind = finder.castView(view, 2131624084, "field 'dockRewind'");
      view2131624084 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.rewindClick();
        }
      });
      view = finder.findRequiredView(source, 2131624085, "field 'dockForward' and method 'fastForwardClick'");
      target.dockForward = finder.castView(view, 2131624085, "field 'dockForward'");
      view2131624085 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.fastForwardClick();
        }
      });
      view = finder.findRequiredView(source, 2131624088, "field 'dockVolUp' and method 'volumeUpClick'");
      target.dockVolUp = finder.castView(view, 2131624088, "field 'dockVolUp'");
      view2131624088 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.volumeUpClick();
        }
      });
      view = finder.findRequiredView(source, 2131624087, "field 'dockVolDown' and method 'volumeDownClick'");
      target.dockVolDown = finder.castView(view, 2131624087, "field 'dockVolDown'");
      view2131624087 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.volumeDownClick();
        }
      });
      target.volumeBarLayout = finder.findRequiredViewAsType(source, 2131624080, "field 'volumeBarLayout'", LinearLayout.class);
      target.progressBarLayout = finder.findRequiredViewAsType(source, 2131624076, "field 'progressBarLayout'", LinearLayout.class);
      target.appbarStandardUpperLayout = finder.findRequiredViewAsType(source, 2131624064, "field 'appbarStandardUpperLayout'", RelativeLayout.class);
      target.appBarEditModeUpperLayout = finder.findRequiredViewAsType(source, 2131624068, "field 'appBarEditModeUpperLayout'", RelativeLayout.class);
      view = finder.findRequiredView(source, 2131624069, "method 'editModeExitOnClick'");
      view2131624069 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.editModeExitOnClick();
        }
      });
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.tabLayout = null;
      target.viewPager = null;
      target.navDrawerLayout = null;
      target.navigationView = null;
      target.toolbar = null;
      target.positionLabel = null;
      target.durationLabel = null;
      target.progressBar = null;
      target.snapshotSmall = null;
      target.mainButton = null;
      target.title = null;
      target.toolbarLayout = null;
      target.editModeMenu = null;
      target.volumeSeekBar = null;
      target.volumeBarTextView = null;
      target.volumeIcon = null;
      target.dockRewind = null;
      target.dockForward = null;
      target.dockVolUp = null;
      target.dockVolDown = null;
      target.volumeBarLayout = null;
      target.progressBarLayout = null;
      target.appbarStandardUpperLayout = null;
      target.appBarEditModeUpperLayout = null;

      view2131624086.setOnClickListener(null);
      view2131624086 = null;
      view2131624070.setOnClickListener(null);
      view2131624070 = null;
      view2131624084.setOnClickListener(null);
      view2131624084 = null;
      view2131624085.setOnClickListener(null);
      view2131624085 = null;
      view2131624088.setOnClickListener(null);
      view2131624088 = null;
      view2131624087.setOnClickListener(null);
      view2131624087 = null;
      view2131624069.setOnClickListener(null);
      view2131624069 = null;

      this.target = null;
    }
  }
}
