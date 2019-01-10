package com.example.hassan.logincheckersabith;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userNameedtTxt,userPassedtTxt;
    Button loginbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameedtTxt = (EditText) findViewById(R.id.userName);
        userPassedtTxt = (EditText) findViewById(R.id.password);

        loginbtn = (Button) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              checkLogin();
            }
        });
    }

    private void checkLogin (){
        if (userNameedtTxt.getText().toString().equals("admin") && userPassedtTxt.getText().toString().equals("pass")){
            Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show();
        }
    }
}
