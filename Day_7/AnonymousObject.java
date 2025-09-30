class Human{
    public Human(){
        System.out.println("object created");
    }

    public void show(){
        System.out.println("show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new Human().show();  //anounymous object
        new Human().show(); //again object create
    }
}
