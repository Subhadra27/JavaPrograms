package inheritances;

public class Rectangle extends Shapes {
	private double length ;
	private double breadth ;
	
	public Rectangle(double length ,double breadth) {
		this.length = length;
		this.breadth = breadth;	
	}
	
	@Override
	public double getArea() {
		
		double area = length * breadth;
		System.out.println("The area of rectangle is " + area);
		
		return area;
		
	}

}
