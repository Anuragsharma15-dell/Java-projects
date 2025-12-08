
 class  Base  {
    
          int weight = 10;

        int height = 6;
       
        double  Base(double pi ){
          pi = 3.14;
          return pi*pi;

        }
        
    }
  class Child extends Base{
   int add(int num1 , int num2 ){
    return num1*num2;



   }
    
  }
  
  
  public class Test{
    public static void main(String[] args){
      Child ch = new Child();
      System.out.println(ch.height);
      Base b = new Base();
      System.out.println(b.Base(12));
      System.out.println(ch.add(10, 10));
      System.out.println("Added");
    }

  }



  
  
 