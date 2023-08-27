public class classandobject {
    String name;
    int age;
public void show( int age , String  name)
{
    this.age=age;
    this.name=name;
}
   
public void shoo(){
     System.out.println("age is :"+age);
    System.out.println("name : "+name);
}

public static void main(String[] args) {

    classandobject ok=new classandobject();
    ok.show(1,"varun");
    ok.shoo();
}
}
    

    

    

