import java.util.Scanner;
public class pal_using_buffer {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuffer str=new StringBuffer(sc.next());
        StringBuffer rev=new StringBuffer("");
        int c=0;
        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        for(int l=str.length()-1;l>=0;l--){
            if(str.charAt(l)==rev.charAt(l)){
                c++;
            }

        }
        if(c==str.length())
        System.out.println("palindrom");
        else
        System.out.println("not palindrom");

    
        
    }
    
}
