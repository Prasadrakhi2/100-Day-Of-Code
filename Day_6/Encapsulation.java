class Student{
    private int age;
    private String name;

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}

public class Encapsulation{
    public static void main(String args[]){
        Student obj = new Student();
        obj.setAge(10);
        obj.setName("rakhi");
        System.err.println(obj.getName() + " : " + obj.getAge());
    }
}