package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador1, contador2, contador3, contador4, contadortotal;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // AUGMENTOS -->

        binding.augmento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

        binding.augmento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

        binding.augmento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

        binding.augmento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

        // RESETS -->

        binding.Resettotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                binding.contador1.setText(String.valueOf(contador1));
                contador2 = 0;
                binding.contador2.setText(String.valueOf(contador2));
                contador3 = 0;
                binding.contador3.setText(String.valueOf(contador3));
                contador4 = 0;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1 = 0;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2 = 0;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3 = 0;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4 = 0;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadortotal.setText(String.valueOf(contador1+contador2+contador3+contador4));
            }
        });

    }
}