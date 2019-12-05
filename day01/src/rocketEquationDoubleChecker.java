/**
 * Rocket Equations Double Checker
 * Takes in a list of masses and calculates the fuel needed by each mass, then sums them.
 * If the fuel needed is greater than 0, then the fuel needed for the mass of fuel needed is summed until the fuel
 * needed is less than zero.
 *
 * @author Sylvia Liu
 * @version 05-12-2019
 */

import java.util.Scanner;

public class rocketEquationDoubleChecker {

    private static int countIndv(int mass) {
        int fuelTotal = 0;
        int fuel;

        while(true) {
            fuel = (mass / 3) - 2;
            if (fuel <= 0) {
                break;
            }

            fuelTotal += fuel;
            mass = fuel;
        }

        return fuelTotal;
    }

    private static int sumTotal(int[] masses) {
        int total = 0;

        for (int mass:masses) {
            total += countIndv(mass);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter masses. Separate each mass with a comma.");
        String input = s.nextLine();

        String[] splitInput = input.split(",");
        int[] masses = new int[splitInput.length];
        for (int i = 0; i < masses.length; i++) {
            masses[i] = Integer.parseInt(splitInput[i]);
        }

        System.out.println(sumTotal(masses));
    }
}