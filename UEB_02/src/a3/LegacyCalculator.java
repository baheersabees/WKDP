package a3;

public class LegacyCalculator {
    @Deprecated(since = "1.0", forRemoval = true)
    public int add(int a, int b) {
        return a + b;
    }
}
