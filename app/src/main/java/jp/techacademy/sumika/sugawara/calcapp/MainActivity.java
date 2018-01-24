package jp.techacademy.sumika.sugawara.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Double;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText editText1 = (EditText)findViewById(R.id.editText1);
        EditText editText2 = (EditText)findViewById(R.id.editText2);

        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();
        Double a = new Double(0);
        Double b = new Double(0);

        try{
            a = new Double(str1);
            b = new Double(str2);
        }catch (Exception e){
            Toast.makeText(this, "数値が入力されていません。", Toast.LENGTH_LONG).show();
            return;
        }

        double c = 0;
        if(v.getId() == R.id.button1){
            c = a+b;
        }else if(v.getId() == R.id.button2){
            c = a-b;
        }else if(v.getId() == R.id.button3){
            c = a*b;
        }else if(v.getId() == R.id.button4) {
            if (b==0) {
                Toast.makeText(this, "0では割り算できません。", Toast.LENGTH_LONG).show();
                return;
            }
            c = a / b;
        }
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Double c",c);
        startActivity(intent);

        }
    }
