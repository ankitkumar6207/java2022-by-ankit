import java.util.*;

public class stringtokenizer4 {
   public static void main(String ak[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a line");
      StringTokenizer str = new StringTokenizer(sc.nextLine());
      String lar = "";
      while (str.hasMoreTokens()) {
         String str2 = str.nextToken();
         if (str2.length() > lar.length())
            lar = str2;
           
         
      }
      System.out.println("largest word in the given line:  "+lar);
     
   }
}
