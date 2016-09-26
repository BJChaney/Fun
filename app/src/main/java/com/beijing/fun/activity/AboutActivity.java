package com.beijing.fun.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.core.utils.phone.BaseTool;
import com.beijing.fun.BaseActivity;
import com.beijing.fun.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by qiuzhenhuan on 16/9/25.
 */
@EActivity(R.layout.activity_about)
public class AboutActivity extends BaseActivity {

    @ViewById
    TextView tv_app_info;

    @ViewById
    TextView tv_title;

    @ViewById
    TextView tv_commit;

    @ViewById
    RelativeLayout layout_bar;

    @AfterViews
    void afterViews(){
        tv_title.setText(getString(R.string.my_lab_about));
        tv_commit.setVisibility(View.GONE);
        layout_bar.setBackgroundResource(R.color.background);
        tv_app_info.setText(String.format(getResources().getString(R.string.my_lab_appinfo),BaseTool.getVersionCode(this)));
    }

    @Click(R.id.tv_weibo)
    void goWeibo(){

    }

    void back(View v){
        finish();
    }

    public static void startAc(Context context){
        Intent intent = new Intent(context,AboutActivity_.class);
        context.startActivity(intent);
    }
}
