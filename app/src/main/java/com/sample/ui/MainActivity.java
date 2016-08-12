package com.sample.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.sample.beans.UserBean;
import com.sample.ui.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;

    public class EventPresenter {
         /* 注意：方法名和参数列表要和系统的onClick一致
          @param v
        */
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "click event!",
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //生成binding实例
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //通过binding实例将user对象绑定进布局
        UserBean bean = new UserBean("xiasang", 18, "男", "程序猿");
        mainBinding.setUser(bean);

        //绑定监听类实例到xml
        mainBinding.setPresenter(new EventPresenter());
    }


}
