package org.jaaksi.pickerview.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import org.jaaksi.pickerview.widget.PickerView;

/**
 * Created by fuchaoyang on 2018/2/10.<br/>
 * description：
 */

public class MainActivity extends BaseActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btn_timepicker:
        openFragment(new TimePickerFragment());
        break;
      case R.id.btn_mixedtimepicker:
        openFragment(new MixedTimePickerFragment());
        break;
      case R.id.btn_optionpicker:
        openFragment(new OptionPickerFragment());
        break;
      case R.id.btn_test_pickerview:
//        openFragment(new TestPickerViewFragment());
//        DialogFragment newFragment = MyDialogFragment.newInstance();
//        newFragment.show(getFragmentManager(), "dialog");
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        DialogFragment newFragment = MyDialogFragment.newInstance();
//        ft.add(R.id.conent, newFragment);
//        ft.commit();
        MySimpleArrayPicker picker = new MySimpleArrayPicker(this);
        picker.init();
        PickerView pickerview = picker.getPickerViews().get(0);
        pickerview.setItemSize(100);
        pickerview.setItemWidth(100);
        picker.show();
        break;
      case R.id.btn_picker_configs:
        openFragment(new PickerConfigFragment());
        break;
    }
  }
}
