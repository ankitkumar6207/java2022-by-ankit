// enter a line and display each words starts with vowels. 
import java.util.*;
public class stringtokenizer1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a line");
        StringTokenizer str=new  StringTokenizer(sc.nextLine());
        System.out.println("words starts with vowels");
        int c=0;
        while(str.hasMoreTokens()){
            String str2=str.nextToken();
            char ch=str2.charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println(str2);
                c++;

            }
        }
        if(c==0)
        System.out.println("there is no words start with vowels");

    }
    
}
