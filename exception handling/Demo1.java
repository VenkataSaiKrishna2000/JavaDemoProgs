import java.util.Scanner;
class A
{
     Scanner sc=new Scanner(System.in);
     A()
     {
            System.out.println("enter a value A:");
            int a=sc.nextInt();
            System.out.println("enter a value B:");
            int b=sc.nextInt();
            try
            {
               int c=a/b;
               System.out.println("enter a value C:"+c);
            }
            catch(ArithmeticException ae)
            {
                  System.out.println("number/0 is not possible,please enter valid number");
            }
     }
}


class Demo1
{
     public static void main(String args[])
     {
        A a=new A();
     }
}