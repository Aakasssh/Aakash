import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println(" enter celcius temperature :");
        float temp=sc.nextFloat();

        float ferheniet_temp= temp * 9/5 + 32;

        System.out.println(" ferheit temperature is :");
        System.out.println(ferheniet_temp+" ");

        sc.close();


        





    }
    
}
