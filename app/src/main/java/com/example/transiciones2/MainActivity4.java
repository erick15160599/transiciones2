package com.example.transiciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    //metodo para la transicion anterior
    public void Anterior(View View) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }
}