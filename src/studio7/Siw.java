package studio7;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Die {

	private int n = 0;
	Scanner in = new Scanner(System.in);

	public Die(int x) {
		this.n = x;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getN(int n) {
		this.n = n;
		return (int) Math.random()*this.n;
	}
	

	public void main(String[] args) {
		System.print(getN(n));
	}
	
}
