import java.util.Scanner;

public class plus {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the range:");
        int a = sc.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=0;j<=a;j++){

           
                if(i==5 || j==5){
                    System.out.print("+");


                }
            }
            System.out.println(" ");
        }

    }
    

    
}
