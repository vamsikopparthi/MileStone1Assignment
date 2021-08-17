import java.io.*;
import java.util.Scanner;
public class maxnum {

	public static void main(String[] args) {
		int i,n=25;
		Scanner sc=new Scanner(System.in);
		int arr[];   
		arr = new int[n];
				for(i=0;i<n;i++)
				{
				arr[i]=sc.nextInt();	
				}
		   int max = arr[0];
		        for (i = 1; i < n; i++){
		            if (arr[i] > max)
		                max = arr[i];
		       
			}
		System.out.println(max);
		}
		

	}