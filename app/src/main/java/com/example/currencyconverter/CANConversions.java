package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CANConversions extends AppCompatActivity {

		Double conversionFactorCANtoEURO = 0.65;
		Double conversionFactorCANtoUSD = 0.70;
		Double conversionFactorCANtoJMD = 95.63;
		EditText CANtoJMD;
		EditText CANtoUSD;
		EditText CANtoEuro;
		Button SubmitCANtoJMD;
		Button SubmitCANtoUSD;
		Button SubmitCANtoEuro;
		Button Reset;
		TextView Result;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.canconversions);

				CANtoJMD = (EditText)findViewById(R.id.CANtoJMDInput);
				CANtoUSD = (EditText)findViewById(R.id.CANtoUSDInput);
				CANtoEuro = (EditText)findViewById(R.id.CANtoEUROInput);
				SubmitCANtoJMD = (Button) findViewById(R.id.submitCANtoJMD);
				SubmitCANtoUSD = (Button)findViewById(R.id.submitCANtoUSD);
				SubmitCANtoEuro = (Button)findViewById(R.id.submitCANtoEuro);
				Reset = (Button)findViewById(R.id.reset);
				Result = (TextView)findViewById(R.id.result);

				SubmitCANtoJMD.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int canAmount = Integer.parseInt(CANtoJMD.getText().toString());
								double jmdValue = canAmount * conversionFactorCANtoJMD;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", jmdValue);
								Result.setText("$" + formattedValue);

						}


				});

				SubmitCANtoUSD.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int canAmount = Integer.parseInt(CANtoUSD.getText().toString());
								double usdValue = canAmount * conversionFactorCANtoUSD;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f",usdValue);
								Result.setText("$" + formattedValue);

						}
				});

				SubmitCANtoEuro.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {


								int canAmount = Integer.parseInt(CANtoEuro.getText().toString());
								double euroValue = canAmount * conversionFactorCANtoEURO;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", euroValue);
								Result.setText("$" + formattedValue);


						}
				});

				Reset.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
								CANtoJMD.setText("");
								CANtoUSD.setText("");
								CANtoEuro.setText("");
								Result.setText("");
						}
				});


		}


}
