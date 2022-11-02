// Generated by view binder compiler. Do not edit!
package com.example.ensik2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ensik2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBuahBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final CardView cardalpukat;

  @NonNull
  public final CardView cardbelimbing;

  @NonNull
  public final CardView cardblustru;

  @NonNull
  public final CardView carddelima;

  @NonNull
  public final CardView cardjambubiji;

  @NonNull
  public final CardView cardjeruknipis;

  @NonNull
  public final CardView cardkelapa;

  @NonNull
  public final CardView cardmengkudu;

  @NonNull
  public final CardView cardpepaya;

  @NonNull
  public final CardView cardpisang;

  private ActivityBuahBinding(@NonNull ScrollView rootView, @NonNull CardView cardalpukat,
      @NonNull CardView cardbelimbing, @NonNull CardView cardblustru, @NonNull CardView carddelima,
      @NonNull CardView cardjambubiji, @NonNull CardView cardjeruknipis,
      @NonNull CardView cardkelapa, @NonNull CardView cardmengkudu, @NonNull CardView cardpepaya,
      @NonNull CardView cardpisang) {
    this.rootView = rootView;
    this.cardalpukat = cardalpukat;
    this.cardbelimbing = cardbelimbing;
    this.cardblustru = cardblustru;
    this.carddelima = carddelima;
    this.cardjambubiji = cardjambubiji;
    this.cardjeruknipis = cardjeruknipis;
    this.cardkelapa = cardkelapa;
    this.cardmengkudu = cardmengkudu;
    this.cardpepaya = cardpepaya;
    this.cardpisang = cardpisang;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBuahBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBuahBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_buah, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBuahBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardalpukat;
      CardView cardalpukat = ViewBindings.findChildViewById(rootView, id);
      if (cardalpukat == null) {
        break missingId;
      }

      id = R.id.cardbelimbing;
      CardView cardbelimbing = ViewBindings.findChildViewById(rootView, id);
      if (cardbelimbing == null) {
        break missingId;
      }

      id = R.id.cardblustru;
      CardView cardblustru = ViewBindings.findChildViewById(rootView, id);
      if (cardblustru == null) {
        break missingId;
      }

      id = R.id.carddelima;
      CardView carddelima = ViewBindings.findChildViewById(rootView, id);
      if (carddelima == null) {
        break missingId;
      }

      id = R.id.cardjambubiji;
      CardView cardjambubiji = ViewBindings.findChildViewById(rootView, id);
      if (cardjambubiji == null) {
        break missingId;
      }

      id = R.id.cardjeruknipis;
      CardView cardjeruknipis = ViewBindings.findChildViewById(rootView, id);
      if (cardjeruknipis == null) {
        break missingId;
      }

      id = R.id.cardkelapa;
      CardView cardkelapa = ViewBindings.findChildViewById(rootView, id);
      if (cardkelapa == null) {
        break missingId;
      }

      id = R.id.cardmengkudu;
      CardView cardmengkudu = ViewBindings.findChildViewById(rootView, id);
      if (cardmengkudu == null) {
        break missingId;
      }

      id = R.id.cardpepaya;
      CardView cardpepaya = ViewBindings.findChildViewById(rootView, id);
      if (cardpepaya == null) {
        break missingId;
      }

      id = R.id.cardpisang;
      CardView cardpisang = ViewBindings.findChildViewById(rootView, id);
      if (cardpisang == null) {
        break missingId;
      }

      return new ActivityBuahBinding((ScrollView) rootView, cardalpukat, cardbelimbing, cardblustru,
          carddelima, cardjambubiji, cardjeruknipis, cardkelapa, cardmengkudu, cardpepaya,
          cardpisang);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
