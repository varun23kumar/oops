class a{
    int age;
    String name;
    public void show(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println( "your age is: "+age);
        System.out.println("your name is :"+name);

    }
}
    class b extends a{
        public void shoo(){
            System.out.println("hello i am from b class");
        }

    }
    class c extends a{
        void mood(){
            System.out.println("hello i m from c class");
        }
    }

public class heirarichalinheritance {
    public static void main(String[] args) {
        b p = new b();
        c q= new c();
        p.show(23,"varun" );
        p.shoo();
        q.show(55,"dinesh");
        q.mood();
    }
    
}
