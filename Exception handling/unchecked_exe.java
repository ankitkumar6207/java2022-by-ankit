//unchecked exception is known run time exception.
public class unchecked_exe {
    public static void main(String alk[]){
        int a[]={8,4,6};
        try{
            System.out.println(a[8]);
        }
        catch(Exception obj){
            System.out.println("exception is handled!!");
            System.out.println(obj);//it will print the exception found in this program.

        }
       
        System.out.println("hello");
    }
}
