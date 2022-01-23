import java.io.*;
public class add_brc {
    public static void main(String[] args)throws IOException {
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int a,b;
       System.out.println("enter two no.");

       a=Integer.parseInt(in.readLine());
       b=Integer.parseInt(in.readLine());
       System.out.println("sum="+(a+ b));


    }
    
}
