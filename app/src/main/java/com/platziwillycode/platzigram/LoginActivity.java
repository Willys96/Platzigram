package com.platziwillycode.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.platziwillycode.platzigram.view.ContainerActivity;
import com.platziwillycode.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent= new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goContaier(View view){
        Intent llamado= new Intent(this, ContainerActivity.class);
        startActivity(llamado);
    }
}
