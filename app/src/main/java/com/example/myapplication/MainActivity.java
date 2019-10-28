package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

import static com.example.myapplication.R.id.btn;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static String TAG ="Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        EditText inp = findViewById(R.id.inp);
        String str = inp.getText().toString();
        /*inp.setText("12345");*/


        TextView out = findViewById(R.id.txtout);
       /* out.setText("Hello kk");*/
    }
    public void onClick(View v)
    {
        EditText inp = findViewById(R.id.inp);
        String str = inp.getText()+"";
       /* String str = ((Button)v).getText()+"";*/
        double num = Double.parseDouble(str);
        num = 1.8*num + 32;
        BigDecimal c = new BigDecimal(num);
        num = c.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        inp.setText(num+"");
        /*((Button) v).setText(num+"");*/
      /* Log.i(TAG,  "onClick:…………");
       TextView out = findViewById(R.id.txtout);
       out.setText("Clicked");*/
    }
   /* public void abc(View v)
    {
        Log.i(TAG,  "abc:…………");
        TextView out = findViewById(R.id.txtout);
        out.setText("abcabc");
    }*/

}
