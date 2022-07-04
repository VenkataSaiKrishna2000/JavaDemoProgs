
import java.io.*;
class A
{
     public void xyz()throws IOException,MaxAgeException
     {
            for(int i=0;i<=20;i++)
            {
                  //if(i==5)throw new MaxAgeException("age limit crossed");   
                  if(i==15)throw new NullPointerException();
                  //if(i==10)throw new IOException();
                  System.out.println("i value:"+i);
            }

     }
}
class Demo7
{
     public static void main(String args[])throws IOException,MaxAgeException
    {
           try
           {
              A a=new A();
              a.xyz();
          }
          catch(NullPointerException ne){System.out.println("null exception occured");}
          catch(IOException io){System.out.println("Io exception occured");}          
          catch(MaxAgeException ma){System.out.println("max age exception occured");}
    }
}
class MaxAgeException extends Exception
{
       MaxAgeException(String msg)
        {
            super(msg);
        }
}