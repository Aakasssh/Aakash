import java.util.Scanner;


public class simple_interset{

    static void simple_interset(){
        System.out.print("plz enter principle :  ");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(" plz enter rate : ");
        int b=sc.nextInt();
        System.out.print("plz enter time in year");

        int c=sc.nextInt();
        int s=0;
        s=(a*b*c)/100;
        System.out.println(+s);

    
}
    public static void main(String[] args) {
        simple_interset();
      
        
    }

}