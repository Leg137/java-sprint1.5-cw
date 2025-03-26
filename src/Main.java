import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<BikeTimeCalculator> bikes = new ArrayList<>();
        bikes.add(new BikeTimeCalculator("Иван"));
        bikes.add(new BikeTimeCalculator("Василий"));
        bikes.add(new BikeTimeCalculator("Инга"));

        List<CarTimeCalculator> cars = new ArrayList<>();
        cars.add(new CarTimeCalculator("Ольга"));
        cars.add(new CarTimeCalculator("Пётр"));

        List<HumanTimeCalculator> humans = new ArrayList<>();
        humans.add(new HumanTimeCalculator("Анна"));
        humans.add(new HumanTimeCalculator("Дмитрий"));
        humans.add(new HumanTimeCalculator("Алексей"));

        CourierSelector selector = new CourierSelector(bikes, cars, humans);

        DeliveryInfo delivery;

        do {
            System.out.println("Введите расстояние в метрах => ");
            int distance = scanner.nextInt();
            delivery = selector.selectDelivery(distance);
            if (delivery != null) {
                System.out.println("Пицца будет доставлена через " + delivery.getTime() + " минут(у,ы)."
                );
                System.out.println("Ваш курьер - " + delivery.getName() + ".");
            } else {
                System.out.println("Доступных курьеров не найдено");
            }
        } while (delivery != null);
    }
}