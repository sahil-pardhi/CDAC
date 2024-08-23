import java.util.*;

class GoodMorningMsg{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the time from the user
        System.out.print("Enter the time (1-12): ");
        int t = scanner.nextInt();

        // Step 2: Get AM or PM from the user
        System.out.print("Enter AM or PM: ");
        String c = scanner.next().toUpperCase();

        // Step 3: Implementing the logic based on the flowchart
        if (c.equals("PM")) {
            System.out.println("Good Evening");
        } else if (c.equals("AM")) {
            if ((t >= 5 && t <= 12)) {
                System.out.println("Good Morning");
            } else if (t < 5 || t == 12) {
                System.out.println("MidNight");
            }
        } else {
            System.out.println("Invalid input");
        }

    }

}