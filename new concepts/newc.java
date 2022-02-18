// using scanner class without declararing util package 

public class newc {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        int a=new java.util.Scanner(System.in).nextInt();
        int b=new java.util.Scanner(System.in).nextInt();

        System.out.println("SUM OF GIVEN NO. "+(a+b));


        
    }
    
}
