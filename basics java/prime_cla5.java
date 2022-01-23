public class prime_cla5 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int f=0;
System.out.println(n);
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            f++;
        }
        if(f==0)
        System.out.println("prime no.");
        else
        System.out.println("not prime no");
      
    }
    
}
