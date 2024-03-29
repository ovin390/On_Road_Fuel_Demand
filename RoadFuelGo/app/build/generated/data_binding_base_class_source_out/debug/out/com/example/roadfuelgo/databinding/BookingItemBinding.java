// Generated by view binder compiler. Do not edit!
package com.example.roadfuelgo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.roadfuelgo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BookingItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView textViewBookingDate;

  @NonNull
  public final TextView textViewFuelType;

  @NonNull
  public final TextView textViewId;

  @NonNull
  public final TextView textViewLocation;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewPhone;

  @NonNull
  public final TextView textViewQuantity;

  private BookingItemBinding(@NonNull LinearLayout rootView, @NonNull TextView textViewBookingDate,
      @NonNull TextView textViewFuelType, @NonNull TextView textViewId,
      @NonNull TextView textViewLocation, @NonNull TextView textViewName,
      @NonNull TextView textViewPhone, @NonNull TextView textViewQuantity) {
    this.rootView = rootView;
    this.textViewBookingDate = textViewBookingDate;
    this.textViewFuelType = textViewFuelType;
    this.textViewId = textViewId;
    this.textViewLocation = textViewLocation;
    this.textViewName = textViewName;
    this.textViewPhone = textViewPhone;
    this.textViewQuantity = textViewQuantity;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BookingItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BookingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.booking_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BookingItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textViewBookingDate;
      TextView textViewBookingDate = ViewBindings.findChildViewById(rootView, id);
      if (textViewBookingDate == null) {
        break missingId;
      }

      id = R.id.textViewFuelType;
      TextView textViewFuelType = ViewBindings.findChildViewById(rootView, id);
      if (textViewFuelType == null) {
        break missingId;
      }

      id = R.id.textViewId;
      TextView textViewId = ViewBindings.findChildViewById(rootView, id);
      if (textViewId == null) {
        break missingId;
      }

      id = R.id.textViewLocation;
      TextView textViewLocation = ViewBindings.findChildViewById(rootView, id);
      if (textViewLocation == null) {
        break missingId;
      }

      id = R.id.textViewName;
      TextView textViewName = ViewBindings.findChildViewById(rootView, id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.textViewPhone;
      TextView textViewPhone = ViewBindings.findChildViewById(rootView, id);
      if (textViewPhone == null) {
        break missingId;
      }

      id = R.id.textViewQuantity;
      TextView textViewQuantity = ViewBindings.findChildViewById(rootView, id);
      if (textViewQuantity == null) {
        break missingId;
      }

      return new BookingItemBinding((LinearLayout) rootView, textViewBookingDate, textViewFuelType,
          textViewId, textViewLocation, textViewName, textViewPhone, textViewQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
