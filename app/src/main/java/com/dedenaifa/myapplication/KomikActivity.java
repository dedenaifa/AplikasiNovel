package com.dedenaifa.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KomikActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komik);

        Button btnKomik1 = findViewById(R.id.btnKomik1);
        Button btnKomik2 = findViewById(R.id.btnKomik2);
        Button btnKomik3 = findViewById(R.id.btnKomik3);
        Button btnKomik4 = findViewById(R.id.btnKomik4);
        Button btnKomik5 = findViewById(R.id.btnKomik5);

        btnKomik1.setOnClickListener(this);
        btnKomik2.setOnClickListener(this);
        btnKomik3.setOnClickListener(this);
        btnKomik4.setOnClickListener(this);
        btnKomik5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // Mengecek tombol mana yang diklik
        if (v.getId() ==  R.id.btnKomik1) {
            // Jika tombol "One Piece" diklik
            Intent intent = new Intent(KomikActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : One Piece");
            intent.putExtra("item_date", "Tahun Terbit : 1997");
            intent.putExtra("item_publisher", "Penulis : Eiichiro Oda");
            startActivity(intent);
            // Menambahkan penanganan klik untuk tombol-tombol lainnya jika diperlukan
        } else if (v.getId() == R.id.btnKomik2) {
            Intent intent = new Intent(KomikActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Kingdom");
            intent.putExtra("item_date", "Tahun Terbit : 2006");
            intent.putExtra("item_publisher", "Penulis :Yasuhisa Hara");
            startActivity(intent);

        } else if (v.getId() == R.id.btnKomik3) {
            Intent intent = new Intent(KomikActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Grand Blue");
            intent.putExtra("item_date", "Tahun Terbit : 2014");
            intent.putExtra("item_publisher", "Penulis : Kenji Inoue");
            startActivity(intent);
        } else if (v.getId() == R.id.btnKomik4 ) {
            Intent intent = new Intent(KomikActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Demon Slayer");
            intent.putExtra("item_date", "Tahun Terbit : 2016");
            intent.putExtra("item_publisher", "Penulis : Koyoharu Gotouge");
            startActivity(intent);
        } else if (v.getId() == R.id.btnKomik5 ) {
            Intent intent = new Intent(KomikActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Jujutsu Kaisen");
            intent.putExtra("item_date", "Tahun Terbit : 2018");
            intent.putExtra("item_publisher", "Penulis : Gege Akutami");
            startActivity(intent);
        }
    }
}