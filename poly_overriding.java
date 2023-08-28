
class a{
    void show()
    {
        System.out.println("hello i m base class");
    }
}
    class b extends a
    {
        @Override
        void show()
        {
        System.out.println("hello i am derived class");
        }
    }


public class poly_overriding {
    public static void main(String[] args) {
    a ok=new a();
    ok.show();
    b o =new b();
    o.show();
    }
    
}
