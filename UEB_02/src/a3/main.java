package a3;
@SuppressWarnings({ "deprecation", "removal" })
public class main {
    
    public static void main(String[] args) {
        // add and multiply test
        Add add = new Add();
        System.out.println(add.getDescription() + ": " + add.calculate(1, 2)); // Addition: 3
        Multiply multiply = new Multiply();
        System.out.println(multiply.getDescription() + ": " + multiply.calculate(3, 4)); // Multiplikation: 12
        
        LegacyCalculator legacyCalculator = new LegacyCalculator();
        
        System.out.println("Legacy add: " + legacyCalculator.add(5, 6)); // Legacy add: 11
    }
}
