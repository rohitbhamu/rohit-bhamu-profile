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
public class SkillsFragment extends Fragment {


    public SkillsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View skillView =inflater.inflate(R.layout.fragment_skills, container, false);
        TextView textView=skillView.findViewById(R.id.skill) ;
        //textView.setText("Hello");
        // Inflate the layout for this fragment
        return skillView;
    }

}
