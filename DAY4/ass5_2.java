import java.util.Scanner;
class Complex
{
Scanner sc=new Scanner(System.in);
int real=sc.nextInt();
int img=sc.nextInt();
void display()
{
System.out.println(real+"+"+img+"i");
}
}
public class Integers
{
public static void main(String args[])
{
Complex c=new Complex();
c.display();
}
} 