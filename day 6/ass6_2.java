class test
{
	public void print()
	{
		System.out.println("1st function called");
	}
	public void print(int a)
	{
		System.out.println("2nd function called and "+a +" int was passed");
	}
	public void print(float a)
	{
		System.out.println("1st function called and "+a+" float was passed");
	}
}
public class MethodOverloading
{
	public static void main(String[] args)
	{
		test obj =new test();
		obj.print();
		obj.print(3);
		obj.print(6.2f);
	}
}