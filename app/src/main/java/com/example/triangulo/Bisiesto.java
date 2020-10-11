package com.example.triangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Bisiesto extends AppCompatActivity {




    private EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisiesto);

        edt1 = (EditText)findViewById(R.id.number_1);

    }





    public void BtnVerificar(View view){

        String Año = edt1.getText().toString();

        int Año_int = Integer.parseInt(Año);

        String respuesta = String.valueOf(Año_int);

        // operacion
        if((Año_int % 4 == 0) && (Año_int % 100 != 0 ) || (Año_int % 400 == 0)){

            Toast.makeText(this, "El año " + respuesta + " es bisiesto :D", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "El año " + respuesta + " no es bisiesto D:", Toast.LENGTH_LONG).show();
        }


    }


    public void BtonCaluladora (View view){
        Intent siguiente  = new Intent (this,Calculadora.class);
        startActivity(siguiente);
    }

    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }


}