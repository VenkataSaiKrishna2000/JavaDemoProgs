import java.util.Scanner;
class Power
{
   public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value a:");
        int a=sc.nextInt();
        System.out.println("Enter the exponent value b:");
        int b=sc.nextInt();
        System.out.println("entered number is "+a+"and its power is "+b+"value is "+Math.pow(a,b));
        


     }

}