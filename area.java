import java.util.Scanner;

public class area {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int diff_lb = 23;
	    int peri = 206;
	    int sum_lb = peri/2;
	    int len=(diff_lb+sum_lb)/2;
	    int bre=sum_lb-len;
	    int area=len*bre;
	    System.out.print("The area of rectangle is : "+area);
	}
}