public class RoutesData {
    public Route[] Routes() {
        return new Route[] {
                new Route("Казань", "Москва", "10:00", "11:00", timeTrip(800), 800, new Plane(), super.countTicket(800))
        }
    }

}
