import java.util.Scanner;
class multilevel_inheritance6{


    Scanner sc=new Scanner(System.in);
    int l;
    void getlenth(){
        System.out.println("enter the length:");
        l=sc.nextInt();

    }

    public static void main(String[] args) {

        C obj = new C();
        obj.getlenth();
        obj.getb();
        obj.area();

    }

  

}



class B extends multilevel_inheritance6{
    int b;

    void getb() {
        System.out.println("enter the breadth:");
        b = sc.nextInt();
    }

}


class C extends B{
    void area() {
        System.out.println("area is :" + (l * b));

    }

  
}
