public class Route {
    public String departureTown;
    public String arrivalTown;
    public String departureTime;
    public String arrivalTime;
    public double distance;
    public Transport transport;

    public Route(String departureTown, String arrivalTown, String departureTime, String arrivalTime,
                 double distance, Transport transport) {
        this.departureTown = departureTown;
        this.arrivalTown = arrivalTown;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.distance = distance;
        this.transport = transport;
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

    public Transport getTransport() {
        return transport;
    }

}
