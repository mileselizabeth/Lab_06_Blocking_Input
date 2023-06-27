import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        boolean done = false;
        double perimeter = 0;
        double diagonal = 0;
        do {
            System.out.print("Enter the width of your rectangle. ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else{
                in.nextLine();
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
        done = false;
        do {
            System.out.print("Enter the height of your rectangle. ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
        area = height * width;
        perimeter = 2 * height + 2 * width;
        diagonal = Math.sqrt(height * height + width * width);
        System.out.println("The area of your rectangle is " + area);
        System.out.println("The perimeter of your rectangle is " + perimeter);
        System.out.println("The length of the diagonal of your rectangle is " + diagonal);

    }
}