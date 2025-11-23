public class Route {
    public String departureTown;
    public String arrivalTown;
    public double departureTime;
    public double arrivalTime;
    public double timeInTrip;
    public double distance;
    public Transport transport;
    public double price;

    public Route(String departureTown, String arrivalTown, double departureTime, double arrivalTime,
                 double timeInTrip, double distance, String nameTransport, double price) {
        this.departureTown = departureTown;
        this.arrivalTown = arrivalTown;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.timeInTrip = transport.timeTrip(distance);
        this.distance = distance;
        this.price = transport.ticketPrice(distance);
    }

}
