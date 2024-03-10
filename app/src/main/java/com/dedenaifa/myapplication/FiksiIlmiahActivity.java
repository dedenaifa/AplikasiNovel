package com.dedenaifa.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FiksiIlmiahActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiksi_ilmiah);

        Button btnFiksiilmiah1 = findViewById(R.id.btnFiksiIlmiah1);
        Button btnFiksiilmiah2 = findViewById(R.id.btnFiksiIlmiah2 );
        Button btnFiksiilmiah3 = findViewById(R.id.btnFiksiIlmiah3 );
        Button btnFiksiilmiah4 = findViewById(R.id.btnFiksiIlmiah4 );
        Button btnFiksiilmiah5 = findViewById(R.id.btnFiksiIlmiah5 );

        btnFiksiilmiah1.setOnClickListener(this);
        btnFiksiilmiah2.setOnClickListener(this);
        btnFiksiilmiah3 .setOnClickListener(this);
        btnFiksiilmiah4 .setOnClickListener(this);
        btnFiksiilmiah5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // Mengecek tombol mana yang diklik
        if (v.getId() ==  R.id.btnFiksiIlmiah1 ) {
            // Jika tombol "Alien" diklik
            Intent intent = new Intent(FiksiIlmiahActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Alien");
            intent.putExtra("item_date", "Tahun Terbit : 1898");
            intent.putExtra("item_publisher", "Penulis : H.G.Wells");
            startActivity(intent);
            // Menambahkan penanganan klik untuk tombol-tombol lainnya jika diperlukan
        } else if (v.getId() == R.id.btnFiksiIlmiah2 ) {
            Intent intent = new Intent(FiksiIlmiahActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : The Terminator");
            intent.putExtra("item_date", "Tahun Terbit : 1984");
            intent.putExtra("item_publisher", "Penulis :James Cameron");
            startActivity(intent);

        } else if (v.getId() == R.id.btnFiksiIlmiah3 ) {
            Intent intent = new Intent(FiksiIlmiahActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Blade Runner");
            intent.putExtra("item_date", "Tahun Terbit : 1982");
            intent.putExtra("item_publisher", "Penulis : Ridley Scott");
            startActivity(intent);
        } else if (v.getId() == R.id.btnFiksiIlmiah4  ) {
            Intent intent = new Intent(FiksiIlmiahActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : The Thing");
            intent.putExtra("item_date", "Tahun Terbit : 2010");
            intent.putExtra("item_publisher", "Penulis : Peter Watts");
            startActivity(intent);
        } else if (v.getId() == R.id.btnFiksiIlmiah5  ) {
            Intent intent = new Intent(FiksiIlmiahActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama :Insterstella");
            intent.putExtra("item_date", "Tahun Terbit : 2014");
            intent.putExtra("item_publisher", "Penulis : Christopher Nolan");
            startActivity(intent);
        }
    }
}