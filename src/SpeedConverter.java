public class SpeedConverter {
    private final double speed;

    public SpeedConverter(double speedInKmH) {
        speed = speedInKmH;
    }

    public double getSpeedInMs() {
        int metersInKilometer = 1000;
        int minutesInHour = 60;
        return (speed * metersInKilometer) / minutesInHour;
    }
}