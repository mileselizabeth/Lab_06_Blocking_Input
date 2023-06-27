import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean done = false;
        do {
            System.out.print("Enter your measurement in meters. ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                miles = meters * .00062137;
                System.out.println("Your measurement in miles is " + miles);
                feet = meters * 3.28084;
                System.out.println("Your measurement in feet is " + feet);
                inches = meters * 39.370079;
                System.out.println("Your measurement in inches is " + inches);
                in.nextLine();
                done = true;
            }
            else{
                System.out.println("You have entered an invalid input!");
                in.nextLine();
                done = true;
            }

        }while(!done);


    }
}
