// enter a line and display each words using stringtokenize. 
import java.util.*;

public class stringtokenizer2 {
    


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a line");
    StringTokenizer str=new  StringTokenizer(sc.nextLine());
    
    
    while(str.hasMoreTokens()){
        String str2=str.nextToken();
        System.out.println(str2);

        }
    }
}