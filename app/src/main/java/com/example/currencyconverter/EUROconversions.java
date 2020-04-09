package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EUROconversions extends AppCompatActivity {

		Double conversionFactorEUROtoCAN = 1.55;
		Double conversionFactorEUROtoJMD = 147.72;
		Double conversionFactorEUROtoUSD = 1.09;
		EditText EUROtoJMD;
		EditText EUROtoUSD;
		EditText EUROtoCAN;
		Button SubmitEUROtoJMD;
		Button SubmitEUROtoUSD;
		Button SubmitEUROtoCAN;
		Button Reset;
		TextView Result;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.euroconversions);

				EUROtoJMD = (EditText)findViewById(R.id.EUROtoJMDInput);
				EUROtoUSD = (EditText)findViewById(R.id.EUROtoUSDInput);
				EUROtoCAN = (EditText)findViewById(R.id.EUROtoCANInput);
				SubmitEUROtoJMD = (Button) findViewById(R.id.submitEUROtoJMD);
				SubmitEUROtoUSD = (Button)findViewById(R.id.submitEUROtoUSD);
				SubmitEUROtoCAN = (Button)findViewById(R.id.submitEUROtoCAN);
				Reset = (Button)findViewById(R.id.reset);
				Result = (TextView)findViewById(R.id.result);

				SubmitEUROtoJMD.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int euroAmount = Integer.parseInt(EUROtoJMD.getText().toString());
								double jmdValue = euroAmount * conversionFactorEUROtoJMD;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", jmdValue);
								Result.setText("$" + formattedValue);

						}


				});

				SubmitEUROtoUSD.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int euroAmount = Integer.parseInt(EUROtoUSD.getText().toString());
								double usdValue = euroAmount * conversionFactorEUROtoUSD;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", usdValue);
								Result.setText("$" + formattedValue);

						}
				});

				SubmitEUROtoCAN.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int euroAmount = Integer.parseInt(EUROtoCAN.getText().toString());
								double canValue = euroAmount * conversionFactorEUROtoCAN;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", canValue);
								Result.setText("$" + formattedValue);

						}
				});

				Reset.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
								EUROtoJMD.setText("");
								EUROtoUSD.setText("");
								EUROtoCAN.setText("");
								Result.setText("");
						}
				});


		}


}
