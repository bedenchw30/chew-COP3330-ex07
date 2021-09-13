import java.util.Scanner;

public class exerciseseven {
public static void main(String[] Args){
    System.out.print("What is the length of the room in feet? ");
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();

    System.out.print("What is the width of the room in feet? ");
    int width = input.nextInt();

    int area = length*width;
    final double sqrmeterconversion = area * .09290304; // final makes conversion a constant

    System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
    System.out.println("The area is ");
    System.out.println(area + " square feet");
    System.out.println(sqrmeterconversion + " square meters");




}
}
