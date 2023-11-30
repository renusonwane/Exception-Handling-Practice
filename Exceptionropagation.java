package Exception_Handling;

public class Exceptionropagation {  
  void m()
  {  
    int data = 50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
    Exceptionropagation obj=new Exceptionropagation();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  