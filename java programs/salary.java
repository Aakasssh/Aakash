import java.util.Scanner;

public class salary{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the baisc salary is :");

        Float basic_salary = sc.nextFloat ();

        float hra = basic_salary*30/100;

        System.out.println( hra+"hra is :");

        float ta = basic_salary*20/100;
        
        System.out.println( ta+"ta is :");

        float da = basic_salary*10/100;

        System.out.println(da+"da is :");

        System.out.println("pf is : 1500");

        int pf=1500;

        float net_salary = basic_salary+hra+ta+da-pf;

        System.out.println( net_salary+"  net salary  is :" );

        sc.close();
    



    }
}