package com.example.admin.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MessagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        getSupportActionBar().setTitle("messages");
    }
}
