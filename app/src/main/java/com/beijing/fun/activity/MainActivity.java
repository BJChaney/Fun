package com.beijing.fun.activity;


import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.beijing.fun.BaseActivity;
import com.beijing.fun.R;
import com.beijing.fun.fragment.ClubFragment;
import com.beijing.fun.fragment.GameFragment;
import com.beijing.fun.fragment.MyFragment;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


/**
 * @author CentMeng csdn@vip.163.com on 16/8/11.
 */
@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    @ViewById
    ImageView img_back;

    @ViewById
    TextView tv_title;

    @ViewById
    TextView tv_commit;

    @ViewById
    RelativeLayout layout_main;

    @ViewById
    FrameLayout main_tab_fragment;

    @ViewById
    RadioGroup rg_main;

    @ViewById
    RadioButton rb_game;

    @ViewById
    RadioButton rb_club;

    @ViewById
    RadioButton rb_my;

    GameFragment gameFragment;

    ClubFragment clubFragment;

    MyFragment myFragment;

    FragmentManager fragmentManager;


    @AfterViews
    public void afterViews(){
        img_back.setVisibility(View.GONE);

        tv_commit.setVisibility(View.GONE);
        layout_main.setBackgroundColor(getResources().getColor(R.color.basecolor));
        initFragments();
        rg_main.setOnCheckedChangeListener(this);
        rb_game.setChecked(true);
    }

    private void initFragments() {
        gameFragment = GameFragment.getInstance();
        clubFragment = ClubFragment.getInstance();
        myFragment = MyFragment.getInstance();

        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.main_tab_fragment,gameFragment)
                .add(R.id.main_tab_fragment,clubFragment)
                .add(R.id.main_tab_fragment,myFragment)
                .commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int id) {
        layoutChangeByCheckId(id);
    }

    private void layoutChangeByCheckId(int id) {
        switch (id){
            case R.id.rb_game:
                fragmentManager.beginTransaction().show(gameFragment)
                        .hide(clubFragment)
                        .hide(myFragment)
                        .commit();
                tv_title.setText("第一届 | 北京");
                layout_main.setVisibility(View.VISIBLE);
                break;
            case R.id.rb_club:
                fragmentManager.beginTransaction().hide(gameFragment)
                        .show(clubFragment)
                        .hide(myFragment)
                        .commit();
                tv_title.setText(getResources().getString(R.string.main_club));
                layout_main.setVisibility(View.VISIBLE);
                break;
            case R.id.rb_my:
                fragmentManager.beginTransaction().hide(gameFragment)
                        .hide(clubFragment)
                        .show(myFragment)
                        .commit();
                layout_main.setVisibility(View.GONE);
                break;
        }
    }
}
