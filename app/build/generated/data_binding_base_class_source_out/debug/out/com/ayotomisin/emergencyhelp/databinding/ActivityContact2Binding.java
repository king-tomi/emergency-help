// Generated by view binder compiler. Do not edit!
package com.ayotomisin.emergencyhelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ayotomisin.emergencyhelp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContact2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText phone1;

  @NonNull
  public final EditText phone2;

  @NonNull
  public final EditText phone3;

  @NonNull
  public final Button save;

  private ActivityContact2Binding(@NonNull ConstraintLayout rootView, @NonNull EditText phone1,
      @NonNull EditText phone2, @NonNull EditText phone3, @NonNull Button save) {
    this.rootView = rootView;
    this.phone1 = phone1;
    this.phone2 = phone2;
    this.phone3 = phone3;
    this.save = save;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContact2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContact2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contact2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContact2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.phone1;
      EditText phone1 = rootView.findViewById(id);
      if (phone1 == null) {
        break missingId;
      }

      id = R.id.phone2;
      EditText phone2 = rootView.findViewById(id);
      if (phone2 == null) {
        break missingId;
      }

      id = R.id.phone3;
      EditText phone3 = rootView.findViewById(id);
      if (phone3 == null) {
        break missingId;
      }

      id = R.id.save;
      Button save = rootView.findViewById(id);
      if (save == null) {
        break missingId;
      }

      return new ActivityContact2Binding((ConstraintLayout) rootView, phone1, phone2, phone3, save);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
