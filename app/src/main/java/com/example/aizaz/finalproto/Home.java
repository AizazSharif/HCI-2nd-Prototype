package com.example.aizaz.finalproto;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

/**
 * Created by Aizaz on 12/1/2015.
 */
public class Home extends Fragment {


    public Home() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home, container, false);
        PieChart mPieChart = (PieChart) view.findViewById(R.id.piechart);


        mPieChart.addPieSlice(new PieModel("Walk", 35, Color.parseColor("#285c80")));
        mPieChart.addPieSlice(new PieModel("Run", 9, Color.parseColor("#ff0033")));
        mPieChart.addPieSlice(new PieModel("Others", 25, Color.parseColor("#ffffff")));

        mPieChart.startAnimation();

        RoundCornerProgressBar progress1 = (RoundCornerProgressBar) view.findViewById(R.id.progress_1);
        RoundCornerProgressBar progress2 = (RoundCornerProgressBar) view.findViewById(R.id.progress_2);

        progress1.setProgressColor(Color.parseColor("#285c80"));
        progress1.getProgressColor();
        // progress1.setBackgroundColor(Color.parseColor("#fafafa"));
        // progress1.getBackground();

        progress1.setMax(150);
        progress1.getMax();
        progress1.setProgress(120);
        progress1.getProgress();



        progress2.setProgressColor(Color.parseColor("#ff0033"));
        progress2.getProgressColor();
        // progress1.setBackgroundColor(Color.parseColor("#fafafa"));
        // progress1.getBackground();

        progress2.setMax(150);
        progress2.getMax();
        progress2.setProgress(80);
        progress2.getProgress();
        return view;
    }
}
