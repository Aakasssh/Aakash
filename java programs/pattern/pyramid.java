public class pyramid {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
      
        }
        for(int p=0;p<=4;p++)
        {
            for(int k=4;k>=p;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
