import java.util.*;
class twoDDarray{

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       System.out.println("enter the row and column of the matrix");
       int r=in.nextInt();
       int c=in.nextInt();
       int arr[][]=new int[r][c];
       System.out.println("enter "+(r*c)+" elements");
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               arr[i][j]=in.nextInt();
           }
       }
       System.out.println("array elements array");

        for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               System.out.print(arr[i][j]+"\t");
           }
           System.out.println();
       }
    }
}