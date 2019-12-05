/**
 * Fuel Counter-Upper
 * Takes in a list of masses and calculates the fuel needed by each mass, then sums them.
 *
 * @author Sylvia Liu
 * @version 05-12-2019
 */

import java.util.Scanner;

public class fuelCounterUpper {

    private static int countIndv(int mass) {
        int fuel;

        fuel = (mass / 3) - 2;
        return fuel;
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