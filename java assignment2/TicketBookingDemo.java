// Question 19: Write a Java program to create a class named TicketBookingSystem.
// This class should manage the availability of tickets and be accessed by multiple threads for booking tickets.
// Demonstrate the use of synchronization to ensure correct booking operations.

class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public synchronized void bookTicket(int numberOfTickets) {
        if (numberOfTickets > 0 && numberOfTickets <= availableTickets) {
            System.out.println(Thread.currentThread().getName() + " booked " + numberOfTickets + " tickets.");
            availableTickets -= numberOfTickets;
            System.out.println("Tickets remaining: " + availableTickets);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to book " + numberOfTickets + " tickets, but insufficient tickets available.");
        }
    }
}

class BookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private int numberOfTickets;

    public BookingThread(TicketBookingSystem bookingSystem, int numberOfTickets) {
        this.bookingSystem = bookingSystem;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(numberOfTickets);
    }
}

class TicketBookingDemo {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(10);

        Thread bookingThread1 = new BookingThread(bookingSystem, 4);
        Thread bookingThread2 = new BookingThread(bookingSystem, 3);
        Thread bookingThread3 = new BookingThread(bookingSystem, 5);
        Thread bookingThread4 = new BookingThread(bookingSystem, 2);

        bookingThread1.setName("BookingThread1");
        bookingThread2.setName("BookingThread2");
        bookingThread3.setName("BookingThread3");
        bookingThread4.setName("BookingThread4");

        bookingThread1.start();
        bookingThread2.start();
        bookingThread3.start();
        bookingThread4.start();
    }
}
