package com.demo.hellointent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  public static final String LABEL = "label";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void goToDeepLink(View view) {
    Intent intent = new Intent();
    intent.putExtra(LABEL, ((Button) view).getText());
    intent.setData(Uri.parse("tony://detail/path"));
    intent.setPackage(getPackageName());
    startActivity(intent);
  }

  public void goToDefault(View view) {
    Intent intent = new Intent(this, DefaultActivity.class);
    intent.putExtra("label", ((Button) view).getText());
    startActivity(intent);
  }
}