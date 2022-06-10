package assessments;

public abstract class Shape implements ShapBehaviours{
	double area;
	double radious;
	public double getArea()
	{
		return area;
	}
	public void printInfo()
	{
		System.out.println(area);
	}
}
