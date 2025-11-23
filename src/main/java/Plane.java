public class Plane extends Transport {
    public Plane() {
        super("Самолёт", 800.0, 6);
    }

    public double countTicket(double distance) {
        return super.ticketPrice(distance);
    }
}