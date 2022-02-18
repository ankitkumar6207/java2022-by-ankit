import java.util.Scanner;
public class multiple_inheritance8 {
    Scanner sc=new Scanner(System.in);
    int l;
    void getl()
    {
        System.out.println("ENTER LENGTH:");
        l=sc.nextInt();
    }
  
}

interface B{
    int b=4;
    void area();
    
}

class C extends multilevel_inheritance6 implements B{
public void area()
{
    System.out.println("area is:"+(l*b));
}
public static void main(String ak[]){
    C obj =new C();
    
    obj.area();
}


}
