class Main {
    public static void main(String[] args) {
        // Beispiel 1: "abc" vs "abcd" - unterschiedliche Länge
        Password p1 = new Password("abc");
        String p2 = "abcd";
        System.out.println("\"abc\" vs \"abcd\": " + p1.compareTo(p2)); // Should print a negative number (abc is shorter)
        
        // Beispiel 2: "abc1" vs "abcd" - gleiche Länge, unterschiedliche Ziffern
        Password p3 = new Password("abc1");
        String p4 = "abcd";
        System.out.println("\"abc1\" vs \"abcd\": " + p3.compareTo(p4)); // Should print a positive number (abc1 has more digits)
        
        // Beispiel 3: "ab12" vs "cd34" - gleiche Länge, gleiche Ziffern
        Password p5 = new Password("ab12");
        String p6 = "cd34";
        System.out.println("\"ab12\" vs \"cd34\": " + p5.compareTo(p6)); // Should print 0 (equal security)
        
        // Beispiel 4: Gleiches Passwort
        String p7 = "ab12";
        System.out.println("\"ab12\" vs \"ab12\": " + p5.compareTo(p7)); // Should print 0 (equal)
        
        // ===== Aufgabe 2 Tests =====
        System.out.println("\n--- Aufgabe 2: TimeUnit & TimeSpan ---");
        
        Time time = new Time();
        
        // Test (a): atLeast(int, TimeUnit) - mit Sekunden
        System.out.println("\n(a) atLeast(int seconds, TimeUnit):");
        Hours h1 = new Hours(1); // 3600 Sekunden
        System.out.println("1 Hour >= 3600 seconds: " + time.atLeast(3600, h1)); // true
        System.out.println("1 Hour >= 3601 seconds: " + time.atLeast(3601, h1)); // false
        
        Minutes m1 = new Minutes(30); // 1800 Sekunden
        System.out.println("30 Minutes >= 1800 seconds: " + time.atLeast(1800, m1)); // true
        System.out.println("30 Minutes >= 1799 seconds: " + time.atLeast(1799, m1)); // true
        
        // Test (b): atLeast(int, char, TimeUnit) - mit Zeiteinheit-Charakter
        System.out.println("\n(b) atLeast(int amount, char c, TimeUnit):");
        TimeSpan ts1 = new TimeSpan(0, 256, 0); // 256 * 60 = 15360 Sekunden
        System.out.println("TimeSpan(0, 256, 0) >= 256 minutes: " + time.atLeast(256, 'm', ts1)); // true
        System.out.println("TimeSpan(0, 256, 0) >= 257 minutes: " + time.atLeast(257, 'm', ts1)); // false
        
        // Mit Sekunden-Charakter 's'
        System.out.println("TimeSpan(0, 256, 0) >= 15360 seconds: " + time.atLeast(15360, 's', ts1)); // true
        System.out.println("TimeSpan(0, 256, 0) >= 15361 seconds: " + time.atLeast(15361, 's', ts1)); // false
        
        // Mit Stunden-Charakter 'h'
        TimeSpan ts2 = new TimeSpan(5, 10, 20); // 5*3600 + 10*60 + 20 = 18620 Sekunden = 5h+ Stunden
        System.out.println("TimeSpan(5, 10, 20) >= 5 hours: " + time.atLeast(5, 'h', ts2)); // true
        System.out.println("TimeSpan(5, 10, 20) >= 6 hours: " + time.atLeast(6, 'h', ts2)); // false
        
        // Test (c): TimeSpan mit verschiedenen Kombinationen
        System.out.println("\n(c) TimeSpan Tests:");
        TimeSpan ts3 = new TimeSpan(1, 0, 0); // 3600 Sekunden
        System.out.println("TimeSpan(1, 0, 0) getSeconds: " + ts3.getSeconds()); // 3600
        System.out.println("TimeSpan(1, 0, 0) >= 1 hour: " + time.atLeast(1, 'h', ts3)); // true
        
        TimeSpan ts4 = new TimeSpan(0, 0, 100); // 100 Sekunden
        System.out.println("TimeSpan(0, 0, 100) getSeconds: " + ts4.getSeconds()); // 100
        System.out.println("TimeSpan(0, 0, 100) >= 100 seconds: " + time.atLeast(100, 's', ts4)); // true
        
        // Test (d): Edge Cases & kombinierte Testfälle
        System.out.println("\n(d) Edge Cases:");
        TimeSpan ts5 = new TimeSpan(2, 30, 45); // 2*3600 + 30*60 + 45 = 9045 Sekunden
        System.out.println("TimeSpan(2, 30, 45) getSeconds: " + ts5.getSeconds()); // 9045
        System.out.println("TimeSpan(2, 30, 45) >= 2 hours: " + time.atLeast(2, 'h', ts5)); // true
        System.out.println("TimeSpan(2, 30, 45) >= 150 minutes: " + time.atLeast(150, 'm', ts5)); // true
        System.out.println("TimeSpan(2, 30, 45) >= 151 minutes: " + time.atLeast(151, 'm', ts5)); // false
        
        // Grenzfall: Exact match
        TimeSpan ts6 = new TimeSpan(0, 10, 0); // 600 Sekunden
        System.out.println("TimeSpan(0, 10, 0) >= 10 minutes (exact): " + time.atLeast(10, 'm', ts6)); // true
    }
}
