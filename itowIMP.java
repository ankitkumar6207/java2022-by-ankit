import java.util.Scanner;
public class itowIMP {
    public static void main(String[] args) {
        System.out.println("enter an integer");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        for(int i=n;i>0;i=i/10){
            rev=rev*10+(i%10);

        }
       
        int ch;
        for(int i=rev;i>0;i=i/10)
        {
            ch=(i%10);
            switch(ch){
                case 0:
                System.out.print("Zero ");
                break;
                case 1:
                System.out.print("One ");
                break;
                case 2:
                System.out.print("Two ");
                break;
                case 3:
                System.out.print("Three ");
                break;
                case 4:
                System.out.print("Four ");
                break;
                case 5:
                System.out.print("Five ");
                break;
                case 6:
                System.out.print("Six ");
                break;
                case 7:
                System.out.print("Seven ");
                break;
                case 8:
                System.out.print("Eight ");
                break;
                case 9:
                System.out.print("Nine ");
                break;
                default:
                System.out.println("enter an integer");
            }
        }

        
    }
    
}
