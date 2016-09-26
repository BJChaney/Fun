package com.beijing.fun.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.core.utils.OnClickUtil;
import com.android.core.utils.Text.StringUtils;
import com.beijing.fun.BaseActivity;
import com.beijing.fun.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by qiuzhenhuan on 16/9/25.
 */
@EActivity(R.layout.activity_update_name)
public class UpdateNameActivity extends BaseActivity {


    @ViewById
    TextView tv_title;

    @ViewById
    TextView tv_commit;

    @ViewById
    EditText et_name;



    @AfterViews
    void afterViews(){
        tv_title.setText(getString(R.string.my_lab_feedback));
        tv_commit.setVisibility(View.VISIBLE);
    }


    void submit(View view){

        if(OnClickUtil.isFastDoubleClick(FAST_CLICK_TIME)){
            return;
        }

        String name = et_name.getText().toString().trim();

        if(StringUtils.isBlank(name)){
            showToastShort("昵称不能为空~");
            return;
        }
        
        commitUpdateName(name);

    }

    private void commitUpdateName(String name) {
    }


    void back(View v){
        finish();
    }

    public static void startAc(Context context){
        Intent intent = new Intent(context,UpdateNameActivity_.class);
        context.startActivity(intent);
    }
}
