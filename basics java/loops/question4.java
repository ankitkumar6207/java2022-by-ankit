// find the factorial of given number. 
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NO.");
        int n=sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("factorial of given no. is "+fact);

    }
    
}
