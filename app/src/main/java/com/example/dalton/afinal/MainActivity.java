package com.example.dalton.afinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int focus = 1;


    private View.OnClickListener input1 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };
    private View.OnClickListener input2 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };
    private View.OnClickListener input3 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };
    private View.OnClickListener input4 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };
    private View.OnClickListener input5 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };
    private View.OnClickListener input6 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };
    private View.OnClickListener input7 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };
    private View.OnClickListener input8 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };
    private View.OnClickListener input9 = new View.OnClickListener(){
        public void onClick(View v){

        }
    };

    private View.OnClickListener input0 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1) {
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("0");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("0");
            }
        }
    };

    private View.OnClickListener inputA = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener inputB = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener inputC = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener inputD = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener inputE = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    private View.OnClickListener inputF = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    private View.OnClickListener inputBack = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           // TextView textBox = findViewById(R.id.textbox);
           // String input;
           // input = textBox.getEditableText().toString();
           // if(input.length() != 0)
                //textBox.setText(input.substring(0, input.length() - 1).toCharArray(), 0, input.length() - 1);
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                String firstBoxInput = firstBox.getEditableText().toString();
                if(firstBoxInput.length() != 0){
                    firstBox.setText(firstBoxInput.substring(0, firstBoxInput.length() -1).toCharArray(), 0, firstBoxInput.length() -1);
                }
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                String secondBoxInput = secondBox.getEditableText().toString();
                if(secondBoxInput.length() != 0){
                    secondBox.setText(secondBoxInput.substring(0, secondBoxInput.length() -1).toCharArray(), 0, secondBoxInput.length() -1);
                }
            }
        }
    };

    private View.OnClickListener inputClear = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.setText("");
            }else if(focus == 2) {
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.setText("");
            }
        }
    };



    private View.OnClickListener inputEnter = new View.OnClickListener(){
        public void onClick(View v){
            //TextView textBox = findViewById(R.id.textbox);
            //String inputStream = textBox.getEditableText().toString();
        }
    };

    private View.OnClickListener firstBoxClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            focus = 1;
        }
    };

    private View.OnClickListener secondBoxClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            focus = 2;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oneButton = findViewById(R.id.oneButton);
        oneButton.setOnClickListener(input1);
        Button twoButton = findViewById(R.id.twoButton);
        twoButton.setOnClickListener(input2);
        Button threeButton = findViewById(R.id.threeButton);
        threeButton.setOnClickListener(input3);
        Button fourButton = findViewById(R.id.fourButton);
        fourButton.setOnClickListener(input4);
        Button fiveButton = findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(input5);
        Button sixButton = findViewById(R.id.sixButton);
        sixButton.setOnClickListener(input6);
        Button sevenButton = findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(input7);
        Button eightButton = findViewById(R.id.eightButton);
        eightButton.setOnClickListener(input8);
        Button nineButton = findViewById(R.id.nineButton);
        nineButton.setOnClickListener(input9);
        Button zeroButton = findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(input0);
        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(inputBack);
        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(inputClear);
        Button enterButton = findViewById(R.id.enterButton);
        enterButton.setOnClickListener(inputEnter);

        TextView firstBox = findViewById(R.id.firstBox);
        TextView secondBox = findViewById(R.id.secondBox);

        firstBox.setOnClickListener(firstBoxClick);
        secondBox.setOnClickListener(secondBoxClick);
    }
}
