package com.example.abirhossainamee.phoneactivity.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abirhossainamee.phoneactivity.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TotalDataFragment extends Fragment {


    public TotalDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_total_data, container, false);
    }

}
