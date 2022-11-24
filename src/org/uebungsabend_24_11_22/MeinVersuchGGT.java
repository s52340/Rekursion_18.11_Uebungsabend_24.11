package org.uebungsabend_24_11_22;

public class GGT {
    public static void main(String[] args) {

        //50 / 25 = 1 Rest: 2
        System.out.println(getGgtIterative(50,25));
    }

    public static int getGgtIterative(int a, int b){
        while (b != 0){
            int resultDivision = a / b;
            a = b;
            b = resultDivision;
        }
    return a;
    }
}
