import java.util.Scanner;

public class concat3 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter first string");
       String str1=sc.nextLine();
       str1=str1+" ";
       System.out.println("enter second string");
       String str2=sc.nextLine();
       String str3=str1+str2;
       System.out.println(str3);

   } 
}
