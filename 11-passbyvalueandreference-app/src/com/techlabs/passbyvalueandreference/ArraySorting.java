package com.techlabs.passbyvalueandreference;

public class ArraySorting {

	public static void main(String[] args) {
		int array[]= {3,5,4,6,8};
		System.out.println("Array Before sorting:");
		display(array);
		sort(array);
		System.out.println("Array after sorting:");
		display(array);

	}
	public static void display(int array[])
	{
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+"\t");
		System.out.println("");
	}
	public static void sort(int array[])
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
