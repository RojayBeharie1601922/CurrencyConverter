package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JMDConversions extends AppCompatActivity {



		@Override
		protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.jmdconversions);
				final double conversionFactorJMDtoUSD = 0.0074;
				final double conversionFactorJMDtoEURO = 0.0068;
				final double conversionFactorJMDtoCAN = 0.010;
				final EditText JMDtoEURO;
				final EditText JMDtoUSD;
				final EditText JMDtoCAN;
				Button SubmitJMDtoEURO;
				Button SubmitJMDtoUSD;
				Button SubmitJMDtoCAN;
				Button Reset;
				final TextView Result;

				JMDtoEURO = (EditText)findViewById(R.id.JMDtoEUROInput);
				JMDtoUSD = (EditText)findViewById(R.id.JMDtoUSDInput);
				JMDtoCAN = (EditText)findViewById(R.id.JMDtoCANInput);
				SubmitJMDtoEURO = findViewById(R.id.submitJMDtoEURO);
				SubmitJMDtoUSD = (Button)findViewById(R.id.submitJMDtoUSD);
				SubmitJMDtoCAN = (Button)findViewById(R.id.submitJMDtoCAN);
				Reset = (Button)findViewById(R.id.reset);
				Result = (TextView)findViewById(R.id.result);

				SubmitJMDtoEURO.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int jmdAmount = Integer.parseInt(JMDtoEURO.getText().toString());
								double euroValue = jmdAmount * conversionFactorJMDtoEURO;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", euroValue);
								Result.setText("$" + formattedValue);

						}


				});

				SubmitJMDtoUSD.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int jmdAmount = Integer.parseInt(JMDtoUSD.getText().toString());
								double usdValue = jmdAmount * conversionFactorJMDtoUSD;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", usdValue);
								Result.setText("$" + formattedValue);

						}
				});

				SubmitJMDtoCAN.setOnClickListener(new View.OnClickListener() {
						@SuppressLint("SetTextI18n")
						@Override
						public void onClick(View v) {

								int jmdAmount = Integer.parseInt(JMDtoCAN.getText().toString());
								double canValue = jmdAmount * conversionFactorJMDtoCAN;
								@SuppressLint("DefaultLocale") String formattedValue = String.format("%.2f", canValue);
								Result.setText("$" + formattedValue);

						}
				});

				Reset.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
								JMDtoEURO.setText("");
								JMDtoUSD.setText("");
								JMDtoCAN.setText("");
								Result.setText("");
						}
				});


		}


}
