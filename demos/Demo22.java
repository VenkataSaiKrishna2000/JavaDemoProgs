class Demo22
{
           public static void main(String args[])
           {
                   StringBuffer sb=new StringBuffer("Hello");//thread safe ,synchoromniozed
                   //StringBuilder sb=new StringBuilder("Hello");//not synchorinised
                   sb.append("Ramesh");
                   System.out.println(sb);
      
          
                   sb.insert(0 , "HI");
                   System.out.println(sb);
 
                   sb.replace(8,15,"Rakesh");
                   System.out.println(sb);
   
                    
                   sb.delete(1,5);

                 
                   System.out.println(sb.reverse());
 

             }
}