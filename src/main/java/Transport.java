public class Transport {
    protected String name;
    protected double speed;
    protected double priceKM;

    public Transport(String name, double speed, double priceKM) {
        this.name = name;
        this.speed = speed;
        this.priceKM = priceKM;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getPriceKM() {
        return priceKM;
    }

    public double timeTrip(double distance) {
        return distance / speed;
    }

    public double ticketPrice(double distance) {
        return distance * priceKM;
    }
}