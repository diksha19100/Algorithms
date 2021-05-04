package ADALab;
import java.util.*;
public class MergeSortL{

	
	public static void main(String[] args) {
		int arr1[]= new int[100000];
		int arr2[]= new int[100000];
		int arr3[]= new int[100000];
		int arr4[]= new int[100000];
		int l=0;
		int r=arr1.length-1;
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
			arr4[i]=1;
		}
		long start1 = System.currentTimeMillis(); 
		sort(arr1,l,r);
        long end1 = System.currentTimeMillis(); 
        System.out.println("MergeSort takes " + (end1 - start1) + "ms");
        
		long start2 = System.currentTimeMillis(); 
		sort(arr2,l,r);
        long end2 = System.currentTimeMillis(); 
        System.out.println("MergeSort takes " + (end2 - start2) + "ms");
        
		long start3 = System.currentTimeMillis(); 
		sort(arr3,l,r);
        long end3 = System.currentTimeMillis(); 
        System.out.println("MergeSort takes " + (end3 - start3) + "ms");
        
		long start4 = System.currentTimeMillis(); 
		sort(arr4,l,r);
        long end4 = System.currentTimeMillis(); 
        System.out.println("MergeSort takes " + (end4 - start4) + "ms");
        
	}
		public static void sort(int arr[],int l,int r)
		{
			if(l<r)
			{
				int m=l+(r-l)/2;
				sort(arr,l,m);
				sort(arr,m+1,r);
				merge(arr,l,m,r);
			}
		}

		public static void merge(int arr[],int l,int m,int r)
		{
			int n1=m-l+1;
			int n2=r-m;
			int left[]=new int[n1];
			int right[]=new int[n2];
			for(int i=0;i<n1;i++)
			{
				left[i]=arr[l+i];
			}
			for(int i=0;i<n2;i++)
			{
				right[i]=arr[m+1+i];
			}
			int k=l;
			int i=0;
			int j=0;
			while(n1>i && n2>j)
			{
				if(left[i]>right[j])
				{
					arr[k]=right[j];
					j++;
				}
				else
				{
					arr[k]=left[i];
					i++;
				}
				k++;
			}
			while(i<n1)
			{
				arr[k]=left[i];
				i++;
				k++;
			}
			while(j<n2)
			{
				arr[k]=right[j];
				j++;
				k++;
			}
			
		}
		

}