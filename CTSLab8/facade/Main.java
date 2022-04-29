package facade;

public class Main {
    public static void main(String[] args) {
        /*Airline company = new Airline("CTS Flights");
        Flight toGo = company.flightBooking("Bucharest", "Cluj");
        Flight back = company.flightBooking("Cluj", "Bucharest");

        Hotel hotel = new Hotel("CTS Hotel");
        hotel.roomBooking("Cluj");*/

        Facade.reservation("Bucharest", "Cluj");
    }
}
