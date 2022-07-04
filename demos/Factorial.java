import java.util.Scanner;
class Example{
    Scanner sc =new Scanner(System.in);
    Example()
    {
    int i,fact=1;  
    System.out.println("enter the number:");
    int n=sc.nextInt();
    for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of"+n+"is:"+fact);         }


}

class Factorial{  
 public static void main(String args[]){  
    Example e=new Example();
 }  
} 