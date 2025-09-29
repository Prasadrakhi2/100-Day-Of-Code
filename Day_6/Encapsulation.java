class Student{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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