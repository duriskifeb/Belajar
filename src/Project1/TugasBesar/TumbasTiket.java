package Project1.TugasBesar;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

class Ticket {
    private String eventName;
    private Date date;
    private double price;

    public Ticket(String eventName, Date date, double price) {
        this.eventName = eventName;
        this.date = date;
        this.price = price;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
}

class TicketPurchase {
    private ArrayList<Ticket> purchasedTickets;
    private ArrayList<String> purchaseHistory;

    public TicketPurchase() {
        purchasedTickets = new ArrayList<>();
        purchaseHistory = new ArrayList<>();
    }

    public void purchaseTicket(Ticket ticket) {
        purchasedTickets.add(ticket);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String purchaseInfo = "Purchased ticket for '" + ticket.getEventName() + "' on " +
                dateFormat.format(new Date()) + " at price: $" + ticket.getPrice();

        purchaseHistory.add(purchaseInfo);
    }

    public void displayPurchaseHistory() {
        System.out.println("Purchase History:");
        for (String purchaseInfo : purchaseHistory) {
            System.out.println(purchaseInfo);
        }
    }

    public void displayPurchasedTickets() {
        System.out.println("Purchased Tickets:");
        for (Ticket ticket : purchasedTickets) {
            System.out.println("Event: " + ticket.getEventName() +
                    ", Date: " + ticket.getDate() +
                    ", Price: $" + ticket.getPrice());
        }
    }
}

public class TumbasTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ticket information from the user
        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        // Create a Ticket object
        Ticket ticket = new Ticket(eventName, new Date(), ticketPrice);

        // Perform the ticket purchase
        TicketPurchase ticketPurchase = new TicketPurchase();
        ticketPurchase.purchaseTicket(ticket);

        // Display purchase information
        ticketPurchase.displayPurchasedTickets();
        ticketPurchase.displayPurchaseHistory();

        // Close the scanner
        scanner.close();
    }
}
