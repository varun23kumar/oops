public class parameterizedconstructor {
    String name;
    int age;
parameterizedconstructor(int age, String name)
{
    this.name=name;
    this.age=age;
}
public void show()
{
    System.out.println("age is :"+age);
    System.out.println("name : "+name);
}


public static void main(String[] args) {

  parameterizedconstructor ok=new parameterizedconstructor(2, "varun");
    ok.show();
}
    
    
}
