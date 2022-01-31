import java.util.Scanner;
public class Ascii_of_char {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a character");
    Character c = sc.next().charAt(0);
    // int i =int(c);
    System.out.println("Ascii value of  is: "+(int)c);
    System.out.println("Ascii value of  is: "+(int)(c));
}
    
}
