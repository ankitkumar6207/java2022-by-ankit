import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
           rev=rev+str.charAt(i);

        }
       
        // if(str.equals(rev)){
        //          //Madam is not palindrom coz java is case sensitive
        //     System.out.println("palindrome");
        // }
        // else
        // System.out.println("not a palindrome");


        if(str.equalsIgnoreCase(rev)){        //but here Madam is palindrom coz it's just ignore the sensitivity
            System.out.println("palindrome");
        }
        else
        System.out.println("not a palindrome");

        


        
    }
}