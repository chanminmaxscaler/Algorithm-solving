package no10998;

import java.util.Scanner;

public class Main {

	int a;
	int b;
	Scanner sc = new Scanner(System.in);
	
	public Main() {}
	
	public void getAB() {
		this.a = sc.nextInt();
		this.b = sc.nextInt();
	}
	
	public void mulAB() {
		System.out.println(this.a * this.b);
	}
	
	public static void main(String[] args) {
		
		Main calculationAB = new Main();
		calculationAB.getAB();
		calculationAB.mulAB();
	}
}