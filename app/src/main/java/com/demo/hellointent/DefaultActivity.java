package com.demo.hellointent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DefaultActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_text);
    TextView tv_text = findViewById(R.id.tv_text);
    tv_text.append(getIntent().getStringExtra(MainActivity.LABEL));
  }
}