package package1;

import java.util.Scanner;

public class IfElseLadderStatement {
	
	static int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of i");
		i = sc.nextInt();
		if (i<5) {
			System.out.println("The value of i(" + i +") is less than 5 ");
		}else if (i == 5) {
			System.out.println("The value of i(" + i +") is greater than or euqls to 5 \"");
		}else
			System.out.println("The value of i is "+ i);

	}

}
