public class poly_overloading {
      public void  show(int age){

        
        System.out.println("your age is :"+age);

     }
     void show(String name){
        String b=name;
        System.out.println("name is :"+b);
     }
     public static void main(String[] args) {
        poly_overloading ok=  new poly_overloading();
        ok.show(22);
     }

     }

    

