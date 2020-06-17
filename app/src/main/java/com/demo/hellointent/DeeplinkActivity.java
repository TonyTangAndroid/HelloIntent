package com.demo.hellointent;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DeeplinkActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_text);
    TextView tv_text = findViewById(R.id.tv_text);
    tv_text.append(getIntent().getStringExtra(MainActivity.LABEL));
    tv_text.append("uri:");
    Uri data = getIntent().getData();
    tv_text.append(data == null ? "" : data.toString());

  }
}