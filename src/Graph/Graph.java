package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
//    Vertex -> [ neb , cost]
    private HashMap<Integer , HashMap<Integer , Integer>> graph;

    public Graph(int n){
        this.graph = new HashMap<>();
        for (int i = 1 ; i <= n ; i++){
            this.graph.put(i , new HashMap<>());
        }
    }

    public void addEdge(int v1 , int v2){
        this.graph.get(v1).put(v2 , -1);
        this.graph.get(v2).put(v1 , -1);
    }

    public void removeEdge(int v1 , int v2){
        if(this.graph.get(v1).containsKey(v2)){
            this.graph.get(v1).remove(v2);
        }

        if(this.graph.get(v2).containsKey(v1)){
            this.graph.get(v2).remove(v1);
        }
    }

    public boolean isNeighbour(int v1 , int v2){
        return this.graph.get(v1).containsKey(v2);
    }

    public void print(){
        for (int vertex : this.graph.keySet()){
            HashMap<Integer , Integer> neighbour = this.graph.get(vertex);
            for (int nbrs : neighbour.keySet()){
                System.out.println(vertex + " -> " + nbrs + " | cost -> " + this.graph.get(vertex).get(nbrs));
            }
        }
    }

    public boolean hasPath(int v1 , int v2){
        HashSet<Integer> visited = new HashSet<>();
        return hasPath(v1 , v2 , visited);
    }

    private boolean hasPath(int curr , int des , HashSet<Integer> visited){
        if(curr == des){
            return true;
        }

        visited.add(curr);
        HashMap<Integer , Integer> nbrs  = this.graph.get(curr);
        boolean doesExisist = false;
        for(int nbr : nbrs.keySet()){
            if(!visited.contains(nbr)){
                doesExisist = hasPath(nbr , des , visited);
                if(doesExisist){
                    break;
                }
            }
        }
//        backtrack
        visited.remove(curr);

        return doesExisist;
    }

    public void BFS(){
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(1);
        while (!queue.isEmpty()){
//            remove
            int curr = queue.remove();

//            skip
            if(visited.contains(curr)){
                continue;
            }

            System.out.println(curr + " -> ");
//            mark visited
            visited.add(curr);

            HashMap<Integer , Integer> nbrs = this.graph.get(curr);
            for (int nbr : nbrs.keySet()){
                if(!visited.contains(nbr)){
                    queue.add(nbr);
                }
            }
        }
    }

    public void BFT(){
        int cycle = 0;
        HashSet<Integer> visited = new HashSet<>();
        for(int src : this.graph.keySet()){
            if(visited.contains(src)){
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(src);
            while (!queue.isEmpty()){
//            remove
                int curr = queue.remove();

//            skip
                if(visited.contains(curr)){
                    cycle++;
                    continue;
                }

                System.out.println(curr + " -> ");
//            mark visited
                visited.add(curr);

                HashMap<Integer , Integer> nbrs = this.graph.get(curr);
                for (int nbr : nbrs.keySet()){
                    if(!visited.contains(nbr)){
                        queue.add(nbr);
                    }
                }
            }
        }


    }
}
