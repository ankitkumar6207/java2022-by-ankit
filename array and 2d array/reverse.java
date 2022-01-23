import java.util.Scanner;
class reverse{
       public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter "+n+" array elements");
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
    
       System.out.println("array is:");
       for(int i:arr){
           System.out.print(i+"\t");
       }
       System.out.println();
       System.out.println("array in reversed order:");
       for(int i=n-1;i>=0;i--){
           System.out.print(arr[i]+"\t");
       }
}
}