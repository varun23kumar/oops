public class copyconstructor {
    int age;
    String name;
    copyconstructor(){

        }
        void show(int age, String name){
         this.age=age;
         this.name=name;
        
        }
 
   
    copyconstructor(copyconstructor cc){
     name=cc.name;
     age=cc.age;
     }
        public void display()
    {
        System.out.println(age);
        System.out.println(name);
    }
  public static void main(String[] args) {
    copyconstructor ok=new copyconstructor();
    ok.show(22,"varun");
  
    copyconstructor  cc=new copyconstructor(ok);
    ok.display();
    cc.display();

  } 
}
