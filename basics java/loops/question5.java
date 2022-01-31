// generating multiplication table of given no. 
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A  NO.");
        int n= sc.nextInt();
        int i=1;
        while(i<=10)
        {
        
            System.out.println((n*i));
            i++;
        }
        
    }
    
}
