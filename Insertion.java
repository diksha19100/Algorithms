package algorithm;

public class Insertion {
	public static void main(String[] args) 
	{   
		int temp;  
		int arr[]={6,9,3,2,7};
		int j;
		
		for(int i=1;i<arr.length;i++)
		{
		 temp=arr[i];
		 j=i;
		while(j>0 && arr[j-1]>temp)
		{
			arr[j]=arr[j-1];
		    j=j-1;
		}
		arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}