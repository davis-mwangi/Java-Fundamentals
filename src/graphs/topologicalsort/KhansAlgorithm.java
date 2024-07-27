package graphs.topologicalsort;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class KhansAlgorithm {
    static int[] topologicalSort(int V, List<List<Integer>>adj){
        //InDegree
        int[] inDegree = new int[V];

        //Populate the indegree
        for(int v = 0; v < V; v++){
            for(int neigh : adj.get(v)) {
                inDegree[neigh]++;
            }
        }
        Deque<Integer>deque = new LinkedList<>();
        //Add all items with zero inDegree
        for(int v = 0; v < V; v++){
            deque.add(v);
        }
        int [] topologicallySorted = new int[V];
        int i = 0;
        while( !deque.isEmpty()){
              int node =  deque.poll();
              topologicallySorted[i++]=node;

              //Reduce the inDegree of its neighbors
              for(int neigh :  adj.get(node)){
                  inDegree[neigh] --;

                  //If IneDegree , becomes zero, then we add it back to Queue
                  if(inDegree[neigh] == 0){
                      deque.add(neigh);
                  }
              }
        }
        return topologicallySorted;


    }
}
