package assignment_overloading;
public class TicketBooking {

    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public TicketBooking() {
    }

   
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats)
    
    {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Cash payment
    public void makePayment(Double amount) {
        System.out.println("Payment mode: Cash");
        System.out.println("Amount: " + String.format("%.1f", amount));
        printReceipt(amount, "Cash");
    }

    // Wallet payment
    public void makePayment(String walletNumber, Double amount) {
        System.out.println("Payment mode: Wallet");
        System.out.println("Wallet number: " + walletNumber);
        System.out.println("Amount: " + String.format("%.1f", amount));
        printReceipt(amount, walletNumber);
    }

    // Credit card payment
    public void makePayment(String creditCard, String cvv,
                             String name, Double amount) {

        System.out.println("Payment mode: Credit Card");
        System.out.println("Credit Card: " + creditCard);
        System.out.println("CVV: " + cvv);
        System.out.println("Card Holder Name: " + name);
        System.out.println("Amount: " + String.format("%.1f", amount));

        printReceipt(amount, name);
    }

    // Receipt method
    public void printReceipt(Double amount, String paymentMode) {

        System.out.println("----- Receipt -----");
        System.out.println("Stage Event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("No. of Seats: " + noOfSeats);
        System.out.println("Payment: " + paymentMode);
        System.out.println("Amount: " + String.format("%.1f", amount));
        System.out.println("-------------------");
    }
}