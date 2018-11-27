package org.jaaksi.pickerview.demo;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public  class MyDialogFragment extends DialogFragment {
  static MyDialogFragment newInstance() {
    return new MyDialogFragment();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.dialog_num_edit, container, false);
    return v;
  }
}