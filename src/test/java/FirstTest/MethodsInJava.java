package FirstTest;

public class MethodsInJava {
    public static void main(String[] args) {
        //This is a method also
        MethodsInJava d=new MethodsInJava();
       String name= d.getData();
        System.out.println(name);
        MethodsJava2 d2= new MethodsJava2();
        d2.getUserData();
        getData2();
    }
    public String getData(){
        System.out.println("Hello world 1");
        return "Adile";
    }
    public  static String getData2(){
        System.out.println("Hello world 3");
        return "Adile";
    }
}
