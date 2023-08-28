class A{
    private int age;                //DATA HIDING
    public void setdata(int age){
        this.age=age;
 }
 public int getdat(){
    return age;

 }
}
class encapsulation{
    public static void main(String[] args) {
        A a=new A();
        a.setdata(22);
        System.out.println("YOUR AGE IS :"+a.getdat());
        
    }
}