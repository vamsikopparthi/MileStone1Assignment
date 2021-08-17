import java.util.Scanner;

public class trainlength {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int train_speed, time,train_length;
		System.out.print("Enter the train speed in km/hr : ");
		train_speed=sc.nextInt();
		System.out.print("\nEnter the time in seconds : ");
		time=sc.nextInt();
		train_length = (train_speed * 1000 * time)/3600;
		System.out.print("The length of train is : "+train_length+ "m");
	}
}