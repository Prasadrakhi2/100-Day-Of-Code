import java.util.*;
class Mobile{
    String name;
    int price;
    static String product;

    
    public void show(){
        // System.err.println(name + " : " + price + " : " + product);
        System.err.println("in instance block");
    }

    static{
        product = "phone";
        System.out.println("in static block");
    }

}

public class StaticKeywords{
    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        obj1.name = "apple";
        obj1.price = 1500;
        Mobile.product = "phone";

        Mobile obj2 = new Mobile();
        obj2.name = "samsung";
        obj2.price = 1800;
        obj2.product = "cell phone";

        obj1.show();
        obj2.show();
    }
}