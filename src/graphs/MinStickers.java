package graphs;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MinStickers {

    static class Sticker{
        int[] hash; // [1,0,1,4,0,0]
        Sticker(String stickerStr){
            //Convert string to a hash of 26 characters
             hash = new int[26];
             for(char ch : stickerStr.toCharArray()){
                 hash[ch - 'a'] ++;
             }
        }
    }

    public int minStickers(String[] stickers, String target) {
         //Add stickers to a hash set
         Set<Sticker> stickerSet = new HashSet<>();
         for(String stickerStr : stickers){
              stickerSet.add(new Sticker(stickerStr));
         }
       //Add sticker to Queue for prcessimg
        Deque<String> deque = new LinkedList<>();
         deque.add(target);// thehat

        //Track Visited
        Set<String>visited = new HashSet<>();
        visited.add(target); //thehat
        int steps = 0;
        //Process the Deque
        while(!deque.isEmpty()){
            int size =  deque.size();
            for(int i = 0;  i < size; i++){
                String curr = deque.pollFirst();
                //Try all stickers,
                for(Sticker sticker: stickerSet){
                    //Match sticker and target
                    StringBuilder sb = new StringBuilder();
                    int [] targetHash = new int[26];
                    for (char ch: curr.toCharArray()){
                        int idx = ch - 'a';
                        if(sticker.hash[idx] > targetHash[idx]){
                            targetHash[idx]++;
                        }else{
                            sb.append(ch);
                        }
                    }
                    String remaining = sb.toString();
                    if(remaining.length() == 0){
                        return steps;
                    }
                    if(!visited.contains(remaining)){
                        deque.addFirst(remaining);
                        visited.add(remaining);
                    }
                }
            }
            steps += 1;
        }
        return  -1;

    }
}
