import java.util.Scanner;

public class swapping {
    static void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the first variable : ");

        int a= sc.nextInt();

        System.out.print(" enter the second variable : ");
        int b= sc.nextInt();
        System.out.println(" variables before swapping "+a+ "" +b);
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.print(" variable after swapping "+a+ "" +b);
         sc.close();

    }
    public static void main(String[] args) {
        swap();
    }
    
}

