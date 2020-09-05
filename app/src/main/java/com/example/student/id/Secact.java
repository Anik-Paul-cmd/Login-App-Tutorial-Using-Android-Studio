package com.example.student.id;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.StringJoiner;
import java.util.jar.Attributes;

public class Secact extends AppCompatActivity {
     TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secact2);

        textView= findViewById(R.id.name);

        String userName = getIntent().getStringExtra("name");

        textView.setText("NAME: "+userName);






    }
}
