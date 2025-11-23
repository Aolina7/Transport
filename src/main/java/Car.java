public class Car extends Transport {
    public Car() {
        super("Автомобиль", 90.0, 5.76);
    }

    public double countTicket(double distance) {
        return super.ticketPrice(distance);
    }
}
