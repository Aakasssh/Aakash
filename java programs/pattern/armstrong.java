import java.util.Scanner;

public class armstrong {
    public static void armstrong(int num) {
        int n=num;
         int result=0;
        while(n!=0){
            int rem = n%10;
            result=result+(rem*rem*rem);
            n=n/10;

        }
        if(result==num){
            System.out.println(" it is a armstrong number");
        }
        else{
            System.out.println("it is an armstrong number");
        }
       
        
       

    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print(" enter any three digit number ");
        int n=
       
    }
}
