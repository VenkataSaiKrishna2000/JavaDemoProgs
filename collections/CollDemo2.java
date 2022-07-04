import java.util.*;
class CollDemo2
{
   public static void main(String args[])
   {
        //List l=new List();
		
		//HashSet al=new HashSet();//remove duplicates and prints in random order
            //LinkedHashSet al=new LinkedHashSet();//remove duplicates and prints in  order
            TreeSet al=new TreeSet();//remove duplicates and prints in  ascending order of values
            al.add(100);
		al.add(125);
		al.add(106);
		al.add(160);
		al.add(190);
		al.add(125);
		
            
		
		
		Iterator i=al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		
}
}