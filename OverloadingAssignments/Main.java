package assignment_overloading;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Stage Event, Customer, No. of Seats:");
        String input = sc.nextLine();

        String[] data = input.split(",");

        String stageEvent = data[0];
        String customer = data[1];
        Integer noOfSeats = Integer.parseInt(data[2]);

        TicketBooking ticket = new TicketBooking(
                stageEvent, customer, noOfSeats
        );

        System.out.println("Enter payment choice:");
        System.out.println("1. Cash");
        System.out.println("2. Wallet");
        System.out.println("3. Credit Card");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.println("Enter amount:");
                Double cashAmount = sc.nextDouble();

                ticket.makePayment(cashAmount);
                break;

            case 2:
                System.out.println("Enter wallet number and amount:");
                String walletInput = sc.nextLine();

                String[] walletData = walletInput.split(",");

                String walletNumber = walletData[0];
                Double walletAmount = Double.parseDouble(walletData[1]);

                ticket.makePayment(walletNumber, walletAmount);
                break;

            case 3:
                System.out.println("Enter credit card, CVV, name and amount:");

                String cardInput = sc.nextLine();

                String[] cardData = cardInput.split(",");

                String creditCard = cardData[0];
                String cvv = cardData[1];
                String name = cardData[2];
                Double cardAmount = Double.parseDouble(cardData[3]);

                ticket.makePayment(
                        creditCard,
                        cvv,
                        name,
                        cardAmount
                );
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}