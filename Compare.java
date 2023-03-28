import java.util.*;
public class Compare
{
    public static void main(String[] args) {
        HashSet<String> al1 = new HashSet<>();
        al1.add("Jisoo");
        al1.add("Jennie");
        al1.add("Rose");
        al1.add("Lisa");
        System.out.println("First set:" + al1);
        HashSet<String> al2 = new HashSet<>();
        al2.add("Chichu");
        al2.add("Jennie");
        al2.add("Rose");
        al2.add("Lisa");
        System.out.println("Second set:" + al2);
        boolean value = al1.equals(al2);
        System.out.println("Are the two set equal: " + value);
    }
}