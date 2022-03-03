package com.example.mydesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText un,ps;
    Button b1;
    String name="Admin";
    String pss="1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=findViewById(R.id.uname);
        ps=findViewById(R.id.pass);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inpName=un.getText().toString();
                String inpPass=ps.getText().toString();

                if(inpName.isEmpty() || inpPass.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Fields are Empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(inpName.equals(name) && inpPass.equals(pss)){
                        Intent i= new Intent(getApplicationContext(), MainActivity2.class);
                        startActivity(i);

                        Toast.makeText(MainActivity.this,"Login successful",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Username or Password is Incorrect", Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });
    }
}