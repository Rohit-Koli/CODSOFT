package javaPackage;
import java.util.Random; 
import java.util.Scanner; 
public class NumberGame {

	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("You have only 5 Chances to win !");
		for(int i = 0;i<5;i++) {
			int num=rm.nextInt(100);
			System.out.println("Enter Number :");
			int guessNum=sc.nextInt();
			if(num==guessNum) {
				System.out.println("You Won the Game !!");
				break;
			}else {
				System.out.println("Correct number is :"+num);
				System.out.println("Better Luck Next time !");
			}
		}
		sc.close();
	}

}
