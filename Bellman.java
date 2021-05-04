package ADALab;
import java.util.ArrayList;
public class Bellman {
public static void main(String[]args)
{   
	int dist[]=new int[4];
	ArrayList<ArrayList <Integer>>arr= new ArrayList<ArrayList <Integer>>(5);
	for(int i=0;i<5;i++)
	{
		arr.add(new ArrayList<Integer>());
	}
	arr.get(0).add(1);
	arr.get(0).add(2);
	arr.get(0).add(-3);
	arr.get(1).add(1);
	arr.get(1).add(3);
	arr.get(1).add(2);
	arr.get(2).add(2);
	arr.get(2).add(3);
	arr.get(2).add(3);
	arr.get(3).add(0);
	arr.get(3).add(1);
	arr.get(3).add(1);
	arr.get(4).add(0);
	arr.get(4).add(2);
	arr.get(4).add(4);
	
	for(int i=0;i<dist.length;i++)
	{
		dist[i]=Integer.MAX_VALUE;
	}
	dist[0]=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<5;j++)
		{
			int src=arr.get(j).get(0);
			int finalD=arr.get(j).get(1);
			int weight=arr.get(j).get(2);
			if(dist[src]!=Integer.MAX_VALUE && dist[src]+weight<dist[finalD])
			{
				dist[finalD]=dist[src]+weight;
			}
		}
	}
	System.out.println("Distance is:");
	for(int k=0;k<4;k++)
	{
		System.out.println("0 -->" + k + "=" + dist[k]);
	}

	
}
}
