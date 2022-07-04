import java.util.*;
class Clerk
{
       
}
class Array2
{
    public static void main(String args[])
    {
           ArrayList a=new ArrayList();
           a.add(100);
           a.add(200);
           a.add(300);
           a.add("sai");
           a.add(true);
           a.add('A');
           a.add(20.5);
           a.add(new Date());
           a.add(new Thread());
           a.add(new Clerk());
           System.out.println(a);
           
    }
}