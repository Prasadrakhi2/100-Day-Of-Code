import java.util.*;

class MyClass{
    public void music(){
        System.out.println("Music played");
    }

    public String pens(int price){
        return "Pen";
    }
}

public class PenClass{
    public static void main(String args[]){
        MyClass pen = new MyClass();
        pen.music();
        System.out.println(pen.pens(5));
    }
}