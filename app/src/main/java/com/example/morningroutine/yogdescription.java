package com.example.morningroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class yogdescription extends AppCompatActivity {


    String butvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogdescription);
        Intent intent =getIntent();
        butvalue =intent.getStringExtra("value");
        /**
         * swith case is to used to move from one view to otherview
         */
        int swithvalue = Integer.valueOf(butvalue);
        switch(swithvalue){
            case 1:
                setContentView(R.layout.activity_yoga1);
                break;
            case 2:
                setContentView(R.layout.activity_yoga2);
                break;
            case 3:
                setContentView(R.layout.activity_yoga3);
                break;
            case 4:
                setContentView(R.layout.activity_yoga4);
                break;
            case 5:
                setContentView(R.layout.activity_yoga5);
                break;
            case 6:
                setContentView(R.layout.activity_yoga6);
                break;
            case 7:
                setContentView(R.layout.activity_yoga7);
                break;
            case 8:
                setContentView(R.layout.activity_yoga8);
                break;

        }
    }
}