public class Hours implements TimeUnit{
    private int hours;

    public Hours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getSeconds() {
        return hours * 3600;
    }
}
