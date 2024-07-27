package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DeleteLetters {
    /***
     BANANA = >  { B : 1, A: 3, N :  2}

    NAABXXAN -> XX   return 1

     NAANAAXNABABYNNBZ -> NAAXNABYNBZ -> XBYNZ

     { N: 5, A: 6, X: 1, B: 3 ,Y: 1,  Z: 1}

     N : 2
     A : 3
     X :

     */

    public static void main(String[] args) {
        System.out.println(solution("NAABXXAN"));
        System.out.println(solution("NAANAAXNABABYNNBZ"));
        System.out.println(solution("QABAAAWOBL"));

        Map<int[], Set<Integer>>map = new HashMap<>();
    }

    public static  int solution(String S){
         //Create a  map  of Banana  {Char:  Frequency}
         String small = "BANANA";

         Map<Character, Integer>bananaFreq =  new HashMap<>();
         for(int i = 0; i < small.length(); i++){
              char ch =  small.charAt(i);
              bananaFreq.put( ch,  bananaFreq.getOrDefault(ch, 0) + 1);
         }

         Map<Character, Integer>SMap =  new HashMap<>();
         for(int i = 0;  i < S.length(); i++){
             char ch  = S.charAt(i);
             SMap.put(ch, SMap.getOrDefault(ch, 0) + 1);
         }

         int minRatio = (int) Math.pow(10, 9);
         for(Character ch :  bananaFreq.keySet()){
              int ratio = SMap.getOrDefault(ch, 0) / bananaFreq.getOrDefault(ch, 0);
              minRatio = Math.min(ratio, minRatio);
         }
         return minRatio;
    }
}
