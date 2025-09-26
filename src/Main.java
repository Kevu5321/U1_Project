import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------");
        System.out.println("|Note! Do not use any symbols when inputting data! (No $ or %)|");
        System.out.println("---------------------------------------------------------------");


// User Input
        System.out.print("Enter your Bill($): ");
        double initialBill = Scan.nextDouble();
        System.out.print("Tip Percent: ");
        double tipPercent = Scan.nextDouble();
        System.out.print("Number of People: ");
        int numOfPeople = Scan.nextInt();
        System.out.println();


// Calculations
        double totalTip = (initialBill * tipPercent) / 100;
        String fTotalTip = String.format("%.2f", totalTip);

        double totalBill = initialBill + totalTip;
        String fTotalBill = String.format("%.2f", totalBill);

        double tipPerPerson = totalTip / numOfPeople;
        String fTipPerPerson = String.format("%.2f", tipPerPerson);

        double totalBillPerPerson = totalBill / numOfPeople;
        String fTotalBillPerPerson = String.format("%.2f", totalBillPerPerson);


//Output
        System.out.println("--------------------------------");
        System.out.println("|Total Tip Amount: $" + fTotalTip + "      |");
        System.out.println("--------------------------------");
        System.out.println("|Total bill cost: $" + fTotalBill + "      |");
        System.out.println("--------------------------------");
        System.out.println("|Tip per person: $" + fTipPerPerson + "        |");
        System.out.println("--------------------------------");
        System.out.println("|Total bill per person: $" + fTotalBillPerPerson + " |");
        System.out.println("--------------------------------");
    }
}