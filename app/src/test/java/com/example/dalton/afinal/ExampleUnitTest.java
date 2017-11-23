package com.example.dalton.afinal;

import android.net.wifi.p2p.WifiP2pManager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    MainActivity instance = new MainActivity();
    String input;
    String input2;
    String expectedOutput;
    int num1;
    int num2;
    int expectedNum;

    @Test
    public void testHex2Bin() throws Exception {
        input = "AF1E3";
        expectedOutput = "10101111000111100011";
        assertEquals(expectedOutput, instance.hexToBin(input));
        //The function should handle odd input but not compute that input
        //And non hex characters should not be input anyway using the buttons
        input = "XXXXXXX";
        expectedOutput = "";
        assertEquals(expectedOutput, instance.hexToBin(input));
    }

    @Test
    public void testBin2Hex() throws Exception {
        input = "10101111000111100011";
        expectedOutput = "AF1E3";
        assertEquals(expectedOutput, instance.binToHex(input));
        //The function should handle odd input but not compute that input
        //And non hex characters should not be input anyway using the buttons
        input = "XXXXXXX";
        expectedOutput = "";
        assertEquals(expectedOutput, instance.hexToBin(input));
    }

    @Test
    public void testXOR() throws Exception {
        input =  "10101111000111100011";
        input2 = "10110100110111101010";
        expectedOutput = "00011011110000001001";
        assertEquals(expectedOutput, instance.xor(input, input2));
        input2 += "1111";
        expectedOutput += "1111";
        assertEquals(expectedOutput, instance.xor(input, input2));
    }

    @Test
    public void testOR() throws Exception {
        input =  "10101111000111100011";
        input2 = "10110100110111101010";
        expectedOutput = "10111111110111101011";
        assertEquals(expectedOutput, instance.or(input, input2));
        input2 += "1111";
        expectedOutput += "1111";
        assertEquals(expectedOutput, instance.or(input, input2));
    }

    @Test
    public void testAND() throws Exception {
        input =  "10101111000111100011";
        input2 = "10110100110111101010";
        expectedOutput = "10100100000111100010";
        assertEquals(expectedOutput, instance.and(input, input2));
        input2 += "1111";
        expectedOutput += "1111";
        assertEquals(expectedOutput, instance.and(input, input2));
    }

    @Test
    public void testGetBiggest() throws Exception {
        num1 = 8;
        num2 = 3;
        expectedNum = 8;
        assertEquals(expectedNum, instance.getBiggest(num1, num2));
        num1 = -433;
        num2 = -333;
        expectedNum = -333;
        assertEquals(expectedNum, instance.getBiggest(num1, num2));
    }

    @Test
    public void testGetSmallest() throws Exception {
        num1 = 8;
        num2 = 3;
        expectedNum = 3;
        assertEquals(expectedNum, instance.getSmallest(num1, num2));
        num1 = -433;
        num2 = -333;
        expectedNum = -433;
        assertEquals(expectedNum, instance.getSmallest(num1, num2));
    }

}