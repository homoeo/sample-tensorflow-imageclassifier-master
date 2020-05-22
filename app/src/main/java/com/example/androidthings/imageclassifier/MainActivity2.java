package com.example.androidthings.imageclassifier;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView mResultText2;
    private TextView mResultText3;
    private String detail;
    ConstraintLayout cons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mResultText2 = findViewById(R.id.textView);
        mResultText3 = findViewById(R.id.textView1);



        cons = findViewById(R.id.cons);

        Intent intent = getIntent();
 String user = intent.getStringExtra("k");




String newone[] = user.split("or",2);
mResultText3.setText(newone[0]);
if(newone[0].length()==" Acne".length())
{
    detail = getResources().getString(R.string.Acne);
    mResultText2.setText(detail);

}
if(newone[0].length()==" measles".length())
{
    detail = getResources().getString(R.string.measles);
    mResultText2.setText(detail);
}

    }
}
