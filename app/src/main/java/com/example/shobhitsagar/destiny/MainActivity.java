package com.example.shobhitsagar.destiny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText first;
    EditText second;
    EditText third;
    Button generate;
    TextView destinytxt;
    Random random;
    String[] strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        third = (EditText) findViewById(R.id.third);
        generate = (Button) findViewById(R.id.generate);
        destinytxt = (TextView) findViewById(R.id.destinytxt);

        generate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String fr = first.getText().toString();
                String sc = second.getText().toString();
                String tr = third.getText().toString();

                strings = new String[]{fr, sc, tr};
                int rand = (int) (Math.random() * 3);
                destinytxt.setText(strings[rand]);
            }
        });

    }

    public void reset(View view) {
        destinytxt.setText("");
        first.setText("");
        second.setText("");
        third.setText("");
    }
}
