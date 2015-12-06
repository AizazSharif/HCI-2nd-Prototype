package com.example.aizaz.finalproto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Aizaz on 12/6/2015.
 */
public class Map1 extends Fragment {
    private android.support.v7.widget.Toolbar toolbar;

    ImageView img;

    public Map1() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.map1, container, false);
        img= (ImageView)view.findViewById(R.id.imageView4);
        img.setImageResource(R.drawable.map);


        return  view;


    }
}
