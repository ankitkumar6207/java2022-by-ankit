import java.util.Scanner;
public class array {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("enter size of array");
      int n=in.nextInt();
      int arr[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++){
          arr[i]=in.nextInt();
      }
      System.out.println("array elements are:");
      for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+"\t");
      }

    }
    
}
