package com.example.morningroutine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button1 =findViewById(R.id.startexc);
        button2 =findViewById(R.id.startyog);
        /**
         * when click on get start in excercise layout it will
         * load the exc activity
         */
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,exc.class);
                startActivity(intent);
            }
        });
        /**
         * when click on get start it will load yog activity
         */
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,yog.class);
                startActivity(intent);
            }
        });

    }

    /**
     * when you click on the exc layout any where it will load the exc activity
     * @param view
     */
    public void exercise(View view) {
        Intent intent=new Intent(MainActivity.this,exc.class);
        startActivity(intent);
    }

    /**
     * when you click on the yog layout any where it will load the yog activity
     * @param view
     */
    public void yoga(View view) {
        Intent intent=new Intent(MainActivity.this,yog.class);
        startActivity(intent);
    }
}