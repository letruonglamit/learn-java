package edu.andrew.basic;




abstract class Shape{
	abstract void circuit();
}
class Circle extends Shape{
	private int r;
	public Circle(int r){
		this.r = r;
	}
	void circuit(){
		System.out.println("Chu vi hinh tron: "+2*r*3.14);
	}
}
class Rectangle extends Shape{
	private int x,y;
	public Rectangle(int x,int y){
		this.x = x;
		this.y = y;
	}
	void circuit(){
		System.out.println("Chu vi hinh chu nhat: "+ 2*x*y);
	}
}
public class Demo{
	public static void main(String[] args){
		Shape s1 = new Circle(3);
		Shape s2 = new Rectangle(2,3);
		s1.circuit();
		s2.circuit();
	}
}
