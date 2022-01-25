import java.util.Scanner;

public class copyonetoother_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str1=sc.nextLine();
        String str2=str1;
        System.out.println("copied string is "+str2);
    }
    
}
