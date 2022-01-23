import java.util.Scanner;
class multiplication{
    public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the raw and column for the 1stmatrix");
      int r1=sc.nextInt();
      int c1=sc.nextInt();
      int arr1[][]=new int[r1][c1];
      int c=0;
      System.out.println("enter "+r1*c1+" elements for 1st matrix");
      for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
            arr1[i][j]=sc.nextInt();
          }
      }
      System.out.println("enter the raw and column for the 2nd matrix:");
      int r2=sc.nextInt();
      int c2=sc.nextInt();


     
      int arr2[][]=new int[r2][c2];
      System.out.println("enter "+r2*c2+" elements for the 2nd matrix");

       for(int i=0;i<r2;i++)
      {
          for(int j=0;j<c2;j++)
          {
            arr2[i][j]=sc.nextInt();
          }
      }
      System.out.println("1st matrix is:");
       for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c1;j++)
          {
            System.out.print(arr1[i][j]+"\t");
          }
          System.out.println();
      }
      System.out.println("2nd matrix is:");
       for(int i=0;i<r2;i++)
      {
          for(int j=0;j<c2;j++)
          {
            System.out.print(arr2[i][j]+"\t");
          }
          System.out.println();
      }
     System.out.println("multiplication of above two matrices:");
     if(c1==r2){

    
      for(int i=0;i<r1;i++)
      {
          for(int j=0;j<c2;j++)
          {
              c=0;
             for(int k=0;k<c1;k++)
             {
                 c=c+arr1[i][k]*arr2[k][j];
                 
             }
             System.out.print(c+"\t");
          }
          System.out.println();

      }
       }
       else
       System.out.println("OH SHIT!! multiplication of above matrices is not possible!");
    }
}