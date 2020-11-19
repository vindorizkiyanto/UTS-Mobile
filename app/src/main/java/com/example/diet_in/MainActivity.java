package com.example.diet_in;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private MenuForm form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        form = new MenuForm(this);

        form.getButtonMenu().setOnClickListener(this);
        form.getBtnInfo().setOnClickListener(this);
        form.getBtnExit().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == form.getButtonMenu()){
            Intent intent = new Intent(this,ListMenu.class);
            startActivity(intent);
        }else if(v == form.getBtnInfo()){
            Intent intent = new Intent(this,InfoAplikasi.class);
            startActivity(intent);
        }else if(v == form.getBtnExit()){
            finish();
        }
    }
}