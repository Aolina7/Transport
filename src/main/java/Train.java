public class Train extends Transport {
    public Train() {
        super("Поезд", 60.0, 2.5);
    }

    public double countTicket(double distance) {
        return super.ticketPrice(distance);
    }
}