public class RoutesData {
    public Route[] RoutesData;

    public Route[] RoutesData() {
        return new Route[] {
                new Route("Казань", "Москва", "10:00", "11:00", 800, new Plane()),
                new Route("Казань", "Москва", "12:00", "21:00", 800, new Car()),
                new Route("Москва", "Казань", "05:00", "18:00", 800, new Train()),
                new Route("Махачкала", "Нижневартовск", "19:00", "00:00", 3600, new Plane()),
                new Route("Москва", "Нижний Новгород", "11:00", "18:00", 440, new Train()),
                new Route("Сургут", "Нижневартовск", "8:00", "12:00", 220, new Bus()),
                new Route("Сургут", "Нижневартовск", "10:00", "13:00", 220, new Car()),
                new Route("Ульяновск", "Ижевск", "23:00", "07:00", 570, new Bus())
        };
    }

}
