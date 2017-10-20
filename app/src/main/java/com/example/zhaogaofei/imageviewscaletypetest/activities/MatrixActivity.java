package com.example.zhaogaofei.imageviewscaletypetest.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhaogaofei.imageviewscaletypetest.R;

public class MatrixActivity extends AppCompatActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, MatrixActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix);
    }
}
