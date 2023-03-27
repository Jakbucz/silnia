import java.util.Scanner;

   class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = scanner.nextInt();

        int silnia = 1;
        for (int i = 2; i <= n; i++) {
            silnia *= i;
        }

        System.out.println("Silnia: " + silnia);
    }
}