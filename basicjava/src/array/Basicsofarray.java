package array;

public class Basicsofarray
{
public static void main(String[] args)
{
	//Java Program to demonstrate the way of passing an array  
	//to method.  
	class Testarray2{  
	//creating a method which receives an array as a parameter  
	static void min(int arr[]){  
	int min=arr[0];  
	for(int i=1;i<arr.length;i++)  
	 if(min>arr[i])  
	  min=arr[i];  
	  
	System.out.println(min);  
	}  
	  
	public static void main(String args[]){  
	int a[]={33,3,4,5};//declaring and initializing an array  
	min(a);//passing array to method  
	}}  
}
}
