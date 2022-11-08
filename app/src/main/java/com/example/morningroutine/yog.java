package com.example.morningroutine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class yog extends AppCompatActivity {



    int[]  yogarray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yog);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        yogarray =new int[]{
                R.id.jumpingpose,R.id.pushuppose,R.id.crunchpose,
                R.id.bicyclepose,R.id.legpose,R.id.heelpose,
                R.id.mountpose,R.id.squatpose,
        };
    }

    public void excbutton(View view) {
        for (int i=0;i<yogarray.length;i++){
            if(view.getId() ==yogarray[i]){
                int value=i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(yog.this,yogdescription.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);

            }
        }
    }
}