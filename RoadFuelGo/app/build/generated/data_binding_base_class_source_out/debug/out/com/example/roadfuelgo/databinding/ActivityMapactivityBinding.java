// Generated by view binder compiler. Do not edit!
package com.example.roadfuelgo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.roadfuelgo.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityMapactivityBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  private ActivityMapactivityBinding(@NonNull RelativeLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMapactivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMapactivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_mapactivity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMapactivityBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ActivityMapactivityBinding((RelativeLayout) rootView);
  }
}
