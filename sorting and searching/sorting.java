import java.util.Scanner;
class sorting{
    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter "+n+" array elements");
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
    
       System.out.println("unsorted array");
       for(int i:arr){
           System.out.print(i+"\t");
       }
       System.out.println();
      

       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]>arr[j]){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               }
           }
       }
       System.out.println("sorted array");
       for(int i:arr)
       System.out.print(i+"\t");

    }
}