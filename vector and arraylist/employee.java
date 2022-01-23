import java.util.*;

public class employee {
    String name, dept;
    int id;
    double Asal;
    // static ArrayList<employee> obj = new ArrayList<employee>();
    static Vector obj=new Vector();
    static Scanner s = new Scanner(System.in);

    employee(String n, String d, int i, double s) {
        name = n;
        dept = d;
        Asal = s;
        id = i;
    }

    void display() {
        System.out.println(name + "\t" + id + "\t" + dept + "\t" + Asal + "\n");

    }

    void delete(int key){
        System.out.println("\nRecord id "+id+" is deleted");//way to print variabel in middle of double quotes statement.
        obj.remove(key);
    }

    int search(int id1, employee ob) {
        int f = 0;
        if (id1 == ob.id) {
            System.out.println("data found with following details:\n");
            System.out.println(name + "\t" + id + "\t" + dept + "\t" + Asal + "\n");
            f++;
        }
        System.out.println(f);
        return f;
    }

    int update(int id1, employee ob) {
        int f = 0;
        if (id1 == ob.id) {
            System.out.println("data found with following details:\n");
            System.out.println(name + "\t" + id + "\t" + dept + "\t" + Asal + "\n");
            System.out.println("\nenter updated name dept and Annual salary ");
            ob.name = s.next();
            ob.dept = s.next();
            ob.Asal = s.nextDouble();
            f++;

        }
        return f;

    }

    public static void main(String[] args) {
        int ch1, ch2, xx = 0, xyz = 0;
        employee e;

        do {
            System.out.println("\ninsert:1\nDisplay:2\nDelete:3\nSearch:4\nUpdate:5\n");
            ch1 = s.nextInt();
            switch (ch1) {
                case 1:
                    System.out.println("\nenter name dept id and annual salary");
                    e = new employee(s.next(), s.next(), s.nextInt(), s.nextDouble());
                    obj.add(e);
                    break;

                case 2:
                    Iterator ii = obj.iterator();
                    System.out.println();
                    while (ii.hasNext()) {
                        employee ref = (employee) (ii.next());
                        ref.display();
                    }
                    break;
                case 3:
                    System.out.println("\n enter employee id to delete");
                    int id1=s.nextInt();
                    Iterator i3=obj.iterator();
                    int counter=0;
                    employee objref=null;
                    while(i3.hasNext()){
                        counter++;
                        employee ref1=(employee)(i3.next());
                        objref=ref1;

                        if(ref1.id==id1){
                            break;

                        }
                    }
                    if(obj.isEmpty())
                    System.out.println("\nArray list is empty so can't delete!!");
                    else
                    objref.delete(counter-1);
                    // obj.remove(counter-1);
                    break;

                case 4:
                    System.out.println("\n Enter employee id to search");
                    int id2 = s.nextInt();
                    Iterator i4 = obj.iterator();
                    while (i4.hasNext()) {
                        employee ref2 = (employee) (i4.next());
                        xx = ref2.search(id2, ref2);
                        System.out.println(xx);
                        
                    }
                    System.out.println(xx);
                    if (xx == 0) {
                        System.out.println("\n Record not found");
                    }
                    break;

                case 5:
                    System.out.println("\n Enter employee id to update");
                    int id3 = s.nextInt();
                    Iterator i5 = obj.iterator();
                    while (i5.hasNext()) {
                        employee ref3 = (employee) (i5.next());
                        xyz = ref3.update(id3, ref3);
                    }
                    if (xyz == 0) {
                        System.out.println("\n Record not found so we can not perform updation");
                    }
                    break;

            }
            System.out.println("\nExit:1\nContinue:2\n");
            ch2 = s.nextInt();

        } while (ch2 == 2);

    }

}
