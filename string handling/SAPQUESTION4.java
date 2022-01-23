import java.util.Scanner;

public class SAPQUESTION4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        String str2="";
        
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                  c++;
                  break;
                }
               


            }
            if(c==0)
            System.out.print(str.charAt(i));
            c=0;
            
         
        }

       

    }
    
}
