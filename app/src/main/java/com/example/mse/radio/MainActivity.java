package com.example.mse.radio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    RadioGroup radio;
    RadioButton radiob1;
    RadioButton radiob2;
    RadioButton radiob3;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio= (RadioGroup) findViewById(R.id.radio);
        radiob1= (RadioButton) findViewById(R.id.radiob);
        radiob2= (RadioButton) findViewById(R.id.radiob2);
        radiob3= (RadioButton) findViewById(R.id.radiob3);
        text2= (TextView) findViewById(R.id.text2);


        radiob1.setOnClickListener(this);
        radiob2.setOnClickListener(this);
        radiob3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.radiob:

                text2.setTextColor(Color.BLUE);

                break;

            case R.id.radiob2:
                radiob2.setOnClickListener();
                text2.setTextColor(Color.RED);
                break;

            case R.id.radiob3:
                text2.setTextColor(Color.GREEN);
                break;

        }

    }

}
