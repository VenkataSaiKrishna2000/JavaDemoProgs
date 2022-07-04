import java.util.Scanner;
class Emp
{
      Scanner sc=new Scanner(System.in);
      Emp()
      {
           System.out.println("enter  name:");
           String name=sc.next();
           System.out.println("enter  age:");
           String age=sc.next();
           System.out.println("name:"+name);
           System.out.println("age:"+age);

      }


}
class Demo3
{
    public static void main(String args[])
      {
           Emp e=new Emp();

      }

}