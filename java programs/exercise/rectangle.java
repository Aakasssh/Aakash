import java.util.Scanner;

public class rectangle {
    static void rectangle(){

        System.out.print(" plz enter length of rectangle : ");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.print(" plz enter breadth of rectangle : ");
        int b= scanner.nextInt();

         int perimeter=0;
         int area=0;

         perimeter = 2*(a+b);
         System.out.println(" perimeter is: "+perimeter);
         area = a*b; 
         System.out.println(" area is : "+area);
         scanner.close();

        

    }

    public static void main(String[] args) {
        rectangle();
    }
    
}
