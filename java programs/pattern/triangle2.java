import java.util.Scanner;

public class triangle2 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the range : ");
        int a =sc.nextInt();
        for(int i =1;i<=a;i++){
            
            
            for(int j=a;j>=i;j--){
                System.out.print("*");

            }
            System.out.println(" ");
                          
        }
        sc.close();
    }
    
}
