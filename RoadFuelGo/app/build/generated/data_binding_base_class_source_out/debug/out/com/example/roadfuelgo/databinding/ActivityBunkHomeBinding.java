// Generated by view binder compiler. Do not edit!
package com.example.roadfuelgo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.roadfuelgo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBunkHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button15;

  @NonNull
  public final Button button17;

  @NonNull
  public final Button button18;

  @NonNull
  public final Button button24;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final TextView textView47;

  private ActivityBunkHomeBinding(@NonNull ConstraintLayout rootView, @NonNull Button button15,
      @NonNull Button button17, @NonNull Button button18, @NonNull Button button24,
      @NonNull ImageView imageView6, @NonNull TextView textView47) {
    this.rootView = rootView;
    this.button15 = button15;
    this.button17 = button17;
    this.button18 = button18;
    this.button24 = button24;
    this.imageView6 = imageView6;
    this.textView47 = textView47;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBunkHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBunkHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bunk_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBunkHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button15;
      Button button15 = ViewBindings.findChildViewById(rootView, id);
      if (button15 == null) {
        break missingId;
      }

      id = R.id.button17;
      Button button17 = ViewBindings.findChildViewById(rootView, id);
      if (button17 == null) {
        break missingId;
      }

      id = R.id.button18;
      Button button18 = ViewBindings.findChildViewById(rootView, id);
      if (button18 == null) {
        break missingId;
      }

      id = R.id.button24;
      Button button24 = ViewBindings.findChildViewById(rootView, id);
      if (button24 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.textView47;
      TextView textView47 = ViewBindings.findChildViewById(rootView, id);
      if (textView47 == null) {
        break missingId;
      }

      return new ActivityBunkHomeBinding((ConstraintLayout) rootView, button15, button17, button18,
          button24, imageView6, textView47);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
