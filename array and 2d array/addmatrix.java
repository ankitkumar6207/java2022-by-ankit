import java.util.Scanner;
class addmatrix{
    public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the raw and column for the matrix");
      int r1=sc.nextInt();
      int c1=sc.nextInt();
      int arr[][]=new int[r1][c1];
      System.out.println("enter "+r1*c1+" elements for 1st matrix");
      for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
            arr[i][j]=sc.nextInt();
          }
      }
     
      int arr2[][]=new int[r1][c1];
      System.out.println("enter "+r1*c1+" elements for the 2nd matrix");

       for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
            arr2[i][j]=sc.nextInt();
          }
      }
      System.out.println("1st matrix is:");
       for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
            System.out.print(arr[i][j]+"\t");
          }
          System.out.println();
      }
      System.out.println("2nd matrix is:");
       for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
            System.out.print(arr2[i][j]+"\t");
          }
          System.out.println();
      }
     System.out.println("sum of above two matrix is:");
      for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
              System.out.print(arr[i][j]+arr2[i][j]+"\t");
          }
          System.out.println();
      }
    }
}