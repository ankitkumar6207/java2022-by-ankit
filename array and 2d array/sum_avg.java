import java.util.Scanner;
class sum_avg{
       public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       float sum=0;
       float avg=0;
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
       for(int i=0;i<arr.length;i++)
       {
           sum=sum+arr[i];
       }
       avg=(sum/n);
       System.out.println("sum is: "+sum);
       System.out.println("average is: " +avg);

       }
}