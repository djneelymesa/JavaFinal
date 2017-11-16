package com.example.dalton.afinal;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private View.OnClickListener input1 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("1");
        }
    };
    private View.OnClickListener input2 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("2");
        }
    };
    private View.OnClickListener input3 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("3");
        }
    };
    private View.OnClickListener input4 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("4");
        }
    };
    private View.OnClickListener input5 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("5");
        }
    };
    private View.OnClickListener input6 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("6");
        }
    };
    private View.OnClickListener input7 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("7");
        }
    };
    private View.OnClickListener input8 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("8");
        }
    };
    private View.OnClickListener input9 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textbox = (TextView) findViewById(R.id.textbox);
            textbox.append("9");
        }
    };

    private View.OnClickListener input0 = new View.OnClickListener(){
        public void onClick(View v){
            TextView textBox = findViewById(R.id.textbox);
            textBox.append("0");
        }
    };

    private View.OnClickListener inputBack = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TextView textBox = findViewById(R.id.textbox);
            String input;
            input = textBox.getEditableText().toString();
            if(input.length() != 0)
                textBox.setText(input.substring(0, input.length() - 1).toCharArray(), 0, input.length() - 1);
        }
    };

    private View.OnClickListener inputClear = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            TextView textBox = findViewById(R.id.textbox);
            textBox.setText("");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oneButton = (Button) findViewById(R.id.oneButton);
        oneButton.setOnClickListener(input1);
        Button twoButton = (Button) findViewById(R.id.twoButton);
        twoButton.setOnClickListener(input2);
        Button threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(input3);
        Button fourButton = (Button) findViewById(R.id.fourButton);
        fourButton.setOnClickListener(input4);
        Button fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(input5);
        Button sixButton = (Button) findViewById(R.id.sixButton);
        sixButton.setOnClickListener(input6);
        Button sevenButton = (Button) findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(input7);
        Button eightButton = (Button) findViewById(R.id.eightButton);
        eightButton.setOnClickListener(input8);
        Button nineButton = (Button) findViewById(R.id.nineButton);
        nineButton.setOnClickListener(input9);
        Button zeroButton = findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(input0);
        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(inputBack);
        Button cButton = findViewById(R.id.cButton);
        cButton.setOnClickListener(inputClear);
    }
}
