// Generated by view binder compiler. Do not edit!
package com.example.ensik2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.ensik2.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityJeruknipisBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  private ActivityJeruknipisBinding(@NonNull ScrollView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJeruknipisBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJeruknipisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_jeruknipis, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJeruknipisBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ActivityJeruknipisBinding((ScrollView) rootView);
  }
}
