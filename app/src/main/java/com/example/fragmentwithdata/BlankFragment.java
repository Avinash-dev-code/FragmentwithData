package com.example.fragmentwithdata;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        Bundle bundle=getArguments();
        if(bundle!=null) {
            String message = bundle.getString("key");

            TextView textView = view.findViewById(R.id.message);
            textView.setText(message);
        }


        return view;
    }
}
