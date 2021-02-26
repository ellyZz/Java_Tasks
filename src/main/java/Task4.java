public class Task4 {
    public static void main(String[] args) {
        String input = args[0];
        String[] arguments = input.split(",");
        int sum = 0;
        int mult = 1;
        for (String argument : arguments) {
            int number = Integer.parseInt(argument);
            sum = sum + number;
            mult *= number;
        }
        System.out.println("Arguments sum = " + sum);
        System.out.println("Arguments multiplication = " + mult);
    }
}
