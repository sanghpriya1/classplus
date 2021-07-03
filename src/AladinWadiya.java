import java.util.ArrayList;
import java.util.Scanner;

public class AladinWadiya {
    private static void addEdge(ArrayList<ArrayList<Integer> > graph,
                        int u, int v)
    {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[h];
        for(int i = 0; i< h; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i =0; i < n; i++){
            graph.add(new ArrayList<Integer>());
        }
        for (int i =0; i < n-1; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(graph, u, v);
        }
        sc.close();
    }


}
