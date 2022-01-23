// print all palindrome words using stringtokenizer. 
import java.util.*;
public class stringtokenizer3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a line");
    StringTokenizer str=new  StringTokenizer(sc.nextLine());
    System.out.println("palindrome words");
    
    String rev="";
    while(str.hasMoreTokens()){
        String str2=str.nextToken();
        for(int i=str2.length()-1;i>=0;i--){
            rev=rev+str2.charAt(i);
         }
         //System.out.println(rev);

         if(str2.equals(rev))
         System.out.print(str2+"\t");
         rev="";

        
    }
}
}

    

