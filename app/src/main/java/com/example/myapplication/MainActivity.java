package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String math,sresult ,st1,st2;
    String s1="enter num";
    int num1,num2,result;
    Button times,dev,equal,plus,minus,clear,credit;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        times =(Button)findViewById(R.id.times);
        dev =(Button)findViewById(R.id.dev);
        minus =(Button)findViewById(R.id.minus);
        plus =(Button)findViewById(R.id.plus);
        clear =(Button)findViewById(R.id.clear);
        credit =(Button)findViewById(R.id.credit);
        et= (EditText)findViewById(R.id.et);
         st1 = et.getText().toString();
        num1=Integer.parseInt(st1);
        st2 = et.getText().toString();
        num2=Integer.parseInt(st2);


    }
    public void equal(View view) {
        switch (math){
            case "plus":
                result=num1+num2;
                break;
            case "minus":
                result=num1-num2;
                break;
            case "dev":
                result=num1/num2;
                break;
            case "times":
                result=num1*num2;
                break;
        }
        sresult=Integer.toString(result);
        et.setHint(sresult);
    }
    public void times(View view) {
        math="times";
    }
    public void dev(View view) {math ="dev";
    }

    public void minus(View view) {math ="minus";
    }

    public void plus(View view) {math ="plus";
    }

    public void clear(View view) {
        num1=0;
        num2=0;
        et.setHint(s1);
        result=0;
        sresult="";
        math="";
    }

    public void credit(View view) {
        Intent si =new Intent(this,credits.class);
        si.putExtra("result",result);
    }
}