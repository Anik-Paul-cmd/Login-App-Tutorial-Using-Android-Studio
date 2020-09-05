package com.example.student.id;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText)findViewById(R.id.na);
        Password = (EditText)findViewById(R.id.edpass);

        Login=(Button) findViewById(R.id.but);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                validity(Name.getText().toString(),Password.getText().toString());

            }
        });

    }
    private void validity (String userName, String userPassword ){
        if ((userName.equals("Nazla")) && (userPassword.equals("111")) || (userName.equals("Oishi")) && (userPassword.equals("540"))||(userName.equals("Tarin")) && (userPassword.equals("786")))

        {
            Intent intent;
            intent = new Intent(MainActivity.this, Secact.class);
            intent.putExtra("name",userName);
            startActivity(intent);

        }
        else{
            Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_LONG).show();

        }



    }


}
