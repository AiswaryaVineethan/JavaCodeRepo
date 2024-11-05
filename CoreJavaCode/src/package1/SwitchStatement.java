package package1;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void gradeRemark() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student grade");
		char grade = sc.next().charAt(0);
		
		
		switch(grade) {
		case 'A':
		case
			System.out.println("Excellent");
		break;
		case 'B':System.out.println("Well Done");
		break;
		case 'C' : System.out.println("Good Job");
		break;
		case 'D':System.out.println("Passed");
		break;
		default : System.out.println("Invalid grade");
		}
	}

	public static void main(String[] args) {
		gradeRemark();

	}

}
