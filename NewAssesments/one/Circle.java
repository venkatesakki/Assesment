package assessments;

public class Circle {
	double radious;
	double area;
    private static final double PI=3.14;
	
	public Circle()
	{
		radious=20;
	}
	public Circle(double radious)
	{
		this.radious=radious;
	}
	public double getArea()
	{
	    return area =(PI)*(radious*radious);
	}
	public void printInfo()
	{
		System.out.println(radious);
		System.out.println(area);
	}

}
