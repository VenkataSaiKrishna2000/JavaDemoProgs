class Demo20
{
       public static void main(String args[])
       {
                   String name1= new String("ramesh");//string is immutable:not changeble:not modifyable
                   name1.concat("kumar");
                   System.out.println(name1);
       
                   StringBuffer sb=new StringBuffer("Sai");//mutable-->we can change or modify
                   sb.append(" Krishna");
                   System.out.println(sb);
                   StringBuilder sbb=new StringBuilder("Sai");//mutable-->we can change or modify
                   sbb.append(" Krishna");
                   System.out.println(sbb);
       }
}