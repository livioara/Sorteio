package com.curso.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){

        TextView edit = findViewById(R.id.textView3 );
        int x1 = new Random().nextInt(61);
        int x2 = new Random().nextInt(61);
        int x3 = new Random().nextInt(61);
        int x4 = new Random().nextInt(61);
        int x5 = new Random().nextInt(61);
        int x6 = new Random().nextInt(61);
        edit.setText( x1 +"-"+ x2+"-"+x3+"-"+x4+"-"+x5+"-"+x6);



    }
}