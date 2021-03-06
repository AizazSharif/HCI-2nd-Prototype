package com.example.aizaz.finalproto;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Aizaz on 11/9/2015.
 */
public class Maps2 extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    private Vibrator myVib;

    Button back;
    TextView T,D,S;
    TextView time,distance,speed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps2);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       //getSupportActionBar().setHomeAsUpIndicator(R.drawable.homie);

        T= (TextView) findViewById(R.id.textView5);
        D= (TextView) findViewById(R.id.textView7);
        S= (TextView) findViewById(R.id.textView8);

     time= (TextView) findViewById(R.id.time);
        distance= (TextView) findViewById(R.id.distance);
        speed= (TextView) findViewById(R.id.speed);


        myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_maps2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.help) {
         startActivity(new Intent(this, HelpMain.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
