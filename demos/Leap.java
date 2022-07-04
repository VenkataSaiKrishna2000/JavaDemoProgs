import java.util.Scanner;
class Year{
   Scanner sc=new Scanner(System.in);
      Year()
        {
         System.out.println("enter the year:");
         int year=sc.nextInt();
	   if(year%400==0)
         {
            System.out.println(year+"is leap Year"); 
            if(year%100==0)
             {
              System.out.println(year+"is leap Year"); 
              if(year%4==0){
                           System.out.println(year+"is leap Year");  
                              }
             }
          }
                  	                          
        }

}

class Leap
{
	public static void main(String args[])	
	{
	     
	  Year y=new Year();      	      
	                      
 	}
}