import java.util.Scanner;
public class Rec
{
int l,b;
void CalculateArea()
{
Scanner s = new Scanner(System.in);
int area;
System.out.println("Enter length: ");
l=s.nextInt();
System.out.println("Enter breadth: ");
b=s.nextInt();
area = l*b;
System.out.println("Area of rectangle is: "+area);
}

public static void main(String[] args)
{
Rec answ= new Rec();
answ.CalculateArea();
}
}