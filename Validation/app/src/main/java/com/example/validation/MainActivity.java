package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Patterns;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText uname;
    EditText age;
    EditText ph;
    EditText pass;
    Button loginbut;
    Pattern USERNAME_PATTERN=Pattern.compile("^[A-Za-z]\\w{4,30}$");
    Pattern PASSWORD_PATTERN =Pattern.compile("^" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{4,}" +  "$");
    Pattern AGE_PATTERN=Pattern.compile("^(.*[0-9].*)$");
    Pattern PHONE_PATTERN=Pattern.compile("^(0|91)?[7-9][0-9]{9}$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=findViewById(R.id.Name);
        age=findViewById(R.id.Age);
        ph=findViewById(R.id.Phone);
        pass=findViewById(R.id.Password);
        loginbut=findViewById(R.id.button);

        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inpName=uname.getText().toString();
                String inpAge=age.getText().toString();
                String inpPh=ph.getText().toString();
                String inpPass=pass.getText().toString();


                if(inpName.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Name Field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if(inpAge.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Age field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if(inpPh.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Phone field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if(inpPass.isEmpty()){
                    Toast.makeText(MainActivity.this,  "Password field is Empty", Toast.LENGTH_SHORT).show();
                }
                else if (!USERNAME_PATTERN.matcher(inpName).matches()){
                    uname.setError("Enter alphabets [5-30 characters]");
                }
                else if (!AGE_PATTERN.matcher(inpAge).matches()){
                    age.setError("Enter only digits");
                }
                else if (!PHONE_PATTERN.matcher(inpPh).matches()){
                    ph.setError("Contains only 10 digits");
                }
                else if (!PASSWORD_PATTERN.matcher(inpPass).matches()){
                    pass.setError("Password is too weak[must contain capital letter,small letter,digits and special characters]");
                }
                else Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }

        });
    }
}