package com.dedenaifa.myapplication;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public static final String KEY_DATA = "key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get the item name from the intent
        Intent intent = getIntent();
        String itemName = getIntent().getStringExtra("item_name");
        String itemDate = getIntent().getStringExtra("item_date");
        String itemPublisher = getIntent().getStringExtra("item_publisher");

        // Assuming you have a TextView to display the item name
        TextView tvName = findViewById(R.id.tvitemNameTextView);
        TextView tvDate = findViewById(R.id.tvItemDateTextView);
        TextView tvPublisher = findViewById(R.id.tvItemPublisherTextView);

        Detail2Activity detail2;
        if (Build.VERSION.SDK_INT >= 33) {
            detail2 = getIntent().getParcelableExtra(KEY_DATA, Detail2Activity.class);
        } else {
            detail2 = getIntent().getParcelableExtra(KEY_DATA);
        }

        // Set the text of the TextView with the item name
        tvName.setText(itemName);
        tvDate.setText(itemDate);
        tvPublisher.setText(itemPublisher);

        Button btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareItemDetails(itemName, itemDate, itemPublisher);
            }
        });
    }

    private void shareItemDetails(String name, String date, String publisher) {
        String shareText = "Name: " + name + "\nDate: " + date + "\nPublisher: " + publisher;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }
}