
public class Demo {
    public static void main(String[] args) {
        int a = 5;
        Integer b = a; //auto-boxing
        System.out.println(b);

        int c = b; //auto-Unboxing
         System.out.println(c);

         String s = "2";
         int s2 = Integer.parseInt(s);
          System.out.println(s2*8);
    }
}
