import java.util.*;
public class Priorityqueue  {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: "+pq1);
        String str1;
        str1 = pq1.toString();
        System.out.println("String representation of the Priority Queue: "+str1);
    }
}
