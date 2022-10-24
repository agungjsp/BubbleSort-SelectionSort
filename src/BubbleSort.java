import java.util.ArrayList;

public class BubbleSort {
    // Create BubbleSort - Ascending method with detail swap and compare count
    // Return print sorted data
    public static void Ascending(ArrayList<Integer> data) {
        // Check if random data is generated
        if (!Main.check) {
            System.out.println("Silahkan generate data terlebih dahulu\n");
            Main.main(null);
        }

        // Create Bubble Sort Logic with Pass 1 to Pass 4 and print result of each pass
        System.out.println("\nBubble Sort - Ascending");
        // Show unsorted data
        System.out.println("Data Sebelum diurutkan: " + data);
        // Create swapCount variable
        for (int i = 0; i < data.size() - 1; i++) {
            System.out.println("\nPass " + (i + 1));

            for (int j = 0; j < data.size() - i - 1; j++) {
                // Create if statement to compare data
                if (data.get(j) > data.get(j + 1)) {
                    // Create temp variable
                    int temp = data.get(j);
                    // Swap data
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
                // Print data after swap
                // Print data again for the last swap
                System.out.println(data);
                if (j == data.size() - i - 2) {
                    System.out.println("Result of Pass " + (i + 1));
                    System.out.println(data);
                }
            }
        }
    }

    // Create BubbleSort - Descending method with detail swap and compare count
    // Return print sorted data
    public static void Descending(ArrayList<Integer> data) {
        // Check if random data is generated
        if (!Main.check) {
            System.out.println("Silahkan generate data terlebih dahulu\n");
            Main.main(null);
        }

        // Create Bubble Sort Logic with Pass 1 to Pass 4 and print result of each pass
        System.out.println("\nBubble Sort - Descending");
        // Show unsorted data
        System.out.println("Data Sebelum diurutkan: " + data);
        // Create swapCount variable
        for (int i = 0; i < data.size() - 1; i++) {
            System.out.println("\nPass " + (i + 1));

            for (int j = 0; j < data.size() - i - 1; j++) {
                // Create if statement to compare data
                if (data.get(j) < data.get(j + 1)) {
                    // Create temp variable
                    int temp = data.get(j);
                    // Swap data
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
                // Print data after swap
                // Print data again for the last swap
                System.out.println(data);
                if (j == data.size() - i - 2) {
                    System.out.println("Result of Pass " + (i + 1));
                    System.out.println(data);
                }
            }
        }
    }
}
