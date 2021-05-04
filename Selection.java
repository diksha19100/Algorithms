package algorithm;

public class Selection {
 public static void main(String[]args)
 {
	 int min;
	 String temp;
	 String arr[]= {"Diksha","Deepak","Ayush","Yash","Bunty"};
	 for(int i=0;i<arr.length;i++)     
	 {
		 min=i;                         
		 for(int j=i+1;j<arr.length;j++)
		 {   char A=arr[j].charAt(0);
		     char B=arr[min].charAt(0);
		     int C=A;
		     int D=B;
			 if(C<D)    
			 {
				 min=j;            
			 }
			 if(C==D)
			 {
				 char E=arr[j].charAt(1);
			     char F=arr[min].charAt(1);
			     int G=E;
			     int H=F; 
			     if(G<H)    
				 {
					 min=j;            
				 }
			 }
		 }
		 temp=arr[i];          
		 arr[i]=arr[min];      
		 arr[min]=temp;       
			 
	 }
	 for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	 
 }
}
