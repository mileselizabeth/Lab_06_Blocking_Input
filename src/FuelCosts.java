import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mpg = 0;
        double gallonsOfGas = 0;
        double priceOfGas = 0;
        boolean done = false;
        double costPer100Miles = 0;
        double distanceWithGasInTank = 0;
        do {
            System.out.print("How many gallons of gas in your tank? ");
            if(in.hasNextDouble())
            {
                gallonsOfGas = in.nextDouble();
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
            System.out.print("How many miles per gallon does your vehicle get? ");
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
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
            System.out.print("What is the price of gas? ");
            if(in.hasNextDouble())
            {
                priceOfGas = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else{
                in.nextLine();
                System.out.println("You have to enter a valid amount!");
            }

        }while(!done);
        costPer100Miles = (100/mpg) * priceOfGas;
        distanceWithGasInTank = gallonsOfGas * mpg;
        System.out.println("The cost per 100 miles is " + costPer100Miles);
        System.out.println("The car can travel " + distanceWithGasInTank + " miles with the gas in the tank");

    }
}
