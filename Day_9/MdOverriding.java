class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){
        return n1 + n2 + 1;
    }
}

public class MdOverriding {
    public static void main(String[] args) {
        AdvCalc Obj = new AdvCalc();
        System.out.println(Obj.add(4,5));
    }    
}
