package graphs.shortesdistanceFromSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/*
This is used to detect cycles with +ve weights ONLY.
 - Find minimum shortest path from the source

        - If No cylce the values could have stoped at N-1

*/
public class DijsktraAlgorithm {
    public static void main(String[] args) {
//        int[][] matrix = { {{1, 1}, {2, 6}},
//                           {{2, 3}, {0, 1}},
//                           {{1, 3}, {0, 6}}};

//        List<List<Integer>>adj = new ArrayList<>();
//        for(int[] edge : matrix){
//            adj.add( Arrays.asList(edge[0], edge[1],edge[2]));
//        }
//        int[] ans = dijkstra(adj.size() -1,adj, 2);
//        System.out.println(Arrays.toString(ans));
    }

    static  int [] dijkstra (int V, List<List<Integer>>edges, int source){

        //We Use Priority Queue
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);//Min Heap, by distance

        int infinity = (int) Math.pow(10,2);

        int [] distance = new int[V];

        Arrays.fill(distance, infinity);

        //At source,  the distance will be 0
        distance[source] = 0;
        pq.add( new int[] { 0, source} ); //{distance, edge}

        while(!pq.isEmpty()){
             int [] edge = pq.poll();
             int dist = edge[0];
             int u = edge[1];

             for(int i = 0; i < edges.get(u).size(); i++ ){
                  int v = edges.get(u).get(0);
                  int edgeWeight = edges.get(u).get(1);

                  //Check if the distance + edge weight is less than current edge distance from u
                 if((dist + edgeWeight) < distance[v]){
                       //Update the vertex v with new distance
                     distance[v] = dist + edgeWeight;
                     pq.add(new int[]{distance[v], v});
                 }
             }
        }
        return distance;
    }
}
