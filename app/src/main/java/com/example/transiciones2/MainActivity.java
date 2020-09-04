package com.example.transiciones2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //método para efecto de transición explode
    public void Explode(View View) {
        Intent explode = new Intent(this, MainActivity2.class);
        startActivity(explode);
        overridePendingTransition(R.anim.explode_in,R.anim.explode_out);
    }

    //método para efecto de transición slide
    public void Slide(View View) {
        Intent slide = new Intent(this, MainActivity3.class);
        startActivity(slide);
        overridePendingTransition(R.transition.slide_in,R.transition.slide_out);
    }

    //método para el efecto de transición fade
    public void Fade(View View) {
        Intent fade = new Intent(this, MainActivity4.class);
        startActivity(fade);
        overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }



}