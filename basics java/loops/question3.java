// addition of n natural natural numbers 
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("enter a no.");
          int n=sc.nextInt();
          int sum=0;
          for(int i=1;i<=n;i++)
          {
              sum+=i;
              
          }
          System.out.println("sum of given natural no. is "+sum);

        
    }
}
