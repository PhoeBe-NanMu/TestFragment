package com.example.leiyang.testfragment;


import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 24436 on 2018/1/31.
 */

public class newActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.new_framelayout);

        initFrameLayout(savedInstanceState);

    }

    private void initFrameLayout(Bundle savedInstanceState) {

        if (findViewById(R.id.new_frameLayout) != null){

            if (savedInstanceState != null){
                return;
            }

            Fragment fragment = new Fragment ();
            fragment.setArguments(getIntent().getExtras());

            getFragmentManager().beginTransaction().add(R.id.new_frameLayout,fragment).commit();
        }
    }
}
