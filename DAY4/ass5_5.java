 import java.util.Scanner;
class waveform
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int[] a=new int[100];
int i,j,t,l;
System.out.println("Enter an array of 10 numbers:");
for(i=0;i<10;i++)
{
a[i]=scan.nextInt();
}
for(i=0;i<10;i=i+2)
{
for(j=i;j<=i+1;j++)
{
if(a[i]<=a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(i=0;i<10;i++)
{
System.out.println(a[i]+" ");
}
}
} 