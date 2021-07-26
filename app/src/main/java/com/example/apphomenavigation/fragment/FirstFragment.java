package com.example.apphomenavigation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.apphomenavigation.R;

public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button jumpSecond;
    private Bundle bundle;


    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        bundle = new Bundle();
        initView(view);
        return view;
    }

    private void initView(View view) {
        jumpSecond = view.findViewById(R.id.jumpBFragment);
        jumpSecond.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.jumpBFragment:
                bundle.putString("content","How are you?");
                Navigation.findNavController(getView())
                        //跳转动作
                        .navigate(R.id.action_afragment_to_bfragment,bundle);
        }
    }
}
