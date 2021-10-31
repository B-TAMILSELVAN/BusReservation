import java.util.*;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1, true, 50));
        buses.add(new Bus(2, true, 250));
        buses.add(new Bus(3, true, 150));

        Scanner sc = new Scanner(System.in);
        int userOption = 1;
        for (Bus b : buses) {
            b.display();
        }
        while (userOption == 1) {
            System.out.println("enter '1' to book '0' to exit");
            userOption = sc.nextInt();
            if (userOption == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("sorry...your bus is full try another bus or another date");
                }
            }
        }
    }

}
