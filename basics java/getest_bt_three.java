import java.util.Scanner;
public class getest_bt_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three no.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("greatest no. is "+a);
        }
        else if(b>c)
        System.out.println("greatest no. is "+b);
        else
        System.out.println("greatest no. is "+c);
    }
    
}
