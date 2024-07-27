package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class DetectCycleBFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            DetectCycleBFS obj = new DetectCycleBFS();
            boolean ans = obj.isCycle(V, adj);
            System.out.println("ANS " + ans);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }

    }

    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];//By default is false
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycle(i, V, adj, visited)) {
                    return true;
                }
            }
        }
        return false;
    }


    private boolean detectCycle(int source, int V, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        //Mark as visited
        visited[source] = true;
        Deque<Integer[]> deque = new LinkedList<>();
        deque.add(new Integer[]{source, -1}); //[node, source]

        while (!deque.isEmpty()) {
            //  int size = deque.size();

            //  for(int i = 0; i < size; i++){

            Integer[] pair = deque.poll();
            int node = pair[0];
            int parent = pair[1];

            for (Integer neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    deque.add(new Integer[]{neighbor, node});
                } else if (neighbor != parent) {//If the neighbor is not the source, then there must be a cycle on the graph
                    return true;

                }
            }

            //  }
        }
        return false; //No Cycle
    }
}
