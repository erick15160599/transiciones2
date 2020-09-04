package com.example.transiciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    //metodo para la transicion de regreso
    public void Anterior(View View) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
        overridePendingTransition(R.anim.explode_in,R.anim.explode_out);

    }
}