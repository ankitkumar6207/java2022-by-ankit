import java.util.Scanner;
class diogonal{
    public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the raw and column for the square matrix");
      int r1=sc.nextInt();
      int c1=sc.nextInt();
      int arr[][]=new int[r1][c1];
      System.out.println("enter "+r1*c1+" elements for matrix");
      for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
            arr[i][j]=sc.nextInt();
          }
      }
      System.out.println("matrix is:");
       for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
            System.out.print(arr[i][j]+"\t");
          }
          System.out.println();
      }
      System.out.println("diogonal elements of the matrix is:");
       for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
              if(i==j || (i+j==2))
              {
                  if((i*j)==1)
                  System.out.print("    "+arr[i][j]);
                  else
                   System.out.print(arr[i][j]+"\t");
              }
           
          }
          System.out.println();
      }

    }
}
