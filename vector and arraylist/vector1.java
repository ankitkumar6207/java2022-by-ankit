
import java.util.*;
class vector1{
public static void main(String ak[])
{
Vector v=new Vector();
System.out.println(v.size());
v.add(1);
v.add('@');
v.add(234.94);
v.add("ankit kumar");
System.out.println(v.size());
//System.out.println(v);
for(int i=0;i<v.size();i++)
{
System.out.print(v.elementAt(i)+"\t");
}
System.out.println();
//traversing through iterator interface.
Iterator ii=v.iterator();
while(ii.hasNext())
{
System.out.print(ii.next()+"\t");
}
System.out.println();

//traversal through enumeration.
Enumeration e=v.elements();
while(e.hasMoreElements()){
System.out.print(e.nextElement()+"\t");
}
}
}

