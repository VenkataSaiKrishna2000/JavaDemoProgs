class Bank
 {
     public void eduloan()
     {
           System.out.println("7 % ");
     }
     
}
class Sbi extends Bank
{
    public void eduloan()
     {
           System.out.println(" SBI interest:8  % ");
     }
}
class Axis extends Bank
{
    public void eduloan()
     {
           System.out.println("Axis interest: 9  % ");
     }
}
public class Demo3{

 

    public static void main(String[] args) {
        
            Sbi s=new Sbi();
            s.eduloan();
            Axis a=new Axis();
            a.eduloan();
    }

 

}
 