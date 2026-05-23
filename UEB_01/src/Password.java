public class Password implements Comparable<String> {
    String value;

    public Password(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(String o) {
        int p1l = this.value.length();
        int p2l = o.length();
        if (p1l != p2l) {
            return p1l - p2l;
        }
        int p1 = p1l + countDigits(this.value);
        int p2 = p2l + countDigits(o);
        return p1 - p2;
    }

    private int countDigits(String o) {
        int a = 0;
        for (int i = 0; i < o.length(); i++) {
            char c = o.charAt(i);
            if (Character.isDigit(c)) {
                a++;
            }
        }
        return a;
    }
}
