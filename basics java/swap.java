import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping \na = "+a);
        System.out.println("b = "+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("after swapping \na = "+a);
        System.out.println("b = "+b);
    }
}
