import java.util.*;
abstract class Hospital
{
	String name;
	int age;
      int id;
      int salary;
	
	Hospital()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter  name :");
		name=sc.nextLine();
		System.out.print("\n Enter  Age :");
		age=sc.nextInt();
           
            System.out.print("\n Enter id :");
		id=sc.nextInt();
		
		
	}
	public void display()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+ "\nid:"+id);	
	}
	
	
}
class Doctor extends Hospital
{
	public Doctor(){

              
            }
	
}

final class Patient extends Hospital {
	public Patient(){
		
		
	}
	public void assign()
      {
         if(id<=100)
          {
               System.out.println("patient belongs to doctor 1");
          }     
         else
         {
              System.out.println("patient belongs to doctor 2");
         }        

      }
}
public class Project3{
	public static void main(String args[])
	{
		int ch1=0,ch2=0;
		
		ArrayList<Hospital> list=new ArrayList<Hospital>();
		
		do{ 
		System.out.println("--------------------------------");
		System.out.println("1.Create");
		System.out.println("2.Display");
	
		System.out.println("3.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		ch1=sc1.nextInt();

			if(ch1==1){
			do{
				System.out.println("--------------------------------");
				System.out.println("1.doctor");
				System.out.println("2.Patient");
		            System.out.println("3.Assign patient to doctor");
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
					case 1:
						
						list.add( new Doctor() );
						
						break;
						
					case 2:
						list.add(new Patient());
						break;
					
					
                              
					}
			}while(ch2!=5);
		}
		if(ch1==2)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Hospital y=(Hospital) i.next();
				y.display();
			}
			
		}
		if(ch1==3)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Patient x=(Patient) i.next();
				x.assign();
                        
			}
		}
		}while(ch1!=4);
		
	}
}