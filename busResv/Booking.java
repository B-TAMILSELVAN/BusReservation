
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;
    Scanner sc = new Scanner(System.in);

    Booking() {
        System.out.println("enter the passenge name: ");
        passengerName = sc.nextLine();
        System.out.println("enter busno: ");
        busNo = sc.nextInt();
        System.out.println("enter the date in the format dd-mm-yyyy: ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusnumber() == busNo) {
                capacity = bus.getcpacity();
            }
        }
        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }

        }
        return booked < capacity ? true : false;
    }

}
