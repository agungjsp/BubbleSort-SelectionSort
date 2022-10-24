import java.util.ArrayList;

public class Main {
    // Create public record MenuItem with fields name and action
    public record MenuItem(String name, String action) { }

    // Create public static arraylist of randomNumber
    public static ArrayList<Integer> randomNumber = new ArrayList<>();

    // Create public static boolean check
    public static boolean check = false;

    public static void main(String[] args) {
        // Create list menu items
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Random Data", "randomData"));
        menuItems.add(new MenuItem("Simulasi Bubble Sort - Ascending", "bubbleSortAscending"));
        menuItems.add(new MenuItem("Simulasi Selection Sort - Ascending", "selectionSortAscending"));
        menuItems.add(new MenuItem("Simulasi Bubble Sort - Descending", "bubbleSortDescending"));
        menuItems.add(new MenuItem("Simulasi Selection Sort - Descending", "selectionSortDescending"));
        menuItems.add(new MenuItem("Keluar", "exit"));

        // Call Menu method with parameter menuItems
        Menu(menuItems);
    }

    // Create method Menu
    public static void Menu(ArrayList<MenuItem> menuItems) {
        // Create randomData object from RandomData class
        RandomData randomData = new RandomData();

        // Print menu items
        System.out.println("Selamat Datang di Program Simulasi");
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).name());
        }
        // Select menu item
        System.out.print("Masukkan Pilihan Anda: ");
        int selectedMenu = new java.util.Scanner(System.in).nextInt();
        // Get action from selected menu item
        String action = menuItems.get(selectedMenu - 1).action();
        // Get randomData value from RandomData class
        ArrayList<Integer> data = randomData.getRandomData();
        // Execute action
        switch (action) {
            case "randomData" -> {
                // Call generateRandomData method from RandomData class
                RandomData.generateRandomData();
            }
            case "bubbleSortAscending" -> {
                // Call bubbleSortAscending method
                BubbleSort.Ascending(data);
                // Ask user to continue or exit
                userExit();
            }
            case "selectionSortAscending" -> {
                // Call bubbleSortAscending method
                SelectionSort.Ascending(data);
                // Ask user to continue or exit
                userExit();
            }
            case "bubbleSortDescending" -> {
                // Call bubbleSortAscending method
                BubbleSort.Descending(data);
                // Ask user to continue or exit
                userExit();
            }
            case "selectionSortDescending" -> {
                // Call bubbleSortAscending method
                SelectionSort.Descending(data);
                // Ask user to continue or exit
                userExit();
            }
            case "exit" -> exit();

        }
    }

    // Create method that ask user to continue or exit
    public static void userExit() {
        System.out.print("\nTekan Y untuk melanjutkan atau N untuk keluar: ");
        String continueOrExit = new java.util.Scanner(System.in).nextLine();
        if (continueOrExit.equalsIgnoreCase("y")) {
            // Call Menu method
            Main.main(null);
        } else {
            // Exit program
            System.exit(0);
        }
    }

    static void exit() {
        System.out.println("Program Simulasi Selesai");
        System.exit(0);
    }
}
