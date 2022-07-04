import java.util.Scanner;
import java.io.*;
class Demo4
{
   public static void main(String args[])
    { 
        String name="sai";
        name=null; //null pointer exception
        System.out.println(name.length());
        String val="10A";
        System.out.println(Integer.parseInt(val)); //number format exception
        Scanner sc=new Scanner(System.in);
        System.out.println("enter tghe age ");
        int age=sc.nextInt();
        System.out.println("my age :"+age);//input mis match exception       
    }
}