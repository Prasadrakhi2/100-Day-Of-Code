public class Inheritance{
    public static void main(String[] args) {
        VaryAdvCalc obj = new VaryAdvCalc();
        int r1 = obj.add(5, 6);
        int r2 = obj.sub(8, 6);
        int r3 = obj.mull(8, 6);
        int r4 = obj.div(8, 6);
        double r5 = obj.power(2, 3);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}