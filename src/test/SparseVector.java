package test;
import java.util.*;

public class SparseVector {
    //We only store numbers that are not zero,
    List<List<Integer>>list =  new ArrayList<>();

    SparseVector(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                this.list.add(Arrays.asList(i, nums[i]));
            }
        }
    }

    // Return the dotProduct of two sparse vectors
    /*

    { [1,3], [3,4]}
        0      0
     [ [0,1] [3,2], [4,3] ]
         0    1       2
     */
    public int dotProduct(SparseVector vec) {
        int i = 0; // v1
        int j = 0; // vec
        int product = 0;

        while( i < list.size() && j < vec.list.size()){
               int idx1 = list.get(i).get(0);
               int num1 = list.get(i).get(1);

               int idx2 = vec.list.get(j).get(0);
               int num2 = vec.list.get(j).get(1);

               if(idx1 == idx2){
                   product += (num1 * num2);
                   i++;
                   j++;
               }else if( idx1 < idx2){
                    i += 1;
               }else {
                    j += 1;
               }
        }
        return  product;
    }

    public static void main(String[] args) {
        int [] nums1 = new int[] {1,0,0,2,3};
        int[] nums2 = new int[]{ 0,3,0,4,0};
        SparseVector v1 = new SparseVector(nums1);
        SparseVector v2 = new SparseVector(nums2);


        System.out.println(v1.dotProduct(v2)); //Output : 8
    }
}
