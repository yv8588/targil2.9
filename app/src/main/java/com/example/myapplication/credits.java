package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class credits extends AppCompatActivity {
   Intent gi=getIntent();
   int res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        res=gi.getIntExtra("result",111);
    }

    public void back(View view) {
        Intent albert =new Intent(this,MainActivity.class);
        startActivityFromChild(albert);
    }

    private void startActivityFromChild(Intent albert) {
    }
}