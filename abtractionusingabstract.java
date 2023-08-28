abstract class a 
{
    abstract void show();
    a(){
        System.out.println("hello i am constructor from class A");

    }
   void mood(){
     System.out.println("hello i am mood mehtod from class A");
   }
}
class b extends a 
{
    void show() 
    {
        System.out.println("hello i am method show from  A class");
    }
}

public class abtractionusingabstract {
    public static void main(String[] args) {
        b ok = new b();
        ok.mood();
        ok.show();
        }
}
