public class thiskeyword {
    int age;
    String name;
    public void show(int age, String name){
        this.age=age;
        this.name=name;
 }
    public void shor()
    {
        
        System.out.println(" your age is :"+age);
         System.out.println(" your name is :"+name);
    }
    public static void main(String[] args) {
        thiskeyword ok=new thiskeyword();
        ok.show(2,"umbrella");
        ok.shor();
    }
    
}
