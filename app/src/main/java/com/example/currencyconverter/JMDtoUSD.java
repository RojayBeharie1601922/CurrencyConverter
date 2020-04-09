package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JMDtoUSD extends AppCompatActivity {

		Double conversionFactorUSDtoEURO = 0.92;
		Double conversionFactorUSDtoCAN = 1.42;
		Double conversionFactorUSDtoJMD = 135.82;
		EditText USDtoJMD;
		EditText USDtoCAN;
		EditText USDtoEuro;
		Button SubmitUSDtoJMD;
		Button SubmitUSDtoCAN;
		Button SubmitUSDtoEuro;
		Button Reset;
		TextView Result;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.jmd_usd_act);

				USDtoJMD = (EditText)findViewById(R.id.UStoJMDInput);
				USDtoCAN = (EditText)findViewById(R.id.UStoCANInput);
				USDtoEuro = (EditText)findViewById(R.id.UStoEUROInput);
				SubmitUSDtoJMD = (Button) findViewById(R.id.submitUStoJMD);
				SubmitUSDtoCAN = (Button)findViewById(R.id.submitUStoCAN);
				SubmitUSDtoEuro = (Button)findViewById(R.id.submitUStoEuro);
				Reset = (Button)findViewById(R.id.reset);
				Result = (TextView)findViewById(R.id.result);

				SubmitUSDtoJMD.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int usdAmount = Integer.parseInt(USDtoJMD.getText().toString());
								double jmdValue = usdAmount * conversionFactorUSDtoJMD;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", jmdValue);
								Result.setText("$" + formattedValue);

						}
						

				});
				
				SubmitUSDtoCAN.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int usdAmount = Integer.parseInt(USDtoCAN.getText().toString());
								double canValue = usdAmount * conversionFactorUSDtoCAN;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", canValue);
								Result.setText("$" + formattedValue);

						}
				});

				SubmitUSDtoEuro.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int usdAmount = Integer.parseInt(USDtoEuro.getText().toString());
								double euroValue = usdAmount * conversionFactorUSDtoEURO;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", euroValue);
								Result.setText("$" + formattedValue);

						}
				});

				Reset.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
								USDtoJMD.setText("");
								USDtoCAN.setText("");
								USDtoEuro.setText("");
								Result.setText("");
						}
				});


		}


}

