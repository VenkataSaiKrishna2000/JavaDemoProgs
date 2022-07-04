import java.util.*;

public class CollDemo1
{
 public static void main(String args[])
 {
  Vector a=new Vector();
  a.add(100);
  a.add(200);
  a.add(300);
  a.add("Prudhvi");
 
  a.add('A');
  a.add(10.6);

System.out.println("======Iterator=======");
  Iterator i=a.iterator();
  while(i.hasNext())
  {
   System.out.println(i.next());
  }
  
System.out.println("======List Iterator=======");
  ListIterator li=a.listIterator();
  while(li.hasNext())
  {
   System.out.println(li.next());
  }
  System.out.println("======Reverse=======");
  while(li.hasPrevious())
  {
   System.out.println(li.previous());
  }
  
System.out.println("======Enumeration//only works with older classes=======");
  Enumeration e=a.elements();
  while(e.hasMoreElements())
  {
   System.out.println(e.nextElement());
  }
  


 }
}