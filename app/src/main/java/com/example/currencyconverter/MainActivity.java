package com.example.currencyconverter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {



		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.activity_main);

				ImageButton img1 = findViewById(R.id.image1);
				img1.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
								Intent i = new Intent(MainActivity.this, JMDConversions.class);
								startActivity(i);
						}
				});

				ImageButton img2 = findViewById(R.id.image2);
				img2.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
								Intent i = new Intent(MainActivity.this, JMDtoUSD.class);
								startActivity(i);
						}
				});

				ImageButton img3 = findViewById(R.id.image3);
				img3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
								Intent i = new Intent(MainActivity.this, EUROconversions.class);
								startActivity(i);
						}
				});

				ImageButton img4 = findViewById(R.id.image4);
				img4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
								Intent i = new Intent(MainActivity.this, CANConversions.class);
								startActivity(i);
						}
				});



		}




}
