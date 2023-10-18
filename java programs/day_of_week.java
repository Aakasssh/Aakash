import java.util.Scanner;

public class day_of_week {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Day of the Week Calculator: Write a program that takes a number (1-7) as input and prints the corresponding day of the week (e.g., 1 represents Sunday, 2 represents Monday, etc.).

        System.out.println(" plz enter no upto 1-7");
        int a= sc.nextInt();
        if(a==1)
        {
            System.out.println("sunday");
        }
        else if(a==2)
        {
            System.out.println("monday");
        }
        else if(a==3)
        {
            System.out.println("tuesday");
        }
        else if(a==4)
        {
            System.out.println("wed");
        }
        else if(a==5)
        {
            System.out.println("thursday");
        }
        else if(a==6)
        {
            System.out.println("friday");
        }
        else if(a==7)
        {
            System.out.println("saturday");
        }
        else{
            System.out.println(" no not in range");
        }
        sc.close();
        
    }
    
}
