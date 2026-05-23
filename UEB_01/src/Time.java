public class Time {
    public boolean atLeast(int amount, TimeUnit unit) {
        return unit.getSeconds() >= amount;
    }

    public boolean atLeast(int amount, char c, TimeUnit unit) {
        if (c == 's') {
            return unit.getSeconds() >= amount;
        } else if (c == 'm') {
            return unit.getSeconds() >= amount * 60;
        } else if (c == 'h') {
            return unit.getSeconds() >= amount * 3600;
        } else {
            throw new IllegalArgumentException("Invalid time unit character: " + c);
        }
    }
}
