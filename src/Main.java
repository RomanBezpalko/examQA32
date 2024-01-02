import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Person player = new Person(playerName);

        while (player.isAlive()) {
            System.out.println("\nChoose an activity for the month:");
            System.out.println("1. Get Engaged");
            System.out.println("2. Get a Job");
            System.out.println("3. Get Education");
            System.out.println("4. Live a Normal Month");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.liveMonth(new EngageEvent());
                    break;
                case 2:
                    player.liveMonth(new JobEvent());
                    break;
                case 3:
                    System.out.println("Choose your education level:");
                    System.out.println("1. High School");
                    System.out.println("2. College");
                    System.out.println("3. University");
                    int educationChoice = scanner.nextInt();
                    Education chosenEducation = Education.NONE;
                    switch (educationChoice) {
                        case 1:
                            chosenEducation = Education.HIGH_SCHOOL;
                            break;
                        case 2:
                            chosenEducation = Education.COLLEGE;
                            break;
                        case 3:
                            chosenEducation = Education.UNIVERSITY;
                            break;
                        default:
                            System.out.println("Invalid choice. Defaulting to no education.");
                    }
                    player.liveMonth(new EducationEvent(chosenEducation));
                    break;
                case 4:
                    player.liveMonth(new AccidentEvent());
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Game over. You lived a good life!");
        scanner.close();
    }
}
