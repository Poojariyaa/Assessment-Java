import java.util.*;
public class Hashset
{
    public static void main(String[] args)
    {
        HashSet<String> al=new HashSet<>();
        al.add("Jisoo");
        al.add("Jennie");
        al.add("Rose");
        al.add("Lisa");
        System.out.println("Original arraylist:"+al);
        al.clear();
        System.out.println("After deletion:"+al);
    }
}