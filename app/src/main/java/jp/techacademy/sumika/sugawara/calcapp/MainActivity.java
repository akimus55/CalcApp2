package jp.techacademy.sumika.sugawara.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mEditText;
    TextView mTextView;

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

        mEditText = (EditText) findViewById(R.id.editText1);
        mEditText = (EditText) findViewById(R.id.editText2);
        mTextView = (TextView) findViewById(R.id.textView1);
        mTextView = (TextView) findViewById(R.id.textView2);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1",0);
        intent.putExtra("VALUE2",0);
        startActivity(intent);
        EditText editText1 = (EditText)findViewById(R.id.editText1);
        EditText editText2 = (EditText)findViewById(R.id.editText2);

        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();
        Double a = new Double(str1);
        Double b = new Double(str2);
        if(v.getId() == R.id.button1){
            Double c = a+b;
        }else if(v.getId() == R.id.button2){
            Double c = a-b;
        }else if(v.getId() == R.id.button3){
            Double c = a*b;
        }else if(v.getId() == R.id.button4){
            Double c = a/b;
        }
    }

}
