import java.util.Arrays;

public class perfectsquare {
	public static void main(String args[]){
		int d=21,e=36,f=66,ans=1;
		lcm l=new lcm();
		int abc=l.findlcm(d,e,f);
		int arr[]=new int[d];Arrays.fill(arr, 0);
		int num=d;int lcm=abc;
		for(int i=2;i<d&&d>1;i++){
			while((abc%i)==0){
		    arr[i]++;abc/=i;
			}
		}
		for(int i=2;i<num;i++){
			if(arr[i]%2!=0)
				ans*=i;
		}
		System.out.println("The least perfect square number the is divisible by 21,36,66 is: "+ans*lcm);
	}
}
class lcm{
	int gcd(int d, int e)
	{
	    if (e == 0)
	        return d;
	    return gcd(e, d % e);
	}
	int findlcm(int d, int e,int f)
	{
	    int ans = d;
	    ans = ((e * ans) /gcd(e, ans));
	    ans = ((f* ans) /gcd(f, ans));
	    return ans;
	}
	 
}