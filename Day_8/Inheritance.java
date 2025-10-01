public class Inheritance{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5, 6);
        int r2 = obj.sub(8, 6);
        int r3 = obj.mull(8, 6);
        int r4 = obj.div(8, 6);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}