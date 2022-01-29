import java.util.Scanner;
public class vowels_count_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String str=sc.nextLine();
         int counter=0;
        for(int i=0;i<str.length();i++)
        {
            Character ch=str.charAt(i);
        
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        counter++;
        }
        System.out.println("Number of vowels are present in the sentence: "+counter);
    }
}
