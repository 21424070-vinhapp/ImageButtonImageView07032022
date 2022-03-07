package com.example.imagebuttonimageview07032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button mBtnDoiHinh;
    ImageButton mBtnClose;
    ImageView mImgHinh, mImgClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnClose=findViewById(R.id.btnClose);
        mBtnDoiHinh=findViewById(R.id.btnDoiHinh);
        mImgHinh=findViewById(R.id.imgHinh);
        mImgClose=findViewById(R.id.imgClose);

        mBtnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mBtnDoiHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mImgHinh.getTag()==null||mImgHinh.getTag().equals("h1"))
                {
                    mImgHinh.setImageResource(R.drawable.bohoahong);
                    mImgHinh.setTag("h2");
                }
                else
                {
                    mImgHinh.setImageResource(R.drawable.hoahongdo);
                    mImgHinh.setTag("h1");
                }
            }
        });
    }
}