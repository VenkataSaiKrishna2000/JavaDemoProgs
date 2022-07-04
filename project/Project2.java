
import java.util.*;
abstract class Student
{
	String name;
	int age;
	int per;
	String pos;
      int t;
      int e;
      int m;
      int s;
      int so;
	static int count=0;
	Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter name :");
		name=sc.nextLine();
		System.out.print("\n Enter Age :");
		age=sc.nextInt();
            System.out.print("\n Enter marks of telugu :");
		t=sc.nextInt();
		System.out.print("\n Enter marks of English :");
		e=sc.nextInt();
            System.out.print("\n Enter marks of Maths :");
		m=sc.nextInt();
            System.out.print("\n Enter marks of Science:");
		s=sc.nextInt();
            System.out.print("\n Enter marks of Social:");
		so=sc.nextInt();
            
		per=(t+e+m+s+so)/5;
		
	}
	public void display()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+"\nPercentage:"+per);	
	}
	public abstract void Position();	
	
	
}

final class Student1 extends Student {
	public Student1(){
		
	}
	public void Position(){
           if((per>=85))
            {
		   System.out.println("merit=Distinction");
            }
           else if((per>=65)&&(per<85))
           {
               System.out.println("merit=first class");
           }
           else if((per>=55)&&(per<65))
           {
        	   System.out.println("merit=second class");
           }
           else if((per>=35)&&(per<55))
           {
               System.out.println("merit=third class"); 
           }
           else
           {
               System.out.println("merit=fail"); 
           }
		
	}
}
final class Student2 extends Student {
	public Student2(){
		
	}
	public void Position(){
           if((per>=85))
            {
		   System.out.println("merit=Distinction");
            }
           else if((per>=65)&&(per<85))
           {
               System.out.println("merit=first class");
           }
           else if((per>=55)&&(per<65))
           {
        	   System.out.println("merit=second class");
           }
           else if((per>=35)&&(per<55))
           {
               System.out.println("merit=third class"); 
           }
           else
           {
               System.out.println("merit=fail"); 
           }
		
	}
}
final class Student3 extends Student {
	public Student3(){
		
	}
	public void Position(){
           if((per>=85))
            {
		   System.out.println("merit=Distinction");
            }
           else if((per>=65)&&(per<85))
           {
               System.out.println("merit=first class");
           }
           else if((per>=55)&&(per<65))
           {
        	   System.out.println("merit=second class");
           }
           else if((per>=35)&&(per<55))
           {
               System.out.println("merit=third class"); 
           }
           else
           {
               System.out.println("merit=fail"); 
           }
		
	}
}

public class Project2{
	public static void main(String args[])
	{
		int ch1=0,ch2=0;
		
		ArrayList<Student> list=new ArrayList<Student>();
		
		do{ 
		System.out.println("--------------------------------");
		System.out.println("1.enter the details");
		System.out.println("2.Display");
            System.out.println("3.Merit");
		System.out.println("4.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		ch1=sc1.nextInt();

			if(ch1==1){
			do{
				System.out.println("--------------------------------");
				System.out.println("1.Student1:");
				System.out.println("2.Student2:");
				System.out.println("3.Student3:");
                        
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
					case 1:
						
						list.add( new Student1() );
						
						break;
						
					case 2:
						list.add(new Student2());
						break;
					
					case 3:
						list.add(new Student3());
						break;
                            
					}
			}while(ch2!=4);
		}
		if(ch1==3)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Student y=(Student) i.next();
				y.display();
                        y.Position();
                        
			}
			
		}
		if(ch1==2)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Student y=(Student) i.next();
				y.display();
			}
			
		}
		}while(ch1!=4);
		
	}
}