package graphs.shortesdistanceFromSource;
/*

This is used to detect cycles with -ve weights we relax the weights, 0 ->  N-1 times, if we relax further and values
continue to decrease then there is a cycle
- If No cylce the values could have stoped at N-1


Example :

Given a weighted and directed graph of V vertices and E edges, Find the shortest distance of all the vertex's from the
source vertex S. If a vertices can't be reach from the S then mark the distance as 10^8. Note: If the Graph contains a negative cycle then return an array consisting of only -1.

E.g [[0,1,5],[1,0,3],[1,2,-1],[2,0,1]]

 */

import java.util.*;
public class BellmanFordAlgorithm {
    public static void main(String[] args) {
        int[][] matrix = { {0,1,5}, {1,0,3},{1,2,-1},{2,0,1}};
        List<List<Integer>>adj = new ArrayList<>();
        for(int[] edge : matrix){
            adj.add( Arrays.asList(edge[0], edge[1],edge[2]));
        }
        int[] ans = bellmanFord(adj.size() -1,adj, 2);
        System.out.println(Arrays.toString(ans));
    }

    static  int [] bellmanFord(int V, List<List<Integer>>edges, int source){
         int[] distance =  new int[V];

         int infinity = (int) Math.pow(10, 9);

         //Update the distance with infinity values
        Arrays.fill(distance, infinity);

        //Initialize source to dist 0
        distance[source] = 0;

        for(int  vertex = 0; vertex < V; vertex++){
            //Go through each adjacent neighbors of vertex
            for(List<Integer>neighbor : edges){
                int u = neighbor.get(0); // source
                int v = neighbor.get(1); // destination
                int weight = neighbor.get(2);

                //Relax edges if the  current distance is less
                if(distance[u] != infinity &&
                        (distance[u] + weight) < distance[v]){
                     distance[v] =  distance[u] + weight;
                }
            }
        }

        //Negative relaxation to check negative cycle
        for(List<Integer>neighbor :edges){
             int u = neighbor.get(0);
             int v = neighbor.get(1);
             int weight = neighbor.get(2);

             if(distance[u] != infinity && (distance[u] + weight) < distance[v]){
                  return new int[]{-1};
             }
        }
        return distance;

    }
}
