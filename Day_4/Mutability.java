
public class Mutability{
    public static void main(String args[]){
        /* Imutable */
        // String s1 = "rakhi";
        // String s2 = s1;
        // s1 = s1 + " prasad";

        /* Mutable */
        StringBuilder s1 = new StringBuilder("rakhi");
        StringBuilder s2 = s1;
        s1.append(" prasad");
        if(s1 == s2) System.out.println("same");
        else System.err.println("not same");
    }
}
