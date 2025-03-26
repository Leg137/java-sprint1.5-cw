public class HumanTimeCalculator {
    private final double speed = 2.5; // средняя скорость в км/ч
    private final double speedInMS = new SpeedConverter(speed).getSpeedInMs();
    private final String courierName;

    public HumanTimeCalculator(String name) {
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