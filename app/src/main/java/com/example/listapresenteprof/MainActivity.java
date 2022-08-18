package com.example.listapresenteprof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity
{
    private FloatingActionButton buttonAddGift;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddGift = findViewById(R.id.button_add);


        buttonAddGift.setOnClickListener
                (new View.OnClickListener()
                 {
                     @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(
                                getApplicationContext(), //contexto da aplicação parametro 1
                                AddGiftActivity.class // classe que a gente quer chama parametro2
                        );
                        startActivity(intent); //BOTAO P IR PRA OUTRA TELA
                    }
                  }
                );

    }
}

//se eu fosse o professor eu começava a vir de regata