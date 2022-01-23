import java.util.Scanner;
class largest{
       public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       int max1=0,max2=0;
       System.out.println("enter the size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter "+n+" array elements");
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
    
       System.out.println("array elements are:");
       for(int i:arr){
           System.out.print(i+"\t");
       }
       System.out.println();
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>max1)
          max1=arr[i];
      }
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]==max1)
          continue;
          else if(arr[i]>max2)
          max2=arr[i];
          
         
      }
      System.out.println("maximum number="+max1);
      System.out.println("2nd maximum number="+max2);

       }
}