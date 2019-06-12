package com.example.walterleskovarentregable.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.walterleskovarentregable.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMain extends Fragment {
    private ImageView imageView;

    public FragmentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment_main, container, false);
        imageView = view.findViewById(R.id.imageViewReceta);


        return view;

    }

}
