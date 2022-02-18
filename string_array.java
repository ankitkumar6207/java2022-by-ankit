import java.util.Scanner;
class string_array{
    public static void main(String str[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        {
          a[i]=sc.next(); 
          System.out.print(a[i]+"\t");
        }



    }
}