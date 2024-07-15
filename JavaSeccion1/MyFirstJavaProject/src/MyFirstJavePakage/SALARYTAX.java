package MyFirstJavePakage;

public class SALARYTAX {
    public static void main(String[] args) {
        double SALARY=1000;
        double TAX;
        if (SALARY==1000) {
            TAX=(SALARY*0.1);
            System.out.println(TAX);
            }
        else if (SALARY>1000) {
            TAX=(SALARY*0.15);
                System.out.println(TAX);
            }
        else if (SALARY>2000) {
            TAX=(SALARY*0.2);
            System.out.println(TAX);
            }


        }
}
