import java.util.ArrayList;

public class RandomData {
    // Create random object
    static java.util.Random random = new java.util.Random();

    // Get random data
    public ArrayList<Integer> getRandomData() {
        return Main.randomNumber;
    }

    // Add random data to list
    // Avoid duplicate data
    public static void addRandomData(int dataCount, int lowerBound, int upperBound) {
        // Create for loop to add random data
        for (int i = 0; i < dataCount; i++) {
            // Create random number
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            // Check if random number is already in list
            if (Main.randomNumber.contains(randomNumber)) {
                // If random number is already in list, add random number again
                i--;
            } else {
                // If random number is not in list, add random number to list
                Main.randomNumber.add(randomNumber);
            }
        }
    }

    // Print random data horizontally
    public static void printRandomData() {
        for (Integer number : Main.randomNumber) {
            System.out.print(number + "    ");
        }
    }

    // Create generateRandomData method
    public static void generateRandomData() {
        // Clear random data
        Main.randomNumber.clear();

        // Create dataCount variable
        int dataCount = 5;

        // Create list of random data with range manual input
        System.out.print("\nBatas Bawah: ");
        int lowerBound = new java.util.Scanner(System.in).nextInt();
        System.out.print("Batas Atas: ");
        int upperBound = new java.util.Scanner(System.in).nextInt();

        // upperBound cannot be less than lowerBound
        // user must input upperBound greater than lowerBound
        while (upperBound < lowerBound) {
            System.out.println("Batas Atas tidak boleh kurang dari Batas Bawah");
            System.out.print("Batas Atas: ");
            upperBound = new java.util.Scanner(System.in).nextInt();
        }

        // Call addRandomData method from RandomData class
        addRandomData(dataCount, lowerBound, upperBound);

        // Call printData method from RandomData class
        printRandomData();

        // Check true if random data is generated
        Main.check = true;

        System.out.println();

        // Press Y to continue or N to exit
        System.out.print("\nRandom number telah disimpan.\nTekan Y untuk melanjutkan atau N untuk keluar: ");
        String continueOrExit = new java.util.Scanner(System.in).nextLine();
        if (continueOrExit.equalsIgnoreCase("Y")) {
            // Go back to main method
            Main.main(null);
        } else {
            // Exit program
            Main.exit();
        }
    }
}