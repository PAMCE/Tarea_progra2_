package com.example.triangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    //no coloque el boton de calcular porque ya estaban los imagebutton asi que no encontre sentido

    private EditText edt1, edt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        edt1 = (EditText)findViewById(R.id.number_1);
        edt2 = (EditText)findViewById(R.id.txt_valor2);




    }


    public void Sumar (View view){
        //obtengo lo que ingresa el usuario
        String valor1_string = edt1.getText().toString();
        String valor2_string = edt2.getText().toString();

        //parseo
        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        //operacion
        int suma = valor1_int +valor2_int;
        String resultado = String.valueOf(suma);


        //mensaje en pantalla
        Toast.makeText(this, "El resultado de la suma es: " + resultado, Toast.LENGTH_LONG).show();

    }

    public void Restar (View view){
        //obtengo lo que ingresa el usuario
        String valor1_string = edt1.getText().toString();
        String valor2_string = edt2.getText().toString();

        //parseo
        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        //operacion
        int resta = valor1_int - valor2_int;


        //mensaje en pantalla
        Toast.makeText(this, "El resultado de la resta es: " + resta, Toast.LENGTH_LONG).show();
    }

    public  void Multi(View view){
        //obtengo lo que ingresa el usuario
        String valor1_string = edt1.getText().toString();
        String valor2_string = edt2.getText().toString();

        //parseo
        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        //operacion
        int multi = valor1_int * valor2_int;


        //mensaje en pantalla
        Toast.makeText(this, "El resultado de la multiplicacion es: " + multi, Toast.LENGTH_SHORT).show();
        //.-.
    }

    public void divi(View view){
        //obtengo lo que ingresa el usuario
        String valor1_string = edt1.getText().toString();
        String valor2_string = edt2.getText().toString();

        //parseo
        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        //operacion


        if(valor2_int != 0){

            int divi = valor1_int / valor2_int;
            //mensaje en pantalla
            Toast.makeText(this, "El resultado de la divicion es: " + divi, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "no se puede dividir entre cero", Toast.LENGTH_SHORT).show();
        }



    }

    public  void limpiar(View view){
        edt1.setText("");
        edt2.setText("");
    }

    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

    public void BtnBisiesto(View view){
        Intent siguiente = new Intent(this, Bisiesto.class);
        startActivity(siguiente);
    }


}