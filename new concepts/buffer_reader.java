import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class buffer_reader {
    public static void main(String[] args)throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter two no.");
        int x=Integer.parseInt(sc.readLine());
        int y=Integer.parseInt(sc.readLine());
        System.out.println("sum is ="+(x+y));

    }
    
}
