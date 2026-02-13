class CountEdges
{
	public static void main(String args[])
	{
		int adj_matrix[][]={ {0,1,0,1,0},{1,0,1,1,0},{0,1,0,0,1},{1,1,0,0,1},
																{0,0,1,1,0}	};
		int one_ctr=0;
		for(int i=0; i < adj_matrix.length; i++)
		{
			for(int j=0; j < adj_matrix.length; j++)
			{
				if(adj_matrix[i][j]==1)
					one_ctr++;
			}
		}
		System.out.println("No of edges in the graph = "+(one_ctr/2));
	System.out.println("No of vertices in the graph = "+(adj_matrix.length));
	}
	
}
/*
	{0,1,0,1,0},
	{1,0,1,1,0},
	{0,1,0,0,1},
	{1,1,0,0,1},
	{0,0,1,1,0}	
																
*/