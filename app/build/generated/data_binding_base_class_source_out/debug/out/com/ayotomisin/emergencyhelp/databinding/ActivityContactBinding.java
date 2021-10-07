// Generated by view binder compiler. Do not edit!
package com.ayotomisin.emergencyhelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ayotomisin.emergencyhelp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContactBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final Button login;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText username;

  private ActivityContactBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout container, @NonNull ProgressBar loading, @NonNull Button login,
      @NonNull EditText password, @NonNull EditText username) {
    this.rootView = rootView;
    this.container = container;
    this.loading = loading;
    this.login = login;
    this.password = password;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.loading;
      ProgressBar loading = rootView.findViewById(id);
      if (loading == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = rootView.findViewById(id);
      if (login == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.username;
      EditText username = rootView.findViewById(id);
      if (username == null) {
        break missingId;
      }

      return new ActivityContactBinding((ConstraintLayout) rootView, container, loading, login,
          password, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
