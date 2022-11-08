package com.example.morningroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class excdescription extends AppCompatActivity {


    String butvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excdescription);
        Intent intent =getIntent();
        butvalue =intent.getStringExtra("value");
        int swithvalue = Integer.valueOf(butvalue);
        switch(swithvalue){
            case 1:
                setContentView(R.layout.activity_jumpingpose);
                break;
            case 2:
                setContentView(R.layout.activity_pushuppose);
                break;
            case 3:
                setContentView(R.layout.activity_crunchpose);
                break;
            case 4:
                setContentView(R.layout.activity_bicyclepose);
                break;
            case 5:
                setContentView(R.layout.activity_legpose);
                break;
            case 6:
                setContentView(R.layout.activity_heelpose);
                break;
            case 7:
                setContentView(R.layout.activity_mountpose);
                break;
            case 8:
                setContentView(R.layout.activity_squatpose);
                break;

        }
    }
}