package algorithm;

import java.util.Random;

public class QuickSort1 {
	static int count=0;
	public static void main(String[]args)
	{   
		
		int arr1[]= new int[1000];
		int arr2[]= new int[1000];
		int arr3[]= new int[1000];
		int arr4[]= new int[1000];
		int l=0;
		int h=arr1.length-1;
		Random rand = new Random();
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=rand.nextInt(1000);
		}
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=i+100;
		}
		int j=0;
		for(int i=arr3.length;i>0;i--)
		{
			arr3[j]=i;
			j++;
		}
		for(int i=0;i<=arr4.length-1;i++)
		{
			arr4[i]=100;
		}
		long start1 = System.currentTimeMillis(); 
		count=0;
		sort(arr1,l,h);
		
		System.out.println(count);
        long end1 = System.currentTimeMillis(); 
        System.out.println("QuickSort random takes " + (end1 - start1) + "ms");
        
		long start2 = System.currentTimeMillis(); 
		count=0;
		sort(arr2,l,h);
		System.out.println(count);
        long end2 = System.currentTimeMillis(); 
        System.out.println("QuickSort ascending takes " + (end2 - start2) + "ms");
        
		long start3 = System.currentTimeMillis(); 
		count=0;
		sort(arr3,l,h);
		System.out.println(count);
        long end3 = System.currentTimeMillis(); 
        System.out.println("QuickSort descending takes " + (end3 - start3) + "ms");
        
		long start4 = System.currentTimeMillis(); 
		count=0;
		sort(arr4,l,h);
		System.out.println(count);
        long end4 = System.currentTimeMillis(); 
        System.out.println("QuickSort for same input takes " + (end4 - start4) + "ms");
        
	}
	public static void sort(int arr[],int l,int h)
	{
		if(l<h)
		{
			int p=partition(arr,l,h);
			sort(arr,l,p-1);
			sort(arr,p+1,h);
		}
		count++;
	}
	public static int partition(int arr[],int l,int h)
	{
		int pivot=arr[h];
		int i=l-1;
		
		for(int j=l;j<h;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[h];
		arr[h]=arr[i+1];
		arr[i+1]=temp;
		
		return i+1;
	}

}
