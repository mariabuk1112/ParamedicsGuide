package com.example.sarah.paramedicsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void toLoginPage(View view) {
        Intent intent = new Intent(home_page.this,login_page.class);
        startActivity(intent);
    }
}
