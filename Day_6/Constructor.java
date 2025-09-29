class Human{
    private int age;

    public Human(){ //default
        age = 12;
    }
    public Human(int age){  //parametrize
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

public class Constructor{
    public static void main(String args[]){
        Human obj = new Human();
        Human obj1 = new Human(20);
         System.err.println("are : " + obj.getAge());
         System.err.println("are : " + obj1.getAge());
        obj.setAge(20);
        // System.err.println(obj.getAge());
    }
}