package MyFirstJavePakage;

import java.sql.SQLOutput;

public class Fun {
    public static void CalAVG() {
        float Average;
        int G1=99;
        int G2=22;
        int G3=77;
        Average = (G1+G2+G3)/3f;
        System.out.println("The Average is"+Average);
    }
    public static void main(String[] args) {
       CalAVG();
    }
}