package jp.techacademy.sumika.sugawara.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.Double;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Double c= intent.getDoubleExtra("Double c",0);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(c));
    }
}
