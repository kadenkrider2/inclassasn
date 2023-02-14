import java.util.Scanner;
public class inclass1 {
/**
 * @param args
 */
public static void main(String[] args) {
double area, radius;
Scanner input = new Scanner(System.in);
System.out.println("This program calculates the area of a circle");
System.out.print("Enter radius: ");
radius = input.nextDouble();

area = 3.1415926 * radius * radius;

System.out.printf("The area of the circle is %.3f", area);
 }
}
