package com.example.zhaogaofei.imageviewscaletypetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zhaogaofei.imageviewscaletypetest.activities.CenterActivity;
import com.example.zhaogaofei.imageviewscaletypetest.activities.FitActivity;
import com.example.zhaogaofei.imageviewscaletypetest.activities.FitXYActivity;
import com.example.zhaogaofei.imageviewscaletypetest.activities.MatrixActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button btMatrix = (Button) findViewById(R.id.bt_matrix);
        btMatrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MatrixActivity.start(MainActivity.this);
            }
        });

        Button btFitXY = (Button) findViewById(R.id.bt_fitXY);
        btFitXY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FitXYActivity.start(MainActivity.this);
            }
        });

        Button btFit = (Button) findViewById(R.id.bt_fit);
        btFit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FitActivity.start(MainActivity.this);
            }
        });

        Button btCenter = (Button) findViewById(R.id.bt_center);
        btCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CenterActivity.start(MainActivity.this);
            }
        });
    }
}
