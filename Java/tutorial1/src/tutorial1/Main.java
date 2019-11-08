package tutorial1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive 
		int spam_yum = 9;
		double num2 = 5.0;
		boolean b = true;
		char c = '7';
		//not primitive
		String str = "tim_*";
		
		System.out.println(spam_yum);
		System.out.println(spam_yum + 4);
		System.out.println(c/num2);
		
		//operators 
		int x = 5;
		int y = 7;
		int z = 56;
		int u = z/y;
		double s = 72;
		double t = s/x;
		int sum = x + y + z;
		int mut = x * y * z;
		int sub = x + y - z;
		double d = Math.pow(x, y);
		
		System.out.println(sum);
		System.out.println(mut);
		System.out.println(sub);
		System.out.println(u);
		System.out.println(t);
		System.out.println(d);
		
		//type casting changing the declared variable in line
		int f = 3;
		int e = 8;
		double i = f / (double)e; 
		System.out.println(i);
		
		//remainder give you the division of an operation 
		int q = 56 % 5; // 11 r 1
		
		System.out.println(q);
		
		//Input
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();
		int p = Integer.parseInt(scanned);
		
		System.out.println(p);
	}

}
