package com.example.dalton.afinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int focus = 1;
    int mode = 1;
    int operation = 1;
    public ArrayList<String> ss = new ArrayList<String>(16);


    private View.OnClickListener input1 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("1");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("1");
            }
        }
    };
    private View.OnClickListener input2 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("2");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("2");
            }
        }
    };
    private View.OnClickListener input3 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("3");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("3");
            }
        }
    };
    private View.OnClickListener input4 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("4");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("4");
            }
        }
    };
    private View.OnClickListener input5 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("5");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("5");
            }
        }
    };
    private View.OnClickListener input6 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("6");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("6");
            }
        }
    };
    private View.OnClickListener input7 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("7");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("7");
            }
        }
    };
    private View.OnClickListener input8 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("8");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("8");
            }
        }
    };
    private View.OnClickListener input9 = new View.OnClickListener(){
        public void onClick(View v){
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("9");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("9");
            }
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
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("A");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("A");
            }

        }
    };
    private View.OnClickListener inputB = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("B");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("B");
            }
        }
    };
    private View.OnClickListener inputC = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("C");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("C");
            }
        }
    };
    private View.OnClickListener inputD = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("D");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("D");
            }
        }
    };
    private View.OnClickListener inputE = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("E");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("E");
            }
        }
    };
    private View.OnClickListener inputF = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(focus == 1){
                TextView firstBox = findViewById(R.id.firstBox);
                firstBox.append("F");
            }else if(focus == 2){
                TextView secondBox = findViewById(R.id.secondBox);
                secondBox.append("F");
            }
        }
    };

    private  View.OnClickListener inputHex = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mode = 1;
            View button2 = findViewById(R.id.twoButton);
            View button3 = findViewById(R.id.threeButton);
            View button4 = findViewById(R.id.fourButton);
            View button5 = findViewById(R.id.fiveButton);
            View button6 = findViewById(R.id.sixButton);
            View button7 = findViewById(R.id.sevenButton);
            View button8 = findViewById(R.id.eightButton);
            View button9 = findViewById(R.id.nineButton);
            View buttonA = findViewById(R.id.aButton);
            View buttonB = findViewById(R.id.bButton);
            View buttonC = findViewById(R.id.cButton);
            View buttonD = findViewById(R.id.dButton);
            View buttonE = findViewById(R.id.eButton);
            View buttonF = findViewById(R.id.fButton);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.VISIBLE);
            button5.setVisibility(View.VISIBLE);
            button6.setVisibility(View.VISIBLE);
            button7.setVisibility(View.VISIBLE);
            button8.setVisibility(View.VISIBLE);
            button9.setVisibility(View.VISIBLE);
            buttonA.setVisibility(View.VISIBLE);
            buttonB.setVisibility(View.VISIBLE);
            buttonC.setVisibility(View.VISIBLE);
            buttonD.setVisibility(View.VISIBLE);
            buttonE.setVisibility(View.VISIBLE);
            buttonF.setVisibility(View.VISIBLE);
        }
    };

    private  View.OnClickListener inputBin = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mode = 2;
            View button2 = findViewById(R.id.twoButton);
            View button3 = findViewById(R.id.threeButton);
            View button4 = findViewById(R.id.fourButton);
            View button5 = findViewById(R.id.fiveButton);
            View button6 = findViewById(R.id.sixButton);
            View button7 = findViewById(R.id.sevenButton);
            View button8 = findViewById(R.id.eightButton);
            View button9 = findViewById(R.id.nineButton);
            View buttonA = findViewById(R.id.aButton);
            View buttonB = findViewById(R.id.bButton);
            View buttonC = findViewById(R.id.cButton);
            View buttonD = findViewById(R.id.dButton);
            View buttonE = findViewById(R.id.eButton);
            View buttonF = findViewById(R.id.fButton);
            button2.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            buttonA.setVisibility(View.INVISIBLE);
            buttonB.setVisibility(View.INVISIBLE);
            buttonC.setVisibility(View.INVISIBLE);
            buttonD.setVisibility(View.INVISIBLE);
            buttonE.setVisibility(View.INVISIBLE);
            buttonF.setVisibility(View.INVISIBLE);
        }
    };

    private View.OnClickListener inputBack = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
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

    public String hexToBin(String input){
        if(ss.size() <= 0) {
            ss.add(0, "0000");
            ss.add(1, "0001");
            ss.add(2, "0010");
            ss.add(3, "0011");
            ss.add(4, "0100");
            ss.add(5, "0101");
            ss.add(6, "0110");
            ss.add(7, "0111");
            ss.add(8, "1000");
            ss.add(9, "1001");
            ss.add(10, "1010");
            ss.add(11, "1011");
            ss.add(12, "1100");
            ss.add(13, "1101");
            ss.add(14, "1110");
            ss.add(15, "1111");
        }
        String output = "";
        for(int i = 0; i < input.length(); i++){
            switch(input.charAt(i)){
                case '0':
                    output = output + ss.get(0);
                    break;
                case '1':
                    output = output + ss.get(1);
                    break;
                case '2':
                    output = output + ss.get(2);
                    break;
                case '3':
                    output = output + ss.get(3);
                    break;
                case '4':
                    output = output + ss.get(4);
                    break;
                case '5':
                    output = output + ss.get(5);
                    break;
                case '6':
                    output = output + ss.get(6);
                    break;
                case '7':
                    output = output + ss.get(7);
                    break;
                case '8':
                    output = output + ss.get(8);
                    break;
                case '9':
                    output = output + ss.get(9);
                    break;
                case 'A':
                    output = output + ss.get(10);
                    break;
                case 'B':
                    output = output + ss.get(11);
                    break;
                case 'C':
                    output = output + ss.get(12);
                    break;
                case 'D':
                    output = output + ss.get(13);
                    break;
                case 'E':
                    output = output + ss.get(14);
                    break;
                case 'F':
                    output = output + ss.get(15);
                    break;
            }
        }
        return output;
    }

    public String binToHex(String input){
        String output = new String();
        String middle = new String();
        for(int i = 0; i < input.length(); i += 4){
            middle = "";
            middle += input.charAt(i);
            middle += input.charAt(i + 1);
            middle += input.charAt(i + 2);
            middle += input.charAt(i + 3);
            switch (middle){
                case "0000":
                    output += '0';
                    break;
                case "0001":
                    output += '1';
                    break;
                case "0010":
                    output += '2';
                    break;
                case "0011":
                    output += '3';
                    break;
                case "0100":
                    output += '4';
                    break;
                case "0101":
                    output += '5';
                    break;
                case "0110":
                    output += '6';
                    break;
                case "0111":
                    output += '7';
                    break;
                case "1000":
                    output += '8';
                    break;
                case "1001":
                    output += '9';
                    break;
                case "1010":
                    output += 'A';
                    break;
                case "1011":
                    output += 'B';
                    break;
                case "1100":
                    output += 'C';
                    break;
                case "1101":
                    output += 'D';
                    break;
                case "1110":
                    output += 'E';
                    break;
                case "1111":
                    output += 'F';
                    break;
            }
        }
        return output;
    }

    public int getBiggest(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public int getSmallest(int a, int b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }

    public String xor(String rhs, String lhs){
        String output = new String();
        for(int i = 0; i < getBiggest(rhs.length(), lhs.length()); i++){
            if(i < getSmallest(rhs.length(), lhs.length())) {
                if (rhs.charAt(i) == lhs.charAt(i)) {
                    output += "0";
                } else {
                    output += "1";
                }
            }else{
                if(rhs.length() == getBiggest(rhs.length(), lhs.length())) {
                    output += rhs.charAt(i);
                }else{
                    output += lhs.charAt(i);
                }
            }
        }
        return output;
    }

    public String and(String rhs, String lhs){
        String output = new String();
        for(int i = 0; i < getBiggest(rhs.length(), lhs.length()); i++){
            if(i < getSmallest(rhs.length(), lhs.length())) {
                if (rhs.charAt(i) == lhs.charAt(i)) {
                    if(rhs.charAt(i) == '0'){
                        output += "0";
                    }else {
                        output += "1";
                    }
                } else {
                    output += "0";
                }
            }else{
                if(rhs.length() == getBiggest(rhs.length(), lhs.length())) {
                    output += rhs.charAt(i);
                }else{
                    output += lhs.charAt(i);
                }
            }
        }
        return output;
    }

    public String or(String rhs, String lhs){
        String output = new String();
        for(int i = 0; i < getBiggest(rhs.length(), lhs.length()); i++){
            if(i < getSmallest(rhs.length(), lhs.length())) {
                if (rhs.charAt(i) == lhs.charAt(i)) {
                    if(rhs.charAt(i) == '0'){
                        output += "0";
                    }else {
                        output += "1";
                    }
                } else {
                    output += "1";
                }
            }else{
                if(rhs.length() == getBiggest(rhs.length(), lhs.length())) {
                    output += rhs.charAt(i);
                }else{
                    output += lhs.charAt(i);
                }
            }
        }
        return output;
    }

    private View.OnClickListener inputEnter = new View.OnClickListener(){
        public void onClick(View v) {
            int error = 0;
            TextView firstBox = findViewById(R.id.firstBox);
            TextView secondBox = findViewById(R.id.secondBox);
            TextView result = findViewById(R.id.result);
            String first = new String();
            String second = new String();
            try {
                first = firstBox.getEditableText().toString();
                second = secondBox.getEditableText().toString();
            } catch (Exception e) {
                result.setText("Error Getting Input");
                error = 1;
            }
            //mode 1 is Hex; mode 2 is binary
            String output = new String();
            if (error == 0 && first.length() > 0 && second.length() > 0) {
                if (mode == 1) {
                    String rhs = hexToBin(first);
                    String lhs = hexToBin(second);
                    switch (operation) {
                        case 1:
                            output = xor(rhs, lhs);
                            break;
                        case 2:
                            output = and(rhs, lhs);
                            break;
                        case 3:
                            output = or(rhs, lhs);
                            break;
                    }
                    output = binToHex(output);
                    result.setText(output.toCharArray(), 0, output.length());
                } else if (mode == 2) {
                    switch (operation) {
                        case 1:
                            output = xor(first, second);
                            break;
                        case 2:
                            output = and(first, second);
                            break;
                        case 3:
                            output = or(first, second);
                            break;
                    }
                    result.setText(output.toCharArray(), 0, output.length());
                }
            }else{
                result.setText("Must have a RHS and a LHS");
            }
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

    private View.OnClickListener inputAnd = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TextView opBox = findViewById(R.id.opBox);
            opBox.setText("AND");
            operation = 2;
        }
    };

    private View.OnClickListener inputXor = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TextView opBox = findViewById(R.id.opBox);
            opBox.setText("XOR");
            operation = 1;
        }
    };
    private View.OnClickListener inputOr = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TextView opBox = findViewById(R.id.opBox);
            opBox.setText("OR");
            operation = 3;
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
        TextView opBox = findViewById(R.id.opBox);

        firstBox.setOnClickListener(firstBoxClick);
        secondBox.setOnClickListener(secondBoxClick);
        opBox.setText("XOR");

        Button aButton = findViewById(R.id.aButton);
        Button bButton = findViewById(R.id.bButton);
        Button cButton = findViewById(R.id.cButton);
        Button dButton = findViewById(R.id.dButton);
        Button eButton = findViewById(R.id.eButton);
        Button fButton = findViewById(R.id.fButton);

        aButton.setOnClickListener(inputA);
        bButton.setOnClickListener(inputB);
        cButton.setOnClickListener(inputC);
        dButton.setOnClickListener(inputD);
        eButton.setOnClickListener(inputE);
        fButton.setOnClickListener(inputF);

        Button andButton = findViewById(R.id.andButton);
        Button xorButton = findViewById(R.id.xorButton);
        Button orButton = findViewById(R.id.orButton);

        andButton.setOnClickListener(inputAnd);
        xorButton.setOnClickListener(inputXor);
        orButton.setOnClickListener(inputOr);

        Button hexButton = findViewById(R.id.hexButton);
        Button binButton = findViewById(R.id.binaryButton);

        hexButton.setOnClickListener(inputHex);
        binButton.setOnClickListener(inputBin);


    }
}
