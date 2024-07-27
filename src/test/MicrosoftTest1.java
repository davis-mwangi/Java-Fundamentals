package test;

import java.util.PriorityQueue;

public class MicrosoftTest1 {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(6);
        pq.add(1);
        pq.add(3);

        System.out.println(pq.poll());
    }
}
