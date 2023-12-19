import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        System.out.println("Please choose between 1: Credit; 2: Debit; 3: View Balance");
        int n =S.nextInt();
        System.out.println(n);
        double Savings = S.nextDouble();
        System.out.println("Current Savings:" + Savings);
        double net = Savings;

        if (n == 1) {
            System.out.println("You have selected Credit\n");
            double Credit = S.nextDouble();
            System.out.println("Enter amount you want to credit:" + Credit);
            net = Savings + Credit;
            System.out.println("Credited Balance:" + net);

        }
        if (n == 2) {
            System.out.println("You have selected Debit\n");
            double Debit = S.nextDouble();
            System.out.println("Enter amount you want to debit:" + Debit);
            if (Debit > net) {
                System.out.println("Not sufficient Savings\n");
            }
            if (Debit < net) {
                System.out.println("Money debited successfully!\n");
                net=Savings-Debit;
                System.out.println("Debited Balance:" + net);
            }
        }
        if (n == 3) {
            System.out.println("Current Balance:" + net);
        }
    }
}
