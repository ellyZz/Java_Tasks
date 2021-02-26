public class Task3 {

    public static void main(String[] args) {
        String input = args[0];
        String[] arguments = input.split(",");
        for (String argument : arguments) {
            System.out.print(argument + " ");
        }
        System.out.println();
        for (String argument : arguments) {
            System.out.println(argument);
        }
    }
}