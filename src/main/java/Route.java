public class Route {
    public String departureTown;
    public String arrivalTown;
    public String departureTime;
    public String arrivalTime;
    public double distance;
    public Transport transport;
    public double time;
    public double ticketPrice;


    public Route(String departureTown, String arrivalTown, String departureTime, String arrivalTime,
                 double distance, Transport transport, double time, double ticketPrice) {
        this.departureTown = departureTown;
        this.arrivalTown = arrivalTown;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.distance = distance;
        this.transport = transport;
        this.time = time;
        this.ticketPrice = ticketPrice;

    }

    public String getDepartureTown() {
        return departureTown;
    }

    public String getArrivalTown() {
        return arrivalTown;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public double getDistance() {
        return distance;
    }

    public Transport getTransportName() { return transport; }

    public double getTime() { return time; }

    public double getTicketPrice() { return ticketPrice; }

    public static Route[] getRoutesData() {
        return new Route[] {
                new Route("Казань", "Москва", "10:00", "11:00", 800, new Plane(),800, 800),
                new Route("Казань", "Москва", "12:00", "21:00", 800, new Car(), 800, 800),
                new Route("Москва", "Казань", "05:00", "18:00", 800, new Train(), 800, 800),
                new Route("Махачкала", "Нижневартовск", "19:00", "00:00", 3600, new Plane(), 3600, 3600),
                new Route("Москва", "Нижний Новгород", "11:00", "18:00", 440, new Train(), 440, 440),
                new Route("Сургут", "Нижневартовск", "8:00", "12:00", 220, new Bus(), 220, 220),
                new Route("Сургут", "Нижневартовск", "10:00", "13:00", 220, new Car(), 220, 220),
                new Route("Ульяновск", "Ижевск", "23:00", "07:00", 570, new Bus(), 570, 570)
        };
    }

    public String toString() {
        return   "" + departureTown + " => " + arrivalTown + ", " + departureTime + " - " + arrivalTime + ", " + distance + " км, " + transport.getName() + ", " + transport.timeTrip(time) + " ч., " + transport.ticketPrice(time) + " руб.";

    }

}
