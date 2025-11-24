public class Route {
    public String departureTown;
    public String arrivalTown;
    public String departureTime;
    public String arrivalTime;
    public double distance;
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
        this.transportName = transportName;
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

    public String getTransportName() { return transportName; }

    public double getTime() { return time; }

    public double getTicketPrice() { return ticketPrice; }

    static Plane plane = new Plane();
    static Car car = new Car();
    static Bus bus = new Bus();
    static Train train = new Train();

    public static Route[] getRoutesData() {
        return new Route[] {
                new Route("Казань", "Москва", "10:00", "11:00", 800, plane.getName(), plane.countTicket(800), plane.timeTrip(800)),
                new Route("Казань", "Москва", "12:00", "21:00", 800, car.getName(), car.countTicket(800), car.timeTrip(800)),
                new Route("Москва", "Казань", "05:00", "18:00", 800, train.getName(), train.countTicket(800), train.timeTrip(800)),
                new Route("Махачкала", "Нижневартовск", "19:00", "00:00", 3600, plane.getName(), plane.countTicket(3600), plane.timeTrip(3600)),
                new Route("Москва", "Нижний Новгород", "11:00", "18:00", 440, train.getName(), train.countTicket(440), train.timeTrip(440)),
                new Route("Сургут", "Нижневартовск", "8:00", "12:00", 220, bus.getName(), bus.countTicket(220), bus.timeTrip(220)),
                new Route("Сургут", "Нижневартовск", "10:00", "13:00", 220, car.getName(), car.countTicket(220), car.timeTrip(220)),
                new Route("Ульяновск", "Ижевск", "23:00", "07:00", 570, bus.getName(), bus.countTicket(570), bus.timeTrip(570))
        };
    }

    public String toString() {
        return   "" + departureTown + " - " + arrivalTown + ", " + departureTime + ", " + arrivalTime + ", " + distance + " км, " + transportName + ", " + ticketPrice + " руб." + time + " ч. , ";

    }

}
