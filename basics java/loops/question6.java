// fibonacci series upto nth term 
import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a range.");
        int n=sc.nextInt();
         int a=0;
         int b=1;
         int c=0;
         System.out.print(a+"\t");
         System.out.print(b+"\t");
         for(int i=0;i<(n-2);i++)
         {
             c=a+b;
             a=b;
             b=c;
             System.out.print(c+"\t");

         }


    }
}
