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
    class c extends b{
        void mood(){
            System.out.println("hello i m from last class , means class c");
        }
    }

public class multilevel {
    public static void main(String[] args) {
     c ok= new c();
     ok.show(112,"varun ");
     ok.shoo();
     ok.mood();   
    }
}
    
