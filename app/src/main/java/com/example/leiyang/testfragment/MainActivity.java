package com.example.leiyang.testfragment;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.leiyang.testfragment.R.id.ff;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onChange(View view) {
        Intent intent = new Intent(MainActivity.this,newActivity.class);
        intent.putExtra("KEY","MainActivity");
        startActivity(intent);
    }
}
