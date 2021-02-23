import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scan.nextLine();
        scan.close();
        System.out.println("Привет, " + name + "!!!");

    }

}
