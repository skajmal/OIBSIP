import java.util.Scanner;

class atm {
    float balance;
    int pin = 2251;

    public void checkpin() {
        System.out.println("PIN = 2251");
        System.out.println("Enter your PIN : ");
        Scanner sc = new Scanner(System.in);
        int ep = sc.nextInt();
        while (true) {

            if (ep == pin) {
                menu();
            }

            else {
                System.out.println("Invalid PIN.");
                checkpin();
            }
            sc.close();
        }
    }

    public void menu() {
        System.out.println("Press 1 to view balance.");
        System.out.println("Press 2 to deposit money. ");
        System.out.println("Press 3 to withdraw money.");
        System.out.println("Press 4 to exit.");
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            balance();
        }

        else if (opt == 2) {
            deposit();
        }

        else if (opt == 3) {
            withdraw();
        } else if (opt == 4) {
            System.exit(0);

        } else {
            System.out.println("Enter a valid choice");
            menu();
        }
        sc.close();

    }

    public void balance() {
        System.out.println("Balance :" + balance);
        menu();
    }

    public void deposit() {
        System.out.println("Enter the amount : ");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();
        balance = amt + balance;
        System.out.println("Your amount has been sucessfully deposit");
        System.out.println("Available balance :" + balance);
        menu();
        sc.close();

    }

    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float wd = sc.nextFloat();
        balance = balance - wd;

        if (balance >= wd) {
            System.out.println("Your amount has been withdrawn sucessfully");
            System.out.println("Available balance : " + balance);
            menu();
        }

        else {
            System.out.println("Insufficiant balance.");
            menu();
        }
        sc.close();

    }
}

public class App {
    public static void main(String[] args) {
        atm obj = new atm();
        obj.checkpin();

    }
}
