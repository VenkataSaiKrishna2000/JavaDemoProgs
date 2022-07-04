import java.util.Scanner;
class Emp
{
      Scanner sc=new Scanner(System.in);
      Emp()
      {
           System.out.println("enter Id:");
           int id=sc.nextInt();
           System.out.println("enter  name:");
           String name=sc.next();
           System.out.println("enter  age:");
           int age=sc.nextInt();
           System.out.println("enter salary:");
           int sal=sc.nextInt();
           System.out.println("enter  designation:");
           String des=sc.next();
           System.out.println("name:"+name);
           System.out.println("age:"+age);
           System.out.println("Id:"+id);
           System.out.println("salary:"+sal);
           System.out.println("designation:"+des);

      }


}
class Sai
{
    public static void main(String args[])
      {
           Emp e=new Emp();

      }

}