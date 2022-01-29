import java.util.Scanner;
class vowel_consonent{
    public static void main(String ak[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a character");
        char ch=sc.next().charAt(0);
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Entered character is vowel letter");
        }
        else 
        System.out.println("This is consonent");
    }
}