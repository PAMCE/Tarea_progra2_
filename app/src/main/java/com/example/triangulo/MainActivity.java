package com.example.triangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt1, edt2, edt3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.txt_ladoA);
        edt2 = (EditText)findViewById(R.id.txt_ladoB);
        edt3 =  (EditText)findViewById(R.id.txt_resultado);



    }

    //metodo que realiza el calculo :v

    public void Hipotenusa(View view){
        String valor1_string = edt1.getText().toString();
        String valor2_string = edt2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        int operacion1 = (int) Math.pow(valor1_int,2);
        int operacion2 = (int) Math.pow(valor2_int,2);

        int operacion3 = (int) operacion1 + operacion2;

        int operacion4 = (int) Math.sqrt(operacion3);

        String resultado  =  String.valueOf(operacion4);
        edt3.setText(resultado);

    }

    public void BtonCaluladora (View view){
        Intent siguiente  = new Intent (this,Calculadora.class);
        startActivity(siguiente);
    }

    public void BtnBisiesto(View view){
        Intent siguiente = new Intent(this, Bisiesto.class);
        startActivity(siguiente);
    }

}