import java.util.*;
class ArrayL1
{
   public static void main(String args[])
   {
        //List l=new List();
            ArrayList al=new ArrayList();
		//LinkedList al=new LinkedList();
		al.add(100);
		al.add("Krishna");
		al.add(true);
		al.add('A');
		al.add(10.6);
		al.add(5,9999);
            al.add("sai");
		
		
		Iterator i=al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		
}
}