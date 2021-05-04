package ADALab;

public class JobSequence {
	public static void main(String[]args)
	{
		int profit[]= {20,15,10,5,1};
		int deadline[]= {2,2,1,3,3};  
		int k=-1;
		System.out.println("Profit:");
		for(int i=0;i<profit.length;i++)
		{
			System.out.print(profit[i]+" ");
		}
		System.out.println("");
		System.out.println("Deadlines:");
		for(int i=0;i<deadline.length;i++)
		{
			System.out.print(deadline[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<deadline.length;i++)
		{
			if(deadline[i]>k)
			{
				k=deadline[i];
			}
		}
		int slot[]= new int[k];
		for(int i=0;i<slot.length;i++)
		{
			slot[i]=-1;
		}
		for(int i=0;i<deadline.length;i++)
		{
			for(int j=deadline[i]-1;j>=0;j--)
			{
				if(slot[j]==-1)
				{
					slot[j]=i;
					break;
				}
				
			}
			
		}
		System.out.println("After allotment:");
		for(int i=0;i<slot.length;i++)
		{
			System.out.print(slot[i]+"-->");
			System.out.print(profit[slot[i]]+" ");
		}
		System.out.println(" ");
		int totalSum=0;
		for(int i=0;i<slot.length;i++)
		{
			totalSum=totalSum+profit[slot[i]];
		}
		System.out.println("Maximum Profit obtained:"+totalSum);
		
		
		
		
		
		
	}

}
