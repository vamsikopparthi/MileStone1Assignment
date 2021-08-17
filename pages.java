import java.io.*;
public class pages {
    public static void main(String args[])
    {
	    int r=32,k=40,h1=6,h2=5;
	    float ra=r/(float)h1;
	    float ka=k/(float)h2;
        float c=(ra+ka);
	    float t=110/c;
	    int hr=(int)t;int mins = (int)((t-hr)*100);
	    System.out.println("The time taken by both to complete 110 pages is : "+hr+" hours "+mins+" minutes");
	
    }
}