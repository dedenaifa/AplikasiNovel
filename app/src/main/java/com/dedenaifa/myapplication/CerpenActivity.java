package com.dedenaifa.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CerpenActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerpen);

        Button btnCerpen1 = findViewById(R.id.btnCerpen1);
        Button btnCerpen2 = findViewById(R.id.btnCerpen2);
        Button btnCerpen3 = findViewById(R.id.btnCerpen3);
        Button btnCerpen4 = findViewById(R.id.btnCerpen4);
        Button btnCerpen5 = findViewById(R.id.btnCerpen5);

        btnCerpen1.setOnClickListener(this);
        btnCerpen2.setOnClickListener(this);
        btnCerpen3.setOnClickListener(this);
        btnCerpen4.setOnClickListener(this);
        btnCerpen5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // Mengecek tombol mana yang diklik
        if (v.getId() ==  R.id.btnCerpen1) {
            // Jika tombol "Impian Angsa Kecil" diklik
            Intent intent = new Intent(CerpenActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Impian Angsa Kecil");
            intent.putExtra("item_date", "Tahun Terbit : 1843");
            intent.putExtra("item_publisher", "Penulis : Hans Christian Andersen");
            startActivity(intent);
            // Menambahkan penanganan klik untuk tombol-tombol lainnya jika diperlukan
        } else if (v.getId() == R.id.btnCerpen2) {
            Intent intent = new Intent(CerpenActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Kesepian Masa Tua");
            intent.putExtra("item_date", "Tahun Terbit : 2017");
            intent.putExtra("item_publisher", "Penulis : Gail Honeyman");
            startActivity(intent);

        } else if (v.getId() == R.id.btnCerpen3) {
            Intent intent = new Intent(CerpenActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Semua Belum Usai");
            intent.putExtra("item_date", "Tahun Terbit : 2021");
            intent.putExtra("item_publisher", "Penulis : Eka Kurniawan");
            startActivity(intent);
        } else if (v.getId() == R.id.btnCerpen4) {
            Intent intent = new Intent(CerpenActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Tak Gentar");
            intent.putExtra("item_date", "Tahun Terbit : 2004");
            intent.putExtra("item_publisher", "Penulis : Faisal Tehrani");
            startActivity(intent);
        } else if (v.getId() == R.id.btnCerpen5) {
            Intent intent = new Intent(CerpenActivity.this, DetailActivity.class);
            intent.putExtra("item_name", "Nama : Terimakasih Ibu");
            intent.putExtra("item_date", "Tahun Terbit : 2016");
            intent.putExtra("item_publisher", "Penulis : Ukjae Lee");
            startActivity(intent);
        }
    }
}