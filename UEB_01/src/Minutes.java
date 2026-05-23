public class Minutes implements TimeUnit {
    private int minutes;

    public Minutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public int getSeconds() {
        return minutes * 60;
    }

}
