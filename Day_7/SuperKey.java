class A{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in int A");
    }
}

class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        // super();  //every construcor class have this 'super()' method in hidden form - and call default parent class constructor - if we want to call parametrise then only pass the value;
        
        // super(n);
        System.out.println("in int B");
    }
}

public class SuperKey {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
