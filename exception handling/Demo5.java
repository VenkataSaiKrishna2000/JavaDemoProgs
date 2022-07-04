import java.io.*;
class A
{
     void abc() throws FileNotFoundException
    {
          for(int i=0;i<=20;i++)
          {
              System.out.println("I:"+i);
              if(i==15) throw new NullPointerException();
              if(i==12) throw new NumberFormatException();
              if(i==10) throw new ClassCastException();
              if(i==5) throw new FileNotFoundException();
          }
     }
}
class Demo5
{
     public static void main(String args[])
     {
            try{
                  A a=new A();
                  a.abc();
             }
            catch(NullPointerException np){
                System.out.println("catched np");
             }
             catch(NumberFormatException nf){
                System.out.println("catched nf");
             }
             catch(FileNotFoundException fnf){
                System.out.println("catched fnf");
             }
             catch(Exception e){
                System.out.println(e);
             }
             finally
             {
                System.out.println("finally executed");  
             }
     }

}