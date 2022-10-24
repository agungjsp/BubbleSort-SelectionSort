import java.util.ArrayList;

public class SelectionSort {
    // Create Selection Sort - Ascending method
    // Return print sorted data
    public static void Ascending(ArrayList<Integer> data) {
        // Check if random data is generated
        if (!Main.check) {
            System.out.println("Silahkan generate data terlebih dahulu\n");
            Main.main(null);
        }

        // Create Selection Sort Logic with Pass 1 to Pass 4 and print result of each pass
        System.out.println("\nSelection Sort - Ascending");
        // Show unsorted data
        System.out.println("Data Sebelum diurutkan: " + data);

        for (int i = 0; i < data.size() - 1; i++) {
            System.out.println("\nPass " + (i + 1));
            // Set the first unsorted element as the minimum
            int min = i;
            // For each of the unsorted elements
            // Print the process of finding the minimum
            for (int j = i + 1; j < data.size(); j++) {
                System.out.println("Compare " + data.get(min) + " with " + data.get(j));
                if (data.get(j) < data.get(min)) {
                    min = j;
                }
            }
            // Swap the found minimum with the first unsorted element
            int temp = data.get(i);
            data.set(i, data.get(min));
            data.set(min, temp);
            // Print data after swap
            System.out.println("Swap " + data.get(i) + " with " + data.get(min));
            System.out.println(data);
            if (i == data.size() - 2) {
                System.out.println("Result of Pass " + (i + 1));
                System.out.println(data);
            }
        }
    }

    // Create Selection Sort - Descending method
    // Return print sorted data
    public static void Descending(ArrayList<Integer> data) {
        // Check if random data is generated
        if (!Main.check) {
            System.out.println("Silahkan generate data terlebih dahulu\n");
            Main.main(null);
        }

        // Create Selection Sort Logic with Pass 1 to Pass 4 and print result of each pass
        System.out.println("\nSelection Sort - Descending");
        // Show unsorted data
        System.out.println("Data Sebelum diurutkan: " + data);

        for (int i = 0; i < data.size() - 1; i++) {
            System.out.println("\nPass " + (i + 1));
            // Set the first unsorted element as the minimum
            int max = i;
            // For each of the unsorted elements
            // Print the process of finding the minimum
            for (int j = i + 1; j < data.size(); j++) {
                System.out.println("Compare " + data.get(max) + " with " + data.get(j));
                if (data.get(j) > data.get(max)) {
                    max = j;
                }
            }
            // Swap the found minimum with the first unsorted element
            int temp = data.get(i);
            data.set(i, data.get(max));
            data.set(max, temp);
            // Print data after swap
            System.out.println("Swap " + data.get(i) + " with " + data.get(max));
            System.out.println(data);
            if (i == data.size() - 2) {
                System.out.println("Result of Pass " + (i + 1));
                System.out.println(data);
            }
        }
    }
}
