package assessments;

public class ClassTest extends Circle{
	double radious1;
	double radious2;
	double area;
    private static final double PI=3.14;
	
	public ClassTest()
	{
		radious1=20;
	}
	public ClassTest(double radious,double radious2)
	{
		this.radious1=radious1;
		this.radious2=radious2;
	}
	public double getArea()
	{
	    return area =(PI)*(radious1*radious2);
	}
	public void printInfo()
	{
		System.out.println(radious1);
		System.out.println(radious1);
		System.out.println(area);
	}

}
