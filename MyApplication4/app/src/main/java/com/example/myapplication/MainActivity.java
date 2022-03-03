package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usrname;
    EditText pswd;
    Button loginbut;
    String name="Admin";
    String ps="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrname=findViewById(R.id.UserName);
        pswd=findViewById(R.id.Password);
        loginbut=findViewById(R.id.Loginbt);

        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName=usrname.getText().toString();
                String inppass=pswd.getText().toString();

                if(inpName.isEmpty() || inppass.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Fields are Empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(inpName.equals(name) && inppass.equals(ps)){
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Username or Password is Incorrect", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }
}