import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoboPizza {
    private final Scanner scanner = new Scanner(System.in);

    List<BikeTimeCalculator> bikes = new ArrayList<>() {{
        add(new BikeTimeCalculator("Иван"));
        add(new BikeTimeCalculator("Василий"));
        add(new BikeTimeCalculator("Инга"));
    }};
    List<CarTimeCalculator> cars = new ArrayList<>() {{
        add(new CarTimeCalculator("Ольга"));
        add(new CarTimeCalculator("Пётр"));
    }};
    List<HumanTimeCalculator> humans = new ArrayList<>() {{
        add(new HumanTimeCalculator("Анна"));
        add(new HumanTimeCalculator("Дмитрий"));
        add(new HumanTimeCalculator("Алексей"));
    }};
    CourierSelector selector = new CourierSelector(bikes, cars, humans);

    void loop() {


        DeliveryInfo delivery;

        do {
            System.out.println("Введите расстояние в метрах => ");
            int distance = scanner.nextInt();
            delivery = selector.selectDelivery(distance);
            if (delivery != null) {
                System.out.println(
                        "Пицца будет доставлена через " + delivery.getTime() + " минут(у,ы)."
                );
                System.out.println("Ваш курьер - " + delivery.getName() + ".");
            } else {
                System.out.println("Доступных курьеров не найдено");
            }
        } while (delivery != null);
    }
}