import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celcius = 0;
        double fahrenheit = 0;
        boolean done = false;
        do {
            System.out.print("Enter temperature in Celcius");
            if(in.hasNextDouble())
            {
                celcius = in.nextDouble();
                fahrenheit = (celcius * 9/5) + 32;
                System.out.println("Your temperature in Fahrenheit is " + fahrenheit);
                in.nextLine();
                done = true;
            }
            else{
                in.nextLine();
            }

        }while(!done);


    }
}