import java.util.Scanner;
import java.lang.Math;
public class area
{
public static void main(String args[])
{
float b,h,at,ac,l,w,al,a,bt,ht,atrap;
int choice=2;
Scanner sc = new Scanner(System.in);
while(choice!=0)
 {
System.out.println("Choose");
System.out.println("1. Area of Triangle");
System.out.println("2. Area of Circle");
System.out.println("3. Area of Rectangle");
System.out.println("4. Area of Trapezoid");
System.out.println("5. Area of Hexagon");
choice=sc.nextInt();

switch(choice)
    {
        case 1:
	System.out.println("Enter Breadth of the Triangle");
	b=sc.nextFloat();
	System.out.println("Enter Height of the Triangle");
	h=sc.nextFloat();
	at = ((b*h)/2);
	System.out.println("Area of the Triangle is:"+at);
	break;
	
/*
	case 2:
	System.out.println("Enter Radius of the Cirle");
	r=sc.nextFloat();	
	ac=j*r*r;
	System.out.println("Area of the Cirle is:"+ac);
	break;*/

	case 3:
	System.out.println("Enter Length of the Rectangle");
	l=sc.nextFloat();
	System.out.println("Enter Breadth of the Triangle");
	w=sc.nextFloat();
	al = l*w;
	System.out.println("Area of the Rectangle is:"+al);
	break;

	case 4:
	System.out.println("Enter 1st side of the Trapezoid");
	a=sc.nextFloat();
	System.out.println("Enter 2nd side of the Trapezoid");
	bt=sc.nextFloat();	
	System.out.println("Enter height of the Trapezoid");
	ht=sc.nextFloat();	
	atrap=(a+bt)*ht*(1/2);
	System.out.println("Area of the Trapezoid is:"+atrap);
	break;

	/*case 5:
	System.out.println("Enter side of the Hexagon");
	s=sc.nextFloat();
	as = 3*Math.sqrt(3)*s*s*(1/2);
	System.out.println("Area of the Hexagon is:"+as);
	break;
	*/
	default:
	System.out.println("invalid input");
	}
}
}
}
	
	
	
	
	
	
	
	
	
	
	
	