package challenges;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CompanyRevenue {
    /*
     A = [10, -10, -1, -1, 10] => swaps=1
     A = [5, -3, -3, 1]

  csum= 0+10=10-10=10, + - 1=-1 = 10 -1, -1

    {10, -1, -1 }
     */

    public static void main(String[] args) {
        System.out.println(solution(new int[]{ 10, -10, -1, -1, 10} )); // 1
        System.out.println(solution(new int[]{ 5, -2, -3, 1} )); // 0
        System.out.println(solution(new int[]{ -1, -1, -1, 1, 1, 1, 1} ));// 3
        System.out.println(solution(new int[]{ 10, -15, -20, 30, 40 } ));// 3
    }
    public static int solution(int[] A){
        PriorityQueue<Integer> pq =  new PriorityQueue<>();
        int n =  A.length;
        //Add items in a Queue
        int currentSum = 0;
        int swaps  = 0;
        for(int i = 0; i < n; i++){
            currentSum += A[i];
            if(A[i] < 0){
                pq.add(A[i]);
            }
            if(currentSum < 0){
                currentSum += pq.poll() * -1;
                swaps ++;
            }
        }
        return  swaps;

    }
}
