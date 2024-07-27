package test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Buildings {
    public static void main(String[] args) {
        int [] heights =new int[]{4,2,3,1};
        //                        0 1 2 3
        System.out.println( Arrays.toString(findBuildings(heights) ));
    }
    public static  int[] findBuildings(int[] heights) {
        Deque<Integer[]> deque = new LinkedList<>(); // [1:3]
        int n = heights.length;
        for(int i = n - 1; i >= 0; i--){
            if(deque.isEmpty() || heights[i] > deque.peek()[1] ){
                deque.add(new Integer [] {i, heights[i]});
            }
        }
        int [] res = new int[deque.size()];
        int i = 0;
        while(!deque.isEmpty() ){
            Integer [] pair = deque.poll();
            res[i] = pair[0];
            i++;
        }
        return res;
    }
}
