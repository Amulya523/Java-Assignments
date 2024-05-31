package assignment5;

class Operators
{
	int m1, m2, m3;
	public void readVal(int a, int b, int c)
	{
		m1=a;
		m2=b;
		m3=c;
	}
	public void sum()
	{
		int sum = m1+m2+m3;
		System.out.println("Sum of 3 numbers is:" +sum);
		
	}
	public void sub()
	{
		int sub = m1-m2-m3;
		System.out.println("Subtraction of 3 numbers is:" +sub);
	}
	public void mul()
	{
		int mul =m1*m2*m3;
		System.out.println("Multiplication of 3 numbers is:" +mul);
	}
	public void div()
	{
		float div = m1/m2;
		System.out.println("Division of 2 numbers is:" +div);
	}
}

public class calc {
	
	public static void main(String[] args) {
		Operators math1 = new Operators();
		math1.readVal(50,5,8);
		math1.sum();
		math1.sub();
		math1.mul();
		math1.div();
		
		Operators math2 = new Operators();
		math2.readVal(100,2,20);
		math2.sum();
		math2.sub();
		math2.mul();
		math2.div();
		
		
	}

}
