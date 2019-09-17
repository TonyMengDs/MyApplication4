package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        inp.setText("12345");


        TextView out = findViewById(R.id.txtout);
        out.setText("Hello kk");
    }
    public void onClick(View v)
    {
       Log.i(TAG,  "onClick:…………");
       TextView out = findViewById(R.id.txtout);
       out.setText("Clicked");
    }
    public void abc(View v)
    {
        Log.i(TAG,  "abc:…………");
        TextView out = findViewById(R.id.txtout);
        out.setText("abcabc");
    }

}
