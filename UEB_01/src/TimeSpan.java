public class TimeSpan implements TimeUnit {
    public Hours hours;
    public Minutes minutes;
    public Seconds seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = new Hours(hours);
        this.minutes = new Minutes(minutes);
        this.seconds = new Seconds(seconds);
    }

    @Override
    public int getSeconds() {
        return hours.getSeconds() + minutes.getSeconds() + seconds.getSeconds();
    }
}
