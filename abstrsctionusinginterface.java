interface a
{
    public void show();
}
interface c
{
    public void mood();
}

class b implements a,c{
    public void show()
    {
        System.out.println(" hello i am method show from interface A");
    }
    public void mood()
    {
        System.out.println(" hello i am method mood from interface C");
    }
}
public class abstrsctionusinginterface {
    public static void main(String[] args) {
    b ok=new b();
    ok.show();
    ok.mood();
    }
    
}
