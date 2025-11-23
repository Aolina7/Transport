public class Bus extends Transport {
    public Bus() {
        super("Автобус", 70.0, 10.5);
    }

    public double countTicket(double distance) {
        return super.ticketPrice(distance);
    }
}
