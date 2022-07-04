abstract class RBIBank
{
      abstract void loan();
      abstract void account();
      abstract void OT();
      abstract void ATM();     
}
class SBI extends RBIBank
{
       
       void loan(){System.out.println("loan with 5%");}
       void account(){System.out.println("salary account");}
       void OT(){System.out.println("Yono");}
       void ATM(){System.out.println("limit 40000 only");}
}
class Union extends RBIBank
{
       void loan(){System.out.println("loan with 8%");}
       void account(){System.out.println("savings account");}
       void OT(){System.out.println("Umobile");}
       void ATM(){System.out.println("limit 30000 only");}
}

class Demo3
{
     public static void main(String args[])
     {
         SBI s=new SBI();
         System.out.println("you are using sbi");
         s.loan();
         s.account();
         s.OT();
         s.ATM();
         Union u=new Union();
         System.out.println("\nyou are using union");
         u.loan();
         u.account();
         u.OT();
         u.ATM();
     }
}