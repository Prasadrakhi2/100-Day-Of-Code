interface A{
    int a = 10;   // final / static variable
    String area = "Mumbai";
     void show();
     void config();
}


interface C{
    void singing();
}
class B implements A,C{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void singing(){
        System.out.println("singing...");
    }
}

public class Demo{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        obj.singing();
    }
}