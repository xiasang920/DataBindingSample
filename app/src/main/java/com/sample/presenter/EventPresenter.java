package com.sample.presenter;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by xiasang on 2016/8/12.
 */
public class EventPresenter {
    private Context context;
    public EventPresenter(Context context) {
        this.context = context;
    }

    /**
     * 注意：方法名和参数列表要和系统的onClick一致
     * @param v
     */
    public void onClick(View v) {
        Toast.makeText(context, "click event!",
                Toast.LENGTH_LONG).show();
    }
}
