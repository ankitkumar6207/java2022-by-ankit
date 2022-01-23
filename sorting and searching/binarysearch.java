import java.util.Scanner;
class binarysearch{
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
        System.out.println("enter data for search");
       int key=sc.nextInt();
       int l=0,f=0;
       int h=(n-1);
       int mid=0;
       while(l<=h){
        mid=(l+h)/2;
           if(arr[mid]>key)
           h=mid-1;
           if(arr[mid]<key)
           l=mid+1;
           if(arr[mid]==key)
           {
               System.out.println("data found at position:"+(mid+1));
               f++;
               break;
           }
       }
       if(f==0)
       System.out.println("element is not present in the array");
       
       
}
}