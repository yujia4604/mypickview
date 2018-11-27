package org.jaaksi.pickerview.demo;

import android.content.Context;
import android.graphics.Color;
import android.widget.Toast;

import org.jaaksi.pickerview.adapter.NumericWheelAdapter;
import org.jaaksi.pickerview.picker.BasePicker;
import org.jaaksi.pickerview.topbar.DefaultTopBar;
import org.jaaksi.pickerview.widget.DefaultCenterDecoration;
import org.jaaksi.pickerview.widget.PickerView;

public class MySimpleArrayPicker  extends BasePicker {

    public MySimpleArrayPicker(Context context) {
        super(context);
        mContext=context;
    }

    public void init(){
        PickerView view = createPickerView("item", 1.2f);
        view.setColor(Color.BLACK,Color.LTGRAY);
        view.setIsCirculation(true);
        int margin = 5;
        DefaultCenterDecoration centerDecoration =
                new DefaultCenterDecoration(mContext)
                        .setMargin(margin, -margin, margin, -margin)
                        .setLineColor(Color.LTGRAY)
                        .setDrawable(Color.TRANSPARENT);
        view.setCenterDecoration(centerDecoration);
        view.setAdapter(new NumericWheelAdapter(2013,2018));
    }
    @Override
    protected void onConfirm() {
        Toast.makeText(this.mContext,"on confirmed",1).show();
    }
}
