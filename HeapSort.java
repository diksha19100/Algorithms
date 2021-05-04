package ADALab;

public class HeapSort {
	public static void main(String[] args)
	{
		int[] arr = {2,14,8,23,56,3,10,15};
		int n=arr.length;
		heapSort1(arr,n);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void heapSort1(int[] arr,int n)
	{
		buildHeap(arr,n);
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			maxHeap(arr,i,0);
		}
				
	}
	public static void buildHeap(int[] arr,int n)
	{
	   for(int i=(n-2)/2;i>=0;i--)
	   {
		   maxHeap(arr,n,i);
	   }
	}
	public static void maxHeap(int[] arr,int n,int i)
	{
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && arr[left]>arr[largest])
			largest=left;
		if(right<n && arr[right]>arr[largest])
			largest=right;
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			maxHeap(arr,n,largest);
		}
	}

}
