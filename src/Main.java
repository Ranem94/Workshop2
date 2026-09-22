import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void showWelcome() {
        System.out.println("--- VÄLKOMMEN TILL BANKOMATEN ---");
    }
    public static void showMenu() {
        System.out.println("1. Se saldo | 2. Sätt in | 3. Ränta | 4. Kontoutdrag | 0. Avsluta");
    }
    public static int calculateInterest(int amount, int rate) {
        return amount * rate / 100;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        List<Integer> history = new ArrayList<>();
        int choice = -1;
        showWelcome();
        while (choice != 0) {
            showMenu();
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Saldo: " + balance + " kr");
            } else if (choice == 2) {
                balance += 500;
                history.add(500);
            } else if (choice == 3) {
                System.out.println("Ränta: " + calculateInterest(balance, 5) + " kr");
            } else if (choice == 4) {
                System.out.println("--- Kontoutdrag ---");
                if (history.isEmpty()) {
                    System.out.println("Inga insättningar gjorda ännu.");
                } else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". Insättning: " + history.get(i) + " kr");
                    }
                }
            } else if (choice == 0) {
                System.out.println("Kortet matas ut. Hejdå");
            } else {
                System.out.println("Ogiltigt val, försök igen.");
            }
        }
        scanner.close();
    }
}
