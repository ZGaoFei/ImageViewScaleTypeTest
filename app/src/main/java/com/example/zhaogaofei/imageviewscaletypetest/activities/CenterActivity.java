package com.example.zhaogaofei.imageviewscaletypetest.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.zhaogaofei.imageviewscaletypetest.R;

public class CenterActivity extends AppCompatActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, CenterActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center);
    }
}
