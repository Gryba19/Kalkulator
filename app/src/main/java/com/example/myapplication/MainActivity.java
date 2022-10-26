package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plus;
    Button minus;
    Button razy;
    Button dziel;
    TextView wynik;
    EditText liczba;
    EditText liczba2;
    Button potega;
    Button pier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=findViewById(R.id.Plus);
        minus=findViewById(R.id.Minus);
        razy=findViewById(R.id.Razy);
        dziel=findViewById(R.id.Dzielenie);
        wynik=findViewById(R.id.Wynik);
        liczba=findViewById(R.id.Liczba);
        liczba2=findViewById(R.id.Liczba2);
        potega=findViewById(R.id.Potegi);
        pier=findViewById(R.id.Pierwiastki);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(liczba.getText().toString());
                double num2=Double.parseDouble(liczba2.getText().toString());
                double sum = num1+num2;
                wynik.setText(String.valueOf(sum));
            }

        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(liczba.getText().toString());
                double num2=Double.parseDouble(liczba2.getText().toString());
                double odej = num1-num2;
                wynik.setText(String.valueOf(odej));
            }
        });
        razy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(liczba.getText().toString());
                double num2=Double.parseDouble(liczba2.getText().toString());
                double raz = num1*num2;
                wynik.setText(String.valueOf(raz));
            }

        });
        dziel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(liczba.getText().toString());
                double num2=Double.parseDouble(liczba2.getText().toString());

                if(num2==0) {
                    wynik.setText("Nie dziel przez zero");
                }
                else{
                    double dzielenie = num1 / num2;
                wynik.setText(String.valueOf(dzielenie));
            }}
        });
        potega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(liczba.getText().toString());
                double num2=Double.parseDouble(liczba2.getText().toString());
                double potegi = Math.pow(num1,num2) ;
                wynik.setText(String.valueOf(potegi));
            }

        });
        pier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(liczba.getText().toString());
                int num2=Integer.parseInt(liczba2.getText().toString());
                double pierwiastki = Math.pow(num1,1/num2) ;
                wynik.setText(String.valueOf(pierwiastki));
                }
        });




    }
}