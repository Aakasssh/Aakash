import java.util.Scanner;

public class temperature {
    //  Convert Celsius into Fahrenheit and vice versa

    static void temp(){
        System.out.print(" enter the tempeature of celcius in numbers ");

        Scanner sc = new Scanner(System.in);
        int c= sc.nextInt();

        int Fahrenheit= c*9/5+32;
        System.out.println(" temperature in fehrenheit is : " +Fahrenheit);
    }
    public static void main(String[] args) {
          temp();
        
    }

  
    
}
