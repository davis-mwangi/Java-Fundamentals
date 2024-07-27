package challenges;

import java.util.Arrays;

public class ClientAndPackages {
    public static void main(String[] args) {
//        System.out.println(solution(new int[]{3, 2, 4, 5, 1}));
//        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(solution(new int[]{3, 2, 7, 4, 5, 6, 1}));

        System.out.println(Integer.toBinaryString(529));
    }
//     0  1  2  3  4  5  6
//    [1, 2, 3, 4, 5, 6, 7]
//    s = 1
    public static int solution(int [] packages){
        int N = packages.length;
        int swapCount = 0;
        for(int i = 0; i < N; ){
            int pkg = packages[i];
            int clientPkg = pkg - 1;

            //Check if packages matches the client
            if(i == clientPkg){
                i++; //Mark it removed
            }else{
              //Swapping
                int temp = packages[clientPkg];
                packages[clientPkg] = packages[i];
                packages[i]=  temp;
                swapCount += 1;
            }
        }
        System.out.println(Arrays.toString(packages));
        return swapCount;
    }
}
