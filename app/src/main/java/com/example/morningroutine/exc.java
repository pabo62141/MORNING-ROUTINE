package com.example.morningroutine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class exc extends AppCompatActivity {



    int[]  excarray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        excarray =new int[]{
                R.id.jumpingpose,R.id.pushuppose,R.id.crunchpose,
                R.id.bicyclepose,R.id.legpose,R.id.heelpose,
                R.id.mountpose,R.id.squatpose,
        };
    }

    /**
     *
     * @param view
     */
    public void excbutton(View view) {
        for (int i=0;i<excarray.length;i++){
            if(view.getId() ==excarray[i]){
                int value=i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(exc.this,excdescription.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);

            }
        }
    }
}