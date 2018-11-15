package com.example.rohitkumarbhamu.rohitbhamu.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rohitkumarbhamu.rohitbhamu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkFragment extends Fragment {


    public WorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View workView =inflater.inflate(R.layout.fragment_work, container, false);
        TextView textView=workView.findViewById(R.id.work) ;
        //textView.setText("Hello");
        // Inflate the layout for this fragment
        return workView;
    }

}
