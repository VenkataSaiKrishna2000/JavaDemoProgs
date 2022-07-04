import java.util.Scanner;
class Emp
{
      Scanner sc=new Scanner(System.in);
      int id,sal,age;
      String name;
      String des;
      Emp()
      {
           System.out.println("enter Id:");
           id=sc.nextInt();
           System.out.println("enter  name:");
           name=sc.next();
           System.out.println("enter  age:");
           age=sc.nextInt();
           System.out.println("enter salary:");
           sal=sc.nextInt();
           System.out.println("enter  designation:");
           des=sc.next();
           

      }
     void display()
      {
         System.out.println("name:"+name);
           System.out.println("age:"+age);
           System.out.println("Id:"+id);
           System.out.println("salary:"+sal);
           System.out.println("designation:"+des);

      } 

}
class Demo5
{
    public static void main(String args[])
      {
           Emp e=new Emp();
           e.display();
      }

}