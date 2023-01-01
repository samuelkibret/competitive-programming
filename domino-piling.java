import java.util.*;
public class sami{
    

 public static void main(String args[]){
     
  	Scanner in = new Scanner(System.in);
		int m = in.nextInt(), n = in.nextInt();
		if (n < 1 || m < 1 || n > 16 || m > 16) {
			in.close();
			return;
		}
		System.out.println((m * n) / 2);
		in.close();
	}
}

