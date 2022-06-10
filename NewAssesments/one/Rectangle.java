package assessments;

public class Rectangle {
	
	double area;
	double l;
	double w;
	
	public Rectangle()
	{
		l=22;
		w=16;
	}
	public Rectangle(double l,double w)
	{
	    this.l=l;
	    this.w=w;
	}
	public double calculateArea()
	{
		area=l*w;
		return area;
	}
	
	public String toString() {
		return "Rectangle [area=" + area + "]";
	}
	

}
