import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean isRunning = true;

        while (isRunning){
            System.out.print("$ ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            switch (command) {
                case "exit" -> System.exit(0);
                case "echo" -> System.out.println(input.substring(4));
                default -> System.err.printf("%s: input not found%n", input);
            }
        }
    }
}
