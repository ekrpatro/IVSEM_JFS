import java.util.*;

class SinkNodes_Dynamic 
{

    public static int countSinkNodes(int V, List<List<Integer>> adj) 
	{
		
        int[] outdegree = new int[V];

        // calculate outdegree
        for (int i = 0; i < V; i++) 
		{
            outdegree[i] = adj.get(i).size();
        }

        int count = 0;

        // count sink nodes
        for (int i = 0; i < V; i++) 
		{
            if (outdegree[i] == 0) 
			{
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
	{

        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // directed edges
        adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(0).add(4);
        adj.get(1).add(3);
        adj.get(2).add(4);
		adj.get(2).add(3);
		

        System.out.println(countSinkNodes(V, adj));
    }
}
