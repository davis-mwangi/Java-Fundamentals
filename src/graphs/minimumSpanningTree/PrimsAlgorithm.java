package graphs.minimumSpanningTree;

import java.util.List;
import java.util.PriorityQueue;

/*

Given a weighted, undirected, and connected graph with V vertices and E edges, your task is to find the sum of the
weights of the edges in the Minimum Spanning Tree (MST) of the graph.
The graph is represented by an adjacency list, where each element adj[i] is a vector containing pairs of integers.
Each pair represents an edge, with the first integer denoting the endpoint of the edge and the second integer
 denoting the weight of the edge.

 Example :  [ [0,1,5], [1,2,3], [0,2,1] ]
*
 */
public class PrimsAlgorithm {
    static  int spanningTree(int V, int E, List<List<int[]>>adj){

        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b) -> a[0] -b[0]); // {weight, node, parent}
        int [] visited = new int[V];
        int sum = 0;
        pq.add(new int [] {0, 0, -1});

        while(!pq.isEmpty()){
              int [] tuple = pq.poll();
              int wt = tuple[0];
              int node =tuple[1];
              int parent = tuple[2];

              //If node is already visited, ignore and move on
              if(visited[node] == 1){
                  continue;
              }

              //Mark node ad visited
             visited[node] = 1;
              sum += wt;

              for (int[] edge : adj.get(node)){
                  int  neighNode = edge[0];
                  int neighWt = edge[1];

                  if(visited[neighNode] == 0){
                      pq.add(new int[] {neighWt, neighNode, parent});
                  }
              }
        }
        return  sum;

    }
}
