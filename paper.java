package test;
import java.util.*;
import java.io.*;

public class paper {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		float a[][]=new float[5][7];         //2-D array to store the values 
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;j++)
			{
				a[i][j]=in.nextFloat();     //taking input
			}
		}
		float toi=0,hindu=0,et=0,bm=0,ht=0;  //5 variables to store the total sum of respective papers
		for(int j=0;j<7;j++)
			toi+=a[0][j];
		for(int j=0;j<7;j++)
			hindu+=a[1][j];
		for(int j=0;j<7;j++)
			et+=a[2][j];
		for(int j=0;j<7;j++)
			bm+=a[3][j];
		for(int j=0;j<7;j++)
			ht+=a[4][j];
		
		float[] arr1=new float[5];    //array to store total sum of respective papers
		arr1[0]=toi;
		arr1[1]=hindu;
		arr1[2]=et;
		arr1[3]=bm;
		arr1[4]=ht;
		String[] arr2= {"TOI","HINDU","ET","BM","HT"};  //String typed array to store the name of paper
		int budget=in.nextInt();                        //users total monthly budget
		System.out.println(answer(arr1,arr2,budget));
	}
	
	
	static List answer(float[] arr1,String[] arr2,int budget)     //method to calculate the final result
	{
		ArrayList<ArrayList<String> > x = new ArrayList<ArrayList<String> >();  ///nested List
		
		for(int i=0;i<4;i++)
		{
			ArrayList<String> ar=new ArrayList<>();
			float num=budget-arr1[i];
			for(int j=i+1;j<5;j++)
			{
				if(num>=arr1[j])
				{
					ar.add(arr2[j]);
					num=num-arr1[j];
				}
			}
			ar.add(arr2[i]);
			x.add(ar);
		}
		return x;
	}
	
}
