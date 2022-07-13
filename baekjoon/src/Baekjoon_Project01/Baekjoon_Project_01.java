package Baekjoon_Project01;

import java.util.Scanner;

public class Baekjoon_Project_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
