package com.example.cb8695.databindingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bindTextView(View view) {
        Intent intent = new Intent(this, BindTextViewActivity.class);
        startActivity(intent);
    }

    public void bindListView(View view) {
        Intent intent = new Intent(this, BindRecyclerViewActivity.class);
        startActivity(intent);
    }
}
