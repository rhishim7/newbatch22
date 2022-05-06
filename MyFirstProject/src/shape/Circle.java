package shape;

public class Circle extends Shape{

	private int radius;
	
	public void test()
	{
		System.out.println("HI");
	}
	
	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area()
	{
		return 3.14*radius*radius;
	}
	
}
