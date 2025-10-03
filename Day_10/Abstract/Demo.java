abstract class Car{
    public abstract void drive();
    // public abstract void fly();

    public void playMusic(){
        System.out.println("play music");
    }
}

 class Tata extends Car{
// abstract class Tata extends Car{
     public  void drive(){
        System.out.println("drive");
     };
}

// concrete class (if we not define the abstract method in child class then we have to create another subclass of that child class to define if)
class UpperTata extends Tata{
    public  void fly(){
        System.out.println("fly.....");
    };
}

public class Demo {
    public static void main(String[] args) {
        Car obj = new Tata();
        // Car obj = new UpperTata();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
