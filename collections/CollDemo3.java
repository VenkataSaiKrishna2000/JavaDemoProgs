import java.util.*;
class CollDemo3
{
   public static void main(String args[])
   {
        
            TreeMap map=new TreeMap();
            map.put(111,"Sai");
            map.put(222,"krishna");
            map.put(555,"rahesh");
            map.put(333,"ramesh");
            map.put(595,"shaik");
            map.put(999,"mastan");	
            System.out.println(map);
		
		Set s=map.entrySet();
		Iterator i=s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		
}
}