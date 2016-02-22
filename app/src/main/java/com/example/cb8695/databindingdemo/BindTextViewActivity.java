package com.example.cb8695.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

import com.example.cb8695.databindingdemo.databinding.ActivityBindTextViewBinding;

public class BindTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActivityBindTextViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bind_text_view);
        User user = new User(51, "马云");
        binding.setUser(user);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
