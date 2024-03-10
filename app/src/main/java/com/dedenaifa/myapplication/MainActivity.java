package com.dedenaifa.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cerpenButton = findViewById(R.id.button_cerpen);
        Button komikButton = findViewById(R.id.button_komik);
        Button fiksiIlmiahButton = findViewById(R.id.button_fiksi_ilmiah);

        cerpenButton.setOnClickListener(this);
        komikButton.setOnClickListener(this);
        fiksiIlmiahButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        if (view.getId() == R.id.button_cerpen) {
            intent = new Intent(MainActivity.this, CerpenActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.button_komik) {
            intent = new Intent(MainActivity.this, KomikActivity.class);
        } else if (view.getId() == R.id.button_fiksi_ilmiah) {
            intent = new Intent(MainActivity.this, FiksiIlmiahActivity.class);
        }

        if (intent != null) {
            startActivity(intent);
        } else {
            // Kasus ini menangani tombol yang tidak dikenali.
            // Tindakan yang sesuai dapat diambil di sini, seperti menampilkan pesan kesalahan.
        }
    }
}