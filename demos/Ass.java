import java.util.Scanner;

class Tester 
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary ;
      int incr;
	String desig;
	void create()
	{
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		salary =25000;
		desig="Tester ";	
	}
	void display()
	{
		
			System.out.println("*************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary);
			System.out.println("Designation : " + desig);
	}
	void raiseSalary()
	{
		salary =25000;
            System.out.println("salary before increment of tester:"+salary);
            System.out.print("enter the increment of tester:");
            incr=sc.nextInt();
		salary=salary+incr;
		System.out.println("Raised salary of Tester: "+salary);

	}
}
class Manager  
{
	
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary ;
	int incr;
	String desig;
	void create()
	{
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		 
		salary =90000;
		desig="Manager ";	
	}
	void display()
	{
		
			System.out.println("*************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
		
	}
	void raiseSalary()
	{
		salary = 90000;
            System.out.println("salary before increment of Manager:"+salary);
            System.out.print("enter the increment of manager:");
            incr=sc.nextInt();
		salary=salary+incr;
		System.out.println("Raised salary of Manager: "+salary);
	}
}
class Dev 
{
	
	
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary ;
	String desig;
	int incr;
	void create()
	{
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		salary =500000;
		desig="Dev ";	
	}
	void display()
	{
		if(name==null)
			System.out.println("You have not entered details of employees");
		else 
		{
			System.out.println("*************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
		}
	}
	void raiseSalary()
	{
		salary = 50000;
            System.out.println("salary before increment of Developer:"+salary);
		System.out.print("enter the increment of developer:");
            incr=sc.nextInt();
		salary=salary+incr;
		System.out.println("Raised salary of Dev: "+salary);
	}
}
class Clerk 
{
	
	Scanner sc=new Scanner(System.in);
	int id;
      String name;
	int age;
	int salary ;
	String desig;
	int incr;
	void create()
	{
		System.out.print("ENter Id : ");
		  id=sc.nextInt();

		System.out.print("ENter Name : ");
		 name= sc.next(); 

		System.out.print("ENter Age : ");
		 age =sc.nextInt();
		salary =2000;
		desig="Clerk ";	
	}
	void display()
	{
		if(name==null)
			System.out.println("You have not entered details of employees");
		else 
		{
			System.out.println("*************");
			System.out.println(" ID : " + id );
			System.out.println("Name : " + name);
			System.out.println("Age : " + age );
			System.out.println("Salary : " + salary  );
			System.out.println("Designation : " + desig);
		}
	}
	void raiseSalary()
	{
		salary = 20000;
            System.out.println("salary before increment of Clerk:"+salary);
		System.out.print("enter the increment of clerk:");
            incr=sc.nextInt();
		salary=salary+incr;
		System.out.println("Raised salary of Clerk: "+salary);
	}
}

class Ass
{
	public static void main(String args[])
	{

		Dev d=new Dev();
		Manager m =new Manager();
		Clerk c=new Clerk();
		Tester t =new Tester();
		Scanner sc=new Scanner(System.in);
            System.out.println("Choose the below Option number to perform the certain task");
		System.out.println("1. Create ");		
		System.out.println("2. Display ");
		System.out.println("3. Raise Salary ");
		System.out.println("4. Exit ");
		int n,n1;
		do
		{
			n=sc.nextInt();
			switch(n)
			{
				case 1: System.out.println("Enter type of employee you want to create ");
                                    System.out.println("1.Developer\n2.Manager\n3.Clerk\n4.Tester");
						n1=sc.nextInt();
						switch(n1)
						{
							case 1: System.out.println("Enter the Developer Details");
									d.create();
									break;
                                                      
							case 2: System.out.println("Enter the Manager Details ");
									m.create();
									break;
                                                      
							case 3: System.out.println("Enter the Clerk Details");
									c. create();
									break;
                                                      
							case 4: System.out.println("Enter the Tester Details");
									t.create();
									break;
                                                     
							
							default:System.out.println("wrong selection");
                                                  break;
						}
                                    System.out.println("\n To continue press the number");
                                    System.out.println("1.create\n2.display\n3.raise salary\n4.exit"); 
                                    break;
						
				case 2: System.out.println("Display all the members details of employees");
						d.display();
						m.display();
						c.display();
						t.display();
                                    System.out.println("\n To continue press the number");
                                    System.out.println("1.create\n2.display\n3.raise salary\n4.exit"); 
						break;
				case 3: System.out.println("Raising the salary of all employees ");
						d.raiseSalary();
						m.raiseSalary();
						c.raiseSalary();
						t.raiseSalary();
                                    System.out.println("\n To continue press the number");
                                    System.out.println("1.create\n2.display\n3.raise salary\n4.exit"); 
						break;
				case 4: System.out.println("Exiting from session");
						break;
				default: System.out.println("You entered wrong option"); 
							break;
			}
			if(n==4)
				break;
		}while(true);
	}
}