package MyFirstJavePakage;

import java.util.Scanner;

public class WHILELOOP {
    public static void main(String[] args) {
        //int count = 1;
       // while (count > 10)
        //{
          //  System.out.println(count);
            //count ++;
        //}
        //System.out.println("Loop is finished when done");
        Scanner sr=new Scanner(System.in);
        System.out.println("please enter the value less than 10");
        int count= sr.nextInt();
        while (count > 10)
        {
         System.out.println(count);
        count++;
}
        System.out.println("Loop is finished when done");

}
}