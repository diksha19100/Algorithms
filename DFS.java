package ADALab;
import java.util.*;
public class DFS {
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>(5);
		for(int i=0;i<5;i++)
		{
			arr.add(new ArrayList<Integer>());
		}
		addEdge(arr,0,1);
		addEdge(arr,0,2);
		addEdge(arr,1,3);
		addEdge(arr,1,4);
		addEdge(arr,2,3);
		addEdge(arr,3,4);
		boolean[] visited = new boolean[5];
		depth(arr,0,visited);		
	}
	public static void addEdge(ArrayList<ArrayList<Integer>> arr,int x,int y)
	{
		arr.get(x).add(y);
		arr.get(y).add(x);
	}
	public static void depth(ArrayList<ArrayList<Integer>> arr,int s,boolean[] visited)
	{
		visited[s]=true;
		System.out.println(s);
		for(int i:arr.get(s))
		{
			if(visited[i]==false)
			{
				visited[s]=true;
				depth(arr,i,visited);
			}
		}
		
	}

}