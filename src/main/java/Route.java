public class Route {
    public String departureTown;
    public String arrivalTown;
    public String departureTime;
    public String arrivalTime;
    public double distance;
    public Transport transport;
    public String transportName;
    public double time;
    public double ticketPrice;


    public Route(String departureTown, String arrivalTown, String departureTime, String arrivalTime,
                 double distance, String transportName, double time, double ticketPrice) {
        this.departureTown = departureTown;
        this.arrivalTown = arrivalTown;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.distance = distance;
        this.transport = transport;
        this.transportName = transport.getName();
        this.time = transport.timeTrip(distance);
        this.ticketPrice = transport.ticketPrice(distance);

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

    public String getTransportName() { return transportName; }

    public double getTime() { return time; }

    public double getTicketPrice() { return ticketPrice; }

    public static Route[] getRoutesData() {
        return new Route[] {
                new Route("Казань", "Москва", "10:00", "11:00", 800, Plane.super.getName(), ),
                new Route("Казань", "Москва", "12:00", "21:00", 800, new Car()),
                new Route("Москва", "Казань", "05:00", "18:00", 800, new Train()),
                new Route("Махачкала", "Нижневартовск", "19:00", "00:00", 3600, new Plane()),
                new Route("Москва", "Нижний Новгород", "11:00", "18:00", 440, new Train()),
                new Route("Сургут", "Нижневартовск", "8:00", "12:00", 220, new Bus()),
                new Route("Сургут", "Нижневартовск", "10:00", "13:00", 220, new Car()),
                new Route("Ульяновск", "Ижевск", "23:00", "07:00", 570, new Bus())
        };
    }

    public String toString() {
        return   "" + departureTown + " - " + arrivalTown + ", " + departureTime + ", " + arrivalTime + ", " + distance + " км, " + transportName + ", " + time + ", " + ticketPrice;

    }

}
