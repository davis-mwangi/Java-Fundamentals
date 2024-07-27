package challenges;


import java.util.HashMap;
import java.util.Map;

/*

|__|__|__|
There is an array A of N integers and three tiles. Each tile can cover two neighbouring numbers from
the array but cannot intersect with another tile. It also cannot be placed outside the array, even partially.
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the maximum sum of numbers that can be covered using at most three tiles.
Examples:
1. Given A = [2, 3, 5, 2, 3, 4, 6, 4, 1], the function should return 25. There is only one optimal placemen
of tiles: (3, 5), (3, 4), (6,4).
2. Given A = [1, 5, 3, 2, 6, 6, 10, 4, 7, 2, 1], the function should return 35. One of the three optimal
placements of tiles is (5, 3), (6, 10), (4, 7).
3. Given A = [1, 2, 3, 3, 2 ], the function should return 10. There is one optimal placement of tiles: (2, 3
(3,2). Only two tiles can be used because A is too small to contain another one.
4. Given A = [5, 10, 3], the function should return 15. Only one tile can be used.
Write an efficient algorithm for the following assumptions:
• N is an integer within the range [2.100,000];
• each element of array A is an integer within the range [0...1,000,000].


Group should have at least two numbers
[2, (3, 5), 2, (3, 4), (6, 4), 1]

[1, (5, 3), 2, 6, (6, 10), (4, 7), 2, 1]

[1, (2, 3), (3, 2)]

Rules


Groups should of size 2
Groups should not exceed 3 since the tiles are only three
Groups are ordered


[2, 3, 5, 2, 3, 4, 6, 4, 1]
[_  _  _]
 */
public class MaxPairSum {

    public static void main(String[] args) {
        System.out.println(maxPairSum(new int[]{2, 3, 5, 2, 3, 4, 6, 4, 1}));
    }

    public static int maxPairSum(int[] A) {
        int n = A.length;
        int maxSum = 0;

        // Case when there is only one tile available
        if (n <= 2) {
            for (int num : A) {
                maxSum += num;
            }
            return maxSum;
        }

        // Case when there are two or more tiles available
        // Initialize two pointers for the sliding window
        int left = 0, right = 2;
        int currentSum = A[0] + A[1];
        maxSum = currentSum;

        // Slide the window and update maxSum
        while (right < n) {
            currentSum += A[right];  // Extend the window to the right
            currentSum -= A[left];   // Shrink the window from the left
            maxSum = Math.max(maxSum, currentSum);
            left++;
            right++;
        }

        return maxSum;
    }

}
