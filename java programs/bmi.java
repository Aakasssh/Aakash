import java.util.Scanner;

public class bmi {

    public static void main(String[] args) {
        

           Scanner sc= new Scanner(System.in);
           System.out.println(" enter weight in kg :");
           float weight= sc.nextFloat();

           System.out.println(" enter height in meter :");
           float height= sc.nextFloat();

           float BMI= weight/height*height;

           System.out.println(" your BMI is  :");
           System.out.println(BMI+" ");



    
        sc.close();

    }
    
}
