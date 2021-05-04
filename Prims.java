package ADALab;

public class Prims { 
	public static void main(String[] args) 
	{  
		int graph[][] = new int[][] { { 0, 9, 5, 2, 0}, 
    						{ 9, 0, 0, 6, 5 }, 
    						{ 5, 0, 0, 4, 5 }, 
    						{ 2, 6, 4, 0, 4 },
    						{ 0, 5, 5, 4, 0}};  
        
    	
    	System.out.print("Minimum cost:"+prim(graph));
		
	}
	
    static final int V=5;
	public static int prim(int graph[][]) 
    { 
	int weight[]=new int[V];
	weight[0]=0;
	for(int k=1;k<weight.length;k++)
	{
		weight[k]=Integer.MAX_VALUE;
	}
	int parent[]=new int[V];
	parent[0]=-1;
	for(int k=1;k<weight.length;k++)
	{
		parent[k]=Integer.MAX_VALUE;
	}
	boolean Mst[]=new boolean[V];
    for(int count=1;count<V;count++)
    {
    	int u=-1;
    	int min=Integer.MAX_VALUE;
    	for(int i=0;i<V;i++)
    	{
    		if(!Mst[i] && weight[i]<min)
    		{
    			min=weight[i];
    			u=i;
    		}
    	}
    	Mst[u]=true;
    	for(int j=0;j<V;j++)
    	 {
    		if(!Mst[j] && graph[u][j]!=0 && graph[u][j]<weight[j])
    		{
    			weight[j]=graph[u][j];
    			parent[j]=u;
    		}
    	    	
    	 }
    	   
    	
    }
    
    for(int i=1;i<V;i++)
	{   
	System.out.println((i)+"-->"+parent[i]+"="+ weight[i]);
	}
    int total=0;
	for(int i=0;i<V;i++)
	{   
	total=total+weight[i];
	} 	
	return total;
    }
	 
}
