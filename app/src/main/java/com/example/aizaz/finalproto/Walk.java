package com.example.aizaz.finalproto;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;

/**
 * Created by Aizaz on 12/1/2015.
 */
public class Walk extends Fragment {

    private android.support.v7.widget.Toolbar toolbar;

    Button back,maps,run;
    TextView txt1;
    private Vibrator myVib;
    private SensorManager mSensorManager;

    private Sensor mStepCounterSensor;

    private Sensor mStepDetectorSensor;
    public Walk() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.walk, container, false);

        BarChart mBarChart = (BarChart) view.findViewById(R.id.barchart);
        TextView txt= (TextView) view.findViewById(R.id.textView);
        maps=(Button) view.findViewById(R.id.button4);

        txt.setText("Footsteps 1025");
        mBarChart.addBar(new BarModel("Mon", 0.2f, Color.parseColor("#285c80")));
        mBarChart.addBar(new BarModel("Tues", 0.5f, Color.parseColor("#285c80")));
        mBarChart.addBar(new BarModel("Wed",1.f,  Color.parseColor("#285c80")));
        mBarChart.addBar(new BarModel("Thu",2.f,  Color.parseColor("#285c80")));
        mBarChart.addBar(new BarModel("Fri",2.f,  Color.parseColor("#285c80")));
        mBarChart.addBar(new BarModel("Sat", 0.8f, Color.parseColor("#285c80")));
        mBarChart.addBar(new BarModel("Sun", 0.6f, Color.parseColor("#285c80")));



        mBarChart.startAnimation();



        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                myVib.vibrate(15);
                AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                alert.setTitle("Location Alert");
                alert.setIcon(R.drawable.ic_location_red_12);
                alert.setMessage("GPS must be turned on before going into Maps");


                alert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Intent intent = new Intent(getContext(), MapMain.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                dialog.dismiss();
                            }
                        });

                alert.show();

            }
        });

        return view;
    }

}
