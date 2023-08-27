public class defaultconstructor {
    String name;
    int age;

    defaultconstructor()
{
      System.out.println("your information  is :");

    
}

public void show(String name, int age)
{
  
    this.name=name;
    this.age=age;
    System.out.println("age is :"+age);
    System.out.println("name : "+name);
}



public static void main(String[] args) {

  defaultconstructor ok=new defaultconstructor();
    ok.show("varun", 23);
}
    
}
