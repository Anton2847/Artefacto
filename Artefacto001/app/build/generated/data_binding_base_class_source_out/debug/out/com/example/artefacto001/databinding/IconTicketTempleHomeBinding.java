// Generated by view binder compiler. Do not edit!
package com.example.artefacto001.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.artefacto001.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class IconTicketTempleHomeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView iconTempleArchives;

  @NonNull
  public final ImageView iconTicketCounter;

  private IconTicketTempleHomeBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView iconTempleArchives, @NonNull ImageView iconTicketCounter) {
    this.rootView = rootView;
    this.iconTempleArchives = iconTempleArchives;
    this.iconTicketCounter = iconTicketCounter;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IconTicketTempleHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IconTicketTempleHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.icon_ticket_temple_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IconTicketTempleHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.icon_temple_archives;
      ImageView iconTempleArchives = ViewBindings.findChildViewById(rootView, id);
      if (iconTempleArchives == null) {
        break missingId;
      }

      id = R.id.icon_ticket_counter;
      ImageView iconTicketCounter = ViewBindings.findChildViewById(rootView, id);
      if (iconTicketCounter == null) {
        break missingId;
      }

      return new IconTicketTempleHomeBinding((LinearLayout) rootView, iconTempleArchives,
          iconTicketCounter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}