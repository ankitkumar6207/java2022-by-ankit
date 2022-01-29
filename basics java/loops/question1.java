// plindrome check using different method 
import static java.lang.System.*;
import static java.lang.Math.*;
public class question1 {

    public static void main(String[] args) {
       
        System.out.println("enter an integer");
        int n=new java.util.Scanner(System.in).nextInt();
        int rev=0;
        for(int i=n;i>0;i=i/10){
              rev=rev*10+(i%10);

        }
       if(rev==n)
       {
           out.println("palindrome no.");

       }
       else{
           out.println("not a palindrome no.");
       }
       out.println(PI);
       
    }
    
}
