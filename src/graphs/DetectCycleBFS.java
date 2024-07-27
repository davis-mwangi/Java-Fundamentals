package graphs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class DetectCycle {

    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        //Detect cycle for unconnected graph

         boolean[] visited = new boolean[V];//By default is false
         for(int i = 0; i < V; i++){
             if(!visited[i]){
                 detectCycle()
             }
         }
    }
    private boolean detectCycle(int source, int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        //Mark as visited
        visited[source] = true;
        Deque<Integer[]>deque = new LinkedList<>();
        deque.add(new Integer[]{node, -1}); //[node, source]
        while(!deque.isEmpty()){
             int size = deque.size();
             for(int i = 0; i < size; i++){

                 Integer[] pair = deque.poll();
                 if(pair != null) {
                     for (Integer neighbor : adj.get(node)) {
                         if (!visited[neighbor]) {
                             visited[neighbor] = true;
                             deque.add(new Integer[]{neighbor, pair[0]});
                         } else {//If the neighbor is not the source, then there must be a cycle on the graph
                             return true;

                         }
                     }
                 }
             }
        }
        return false; //No Cycle
    }
}
