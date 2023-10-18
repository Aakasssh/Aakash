import java.util.Scanner;



public class leapyear {
    static void leap(){
            Scanner sc = new Scanner(System.in);
            System.out.print(" enter the year");
            int a= sc.nextInt();
            if(a%4==0){
                        System.out.print(" year  is leap yaer :"+a);

                     }
            else if(a%400==0 || a%100==0){
                 System.out.print(" year  is leap yaer :"+a);

            }
            else{
                System.out.print(" year is not leap year: "+a);
            }
            sc.close();
    }
    public static void main(String[] args) {
        leap();
        
    }
    
}
