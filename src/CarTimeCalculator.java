public class CarTimeCalculator {
    private final double speed = 25; // средняя скорость в км/ч
    private final double speedInMS = new SpeedConverter(speed).getSpeedInMs();
    private final String courierName;

    public CarTimeCalculator(String name) {
        courierName = name;
    }

    public long getDeliveryTime(int distanceInMeters) {
        if (distanceInMeters <= 0) {
            return 1;
        }
        return (int)Math.ceil(distanceInMeters / speedInMS);
    }

    public String getCourierName() {
        return courierName;
    }
}