public class DeliveryInfo {
    private final String name;
    private final long time;

    public DeliveryInfo(String deliveryName, long deliveryTime) {
        name = deliveryName;
        time = deliveryTime;
    }

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }
}