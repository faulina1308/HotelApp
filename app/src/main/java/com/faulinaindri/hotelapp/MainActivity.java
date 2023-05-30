package com.faulinaindri.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1=(ImageView) findViewById(R.id.imageview1);

        String imageUrl ="https://shopee.co.id/inspirasi-shopee/wp-content/uploads/2022/05/hotel-dekat-pantai-jogja.webp";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}