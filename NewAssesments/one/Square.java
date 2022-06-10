package assessments;

public class Square extends Rectangle{
	
	double wide;
	public Square(double l,double w)
	{
		super(l,w);
	}
	public double calculateArea()
	{
		return super.calculateArea();
	}
	public static void main(String[] args) {
		
		Square s=new Square(11,9);
		System.out.println(s.calculateArea());
		
		
	}

}
