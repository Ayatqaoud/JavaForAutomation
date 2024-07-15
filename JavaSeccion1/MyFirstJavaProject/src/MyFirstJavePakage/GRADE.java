package MyFirstJavePakage;

import java.awt.*;
import java.sql.SQLOutput;

public class GRADE {
    public static void SGRADE() {//SGRADE refers to Student GARDE
    int AG = 80;//Asigment Grade
    float FEG = 75.5f;//Final Exam Grade
        double FinalGrade;
        FinalGrade  =AG+FEG;

     System.out.println("The Final Grade"+FinalGrade);
      System.out.println("The Final Grade Percantage"+FinalGrade+"%");
}

public static void main(String[] args) {  SGRADE();

}}