package com.example.ts_yfzx_cqe.mfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ts_yfzx_cqe.fragmenttest.R;

/**
 * Created by TS-YFZX-CQE on 2017/6/23.
 */

public class AnOtherRightFragment extends Fragment {


    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.another_right_fragment,container,false);

        return view;
    }
}
