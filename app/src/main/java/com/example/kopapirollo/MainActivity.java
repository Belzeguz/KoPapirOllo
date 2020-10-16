package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

        Button b_ko, b_papir, b_ollo;
        ImageView iv_gep, iv_jatekos;

        String jatekosValasztas, gepValasztas;

        @Override
    protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            iv_gep = (ImageView) findViewById(R.id.iv_gep);
            iv_jatekos = (ImageView) findViewById(R.id.iv_jatekos);

            b_ko = (Button) findViewById(R.id.b_ko);
            b_papir = (Button) findViewById(R.id.b_papir);
            b_ollo = (Button) findViewById(R.id.b_ollo);

            b_ko.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v)
            {

        }});
            b_papir.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v)
                {

                }});
            b_ollo.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v)
                {

                }});

    }
}