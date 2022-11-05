package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length = 0;
	private double width = 0;
	public Rectangle(double x, double y){
		this.length = x;
		this.width = y;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public double area() {
		double area = this.length * this.width;
		return area;
	}
	public boolean isSquare(double length, double width) {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	public double Perimeter() {
		double perimeter = (2*this.length)+(2*this.width);
		return perimeter;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(0.3,0.3);
		StdDraw.rectangle(0.5,0.5, getLength()/2, getWidth()/2);
	} 

}
//Die

