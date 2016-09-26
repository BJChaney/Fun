package com.beijing.fun.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.core.utils.OnClickUtil;
import com.android.core.utils.Text.StringUtils;
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
@EActivity(R.layout.activity_feedback)
public class FeedbackActivity extends BaseActivity {


    @ViewById
    TextView tv_title;

    @ViewById
    TextView tv_commit;

    @ViewById
    EditText et_contact;

    @ViewById
    EditText et_content;


    @AfterViews
    void afterViews(){
        tv_title.setText(getString(R.string.my_lab_feedback));
        tv_commit.setVisibility(View.VISIBLE);
    }


    void submit(View view){

        if(OnClickUtil.isFastDoubleClick(FAST_CLICK_TIME)){
           return;
        }

        String contact = et_contact.getText().toString().trim();
        String content = et_content.getText().toString().trim();

        if(StringUtils.isBlank(contact)){
            showToastShort("联系方式不能为空~");
            return;
        }

        if(StringUtils.isBlank(content)){
            showToastShort("内容不能为空~");
            return;
        }

        commitFeedback(contact,content);

    }

    private void commitFeedback(String contact, String content) {
    }


    void back(View v){
        finish();
    }

    public static void startAc(Context context){
        Intent intent = new Intent(context,FeedbackActivity_.class);
        context.startActivity(intent);
    }
}
