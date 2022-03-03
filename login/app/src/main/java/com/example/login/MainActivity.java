package com.example.login;

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
    //String name=" ";
    //String pass=" ";
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
                un.setText(un.getText().toString());
                ps.setText(ps.getText().toString());
                Intent i= new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);

                Toast.makeText(MainActivity.this,"Login successful",Toast.LENGTH_LONG).show();
            }
        });
    }
}