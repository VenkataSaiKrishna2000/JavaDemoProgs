import java.util.Scanner;
class A
{
    public void abc()throws InvalidAgeException
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter age:");
         int age=sc.nextInt();
         if(age<18) {
                   throw new InvalidAgeException("Invalid age");
                    }
          else
              {
                   System.out.println("age is valid"); 
              }
}   
}
class Demo6
{
     public static void main(String args[])throws InvalidAgeException
     {
           try {
           A a=new A();
           a.abc();}
           catch(InvalidAgeException inv){
            System.out.println("invalid age");
        }
     }
}
class InvalidAgeException extends Exception
{
     InvalidAgeException(String msg)
     { 
            super(msg);

     }
}