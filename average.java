import java.io.*;
import java.util.Scanner;
public class average {
public static void main(String[] args) {
int i,sum=0,n;
float avg;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 numbers to find the average:");
for(i=0;i<10;i++)
{
n=sc.nextInt();
sum=sum+n;
}
avg=sum/(float)10;
System.out.println("The average of 10 number "+"is "+avg);
}
}