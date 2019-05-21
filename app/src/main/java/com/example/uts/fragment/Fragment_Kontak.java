package com.example.uts.fragment;

/*
Minggu,19 Mei 2019   10116175 aliakbar IF-4
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.uts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Kontak extends Fragment {


    public Fragment_Kontak() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontak, container, false);
    }

}
