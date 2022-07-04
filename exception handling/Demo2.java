import java.util.Scanner;
import java.io.*;
class Demo2
{
     public static void main(String args[])
     {
        m1();
     }
     public static void m1()
     {
         m2();
     }
      public static void m2()
     {
         m3();
     }
      public static void m3()
     {
            
            try
            {
               File f=new File("abc.txt");
               FileReader fr=new FileReader(f);
            }
            catch(Exception e)
            {
                  System.out.println("number/0 is not possible,please enter valid number");
            }
     }
}