package com.example.lenovo.checking_prime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class Checking_Primee extends AppCompatActivity
{
//    @Override
//    public void onBackPressed()
//    {
//        this.finish();
//        return;
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checking__primee);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button deepbutt = (Button)findViewById(R.id.button);
        deepbutt.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity( new Intent(getApplicationContext(), Checking_Prime.class) );
            }
        });

    }
}