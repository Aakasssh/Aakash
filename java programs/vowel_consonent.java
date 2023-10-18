import java.util.Scanner;

public class vowel_consonent{

    public static void main(String[] args) {
        // Vowel or Consonant: Write a program that takes a character as input and determines whether it's a vowel or a consonant.
        
        Scanner sc = new Scanner(System.in);

        System.out.println("plz enter any character");

        char xx = sc.next().charAt(0);
        if(xx=='a' || xx=='e' || xx=='i' || xx=='o' || xx=='u')
        {
            System.out.println(" no is vowel ");
        }
        else{
            System.out.println(" no is consonent ");
        }
        sc.close();


    }


}