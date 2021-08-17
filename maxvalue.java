import java.util.Scanner;

public class maxvalue {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=10,max=0,c=0;
		int Arr[]=new int[n];
		System.out.println("Enter 10 elements of array : ");
		for(int i=0;i<n;i++){
			Arr[i]=sc.nextInt();
			if(Arr[i]>max){
				max=Arr[i];c=0;
			}
			if(Arr[i]==max)
				c++;
		}
		System.out.print(c);
	}
}