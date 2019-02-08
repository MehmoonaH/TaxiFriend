package com.example.u1763238.fnalovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    private EditText userName, userPassword;
    private Button regButton;
    private TextView forgottonPass;
    private TextView newUser ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this, RegistrationActivity.class));
            }
        });
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()) ;
                //upload data to the database
            }
        });
    }

    private void setupUIViews(){
        userName = (EditText)findViewById(R.id.etUserNameL);
        userPassword = (EditText)findViewById(R.id.etUserPassL);
        regButton = (Button)findViewById(R.id.btLoginL);
        newUser = (TextView) findViewById(R.id.tvRegisterL);
        forgottonPass =(TextView) findViewById(R.id.tvForgottenPassL);
    }

    private boolean validate() {
        boolean result = false;

        String name = userName.getText().toString();
        String password = userPassword.getText().toString();

        if (name.isEmpty() && password.isEmpty() ) {
            Toast.makeText(this, "please enter all the details", Toast.LENGTH_SHORT).show();
        }else {
            result = true;
        }
        return result;
    }
}
