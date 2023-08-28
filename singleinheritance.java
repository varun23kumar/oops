class a{
    int age;
    String name;
    public void show(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println(age);
        System.out.println(name);

    }
}
    class b extends a{
        public void shoo(){
            System.out.println("hello");
        }

    }

public class singleinheritance {
    public static void main(String[] args) {
        b o=new b();
        o.show(23,"varun");
        o.shoo();
    }
    
}
