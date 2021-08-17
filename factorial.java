import java.io.*;
		import java.util.Scanner;
		public class factorial {

			public static void main(String[] args) {
				int N,f=1;
				Scanner sc=new Scanner(System.in);
				N=sc.nextInt();
				for(int i=1;i<=N;i++)
				{
					f=f*i;
				}
				System.out.println(f);

			}
		}