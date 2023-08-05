public class SpeedConverter {
    private final double speed;

    public SpeedConverter(double speedInKmH) {
        speed = speedInKmH;
    }

    public double getSpeedInMs() {
        int minutesInHour = 60;
        int metersInKilometer = 1000;
        return (speed * metersInKilometer) / minutesInHour;
    }
}