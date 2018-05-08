package com.canplay.milk.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.canplay.medical.R;
import com.canplay.milk.base.BaseApplication;
import com.canplay.milk.base.BaseFragment;
import com.canplay.milk.mvp.activity.mine.MineInfoActivity;
import com.canplay.milk.util.SpUtil;
import com.canplay.milk.view.EditorNameDialog;
import com.canplay.milk.view.PhotoPopupWindow;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by mykar on 17/4/10.
 */
public class SetFragment extends BaseFragment implements View.OnClickListener {

    Unbinder unbinder;
    @BindView(R.id.iv_box)
    ImageView ivBox;
    @BindView(R.id.iv_setting)
    ImageView ivSetting;
    @BindView(R.id.iv_img)
    ImageView ivImg;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.tv_address)
    TextView tvAddress;
    @BindView(R.id.tv_birth)
    TextView tvBirth;
    @BindView(R.id.tv_sex)
    TextView tvSex;
    @BindView(R.id.card)
    CardView card;
    @BindView(R.id.ll_bg)
    LinearLayout llBg;
    @BindView(R.id.rl_menu)
    ListView rlMenu;
    @BindView(R.id.line)
    View line;


    private EditorNameDialog dialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_set, null);
        unbinder = ButterKnife.bind(this, view);

        user_id= SpUtil.getInstance().getUserId();
        mWindowAddPhoto = new PhotoPopupWindow(getActivity());
        mWindowAddPhoto.setCont("解除绑定", "取消");
        mWindowAddPhoto.setColor(R.color.red_pop, 0);
        initListener();
        return view;
    }

    public PhotoPopupWindow mWindowAddPhoto;

    @Override
    public void onResume() {
        super.onResume();

    }

    private String patientDeviceId;
    private String user_id;

    private void initListener() {
        ivImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MineInfoActivity.class));

            }
        });
        ivSetting.setOnClickListener(this);
        ivBox.setOnClickListener(this);

    }

    private void initView() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }

}
