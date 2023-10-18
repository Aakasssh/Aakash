import java.util.Scanner;

public class tax_caculator {
    public static void main(String[] args) {
    //     tax Calculator: Create a program that calculates the income tax for a person based on their income. Consider different tax slabs and apply the appropriate tax rate using if-else statements.

	// If the salary is below 10k then no tax.
	// if between 10k-20k then 10% tax
	// if between 20k-30k then 15% tax
	// and if the basic is above 30k then flat 25% tax is applicable.

    Scanner sc = new Scanner(System.in);
    System.out.print(" enter the salary of person :");

    float a= sc.nextFloat();
    // int b=10001

    if(a<=10000)
    {
        System.out.println(" there is no tax is applicable ");
    }
    else if(a>=10001 && a<=20000 )
    {
        System.out.println("  ");

    }
    

   

    

   



    }
    
}
