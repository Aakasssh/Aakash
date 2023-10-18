import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        

       Scanner sc = new Scanner(System.in);
       
       System.out.println(" enter name:");
       String name= sc.nextLine();

       System.out.println(" enter std:");
       int std=sc.nextInt();

       System.out.println(" enter your marks:");

       System.out.println(" enter maths marks:");
       float maths=sc.nextFloat();
       System.out.println(" enter hindi marks:");
       float hindi=sc.nextFloat();
       System.out.println(" enter physics marks:");
       float physics=sc.nextFloat();
       System.out.println(" enter chemistry marks:");
       float chemistry=sc.nextFloat();
       System.out.println(" enter biology marks:");
       float biology=sc.nextFloat();

       System.out.println(" total marks is :");
       float marks = maths+hindi+physics+chemistry+biology;
       System.out.println( marks+ " ");

       System.out.println(" avg marks is :");
       float avg= maths+hindi+physics+chemistry+biology/500;
       System.out.println( avg+ " ");

       System.out.println(" Total percentage  is :");
       float percentage= marks/500*100;
       System.out.println( percentage+ " ");

       sc.close();

       
    }
    
}
