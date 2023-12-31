package Project1.RevisiProject.JanganBesar.Logic;

public class Tiket {
    public static void main(String[] args) {

    }

    public class Ticket {
        private String ticketType;
        private String concertName;
        private int price;
        private int quantity;

        public Ticket(String ticketType, String concertName, int price, int quantity) {
            this.ticketType = ticketType;
            this.concertName = concertName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getTicketType() {
            return ticketType;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

}
