import java.util.Scanner;
class dtob{
    public static void main(String ak[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.in decimal");
        int n=sc.nextInt();
        int binary=0;
        int re=1;
        for(int i=n;i>0;i=i/2){
           binary=binary+((i%2)*re);
           re=re*10;
        }
        System.out.println("given no. in binary form");
        System.out.println(binary);    
    
    }
}