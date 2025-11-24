import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пункт отправления: ");
        Scanner scanner1 = new Scanner(System.in);
        String departureTown = scanner1.nextLine();

        System.out.println("Введите пункт назначения: ");
        Scanner scanner2 = new Scanner(System.in);
        String arrivalTown = scanner2.nextLine();

        Route[] RoutesData = Route.getRoutesData();
        for (int i = 0; i < RoutesData.length; i++) {
            if ((RoutesData[i].getDepartureTown().equals(departureTown)) && (RoutesData[i].getArrivalTown().equals(arrivalTown))) {
                System.out.println(RoutesData[i]);
            }
        }
    }
}

