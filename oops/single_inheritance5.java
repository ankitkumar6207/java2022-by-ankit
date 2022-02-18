import java.util.Scanner;
class single_inheritance5{
    Scanner sc=new Scanner(System.in);
    int l;
    void getlenth(){
        System.out.println("enter the length:");
        l=sc.nextInt();

    }

    

}



class B extends single_inheritance5{
    int b;

    void getb() {
        System.out.println("enter the breadth:");
        b = sc.nextInt();
    }

    void area() {
        System.out.println("area is :" + (l * b));

    }

    public static void main(String[] args) {

        B obj = new B();
        obj.getlenth();
        obj.getb();
        obj.area();

    }

    
    

    

}

