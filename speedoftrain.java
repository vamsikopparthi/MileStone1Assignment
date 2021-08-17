import java.util.Scanner;

public class speedoftrain {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int train_len,man_speed,time;
		System.out.print("Enter the train length : ");
		train_len = sc.nextInt();
		System.out.print("Enter the man speed in km/hr : ");
		man_speed = sc.nextInt();
		System.out.print("Enter the time in seconds : ");
		time = sc.nextInt();
		int relative_train_speed = ((train_len*18)/(time*5));
		int train_speed = relative_train_speed + man_speed;
		System.out.print("The speed of train in km/hr is : "+train_speed);
	}
}