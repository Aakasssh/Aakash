import java.util.Scanner;

public class prime_no{
    public static void prime(int  num) {
        Scanner sc =new Scanner(System.in);
        int chk=1;
        for(int i=2;i<num; i++);{
             if(num%i==0){
            chk=0;
            break;

        }
           
        
        if(chk==1){
            System.out.println("prime number");

        }
        else{
            System.out.println("not prime");

        }
       
    }
    

}
public static void main(String[] args) {
    
}