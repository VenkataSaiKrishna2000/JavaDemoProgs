import java.util.Scanner;
class Emp
{
	Scanner sc=new Scanner(System.in);
	int id;String name;int age;int salary ;int exp;
	String desig;
	Emp()
	{
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
	      System.out.print("ENter Experience: ");
		 exp=sc.nextInt();
	}
	void display()
	{
		System.out.println("***********************************");
		System.out.println(" ID : " + id );
		System.out.println("Name : " + name);
		System.out.println("Age : " + age );
            System.out.println("Experience: " +exp );
		System.out.println("Salary : " + salary  );
		System.out.println("Designation : " + desig);
	}
}
class Tester extends Emp
{
	Tester()
	{
         if(exp>=5){
		salary =25000;
		
          }	
         else{
                 salary=15000;      
             }
	
       desig="Tester ";
}
}
class Manager  extends Emp
{
	Manager()
	{
		if(exp>=5){
		salary =90000;
		
          }	
         else{
                 salary=50000;      
             }
		desig=" Manager ";
	}
}
class Dev extends Emp
{
	
	Dev()
	{
		if(exp>=5){
		salary =250000;
		
          }	
         else{
                 salary=10000;      
             }
		desig=" Dev ";
	}
}
class Clerk extends Emp
{
	Clerk()
	{
		if(exp>=5){
		salary =50000;
		
          }	
         else{
                 salary=25000;      
             }
		desig=" Clerk ";
	}
}
class Demo3
{
	public static void main(String args[])
	{

		System.out.println("Developer ");
		Dev d=new Dev();
		d.display();

		System.out.println(" Manager ");
		Manager m =new Manager();
		m.display();
	
		System.out.println(" Clerk ");
		Clerk c=new Clerk();
		c.display();
				
		System.out.println(" Tester ");
		Tester t =new Tester();
		t.display();
	}
}