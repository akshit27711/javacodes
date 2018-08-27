import java.util.Scanner;
 class Rect_area
 {
 Scanner s=new Scanner(System.in);
 int l=s.nextInt();
 int b=s.nextInt();
 void CalculateArea()
 {
    System.out.println("Area of Rectangle:"+(l*b));
 }
 }
 public class Area
 {
 public static void main(String args[])
 {
 Rect_area r=new Rect_area() ;
 r.CalculateArea();
 }  
 }