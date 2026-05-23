package a1;

public class main {

    public static void testCellBehavior(boolean initialState, Rule rule) {
        Cell cell = new Cell(initialState, rule);
        cell.printMyRule();
        cell.printState();

        for (int i = 1; i < 6; i++) {
            System.out.println("Aenderung Nummer / Uebergabewert: " + i);
            cell.nextState(i);
            cell.printState();
        }
    }

    public static void testCellBehavior(boolean initialState, Rule regel, int z) {
        Cell cell = new Cell(initialState, regel);
        cell.printMyRule();
        cell.printState();

        for (int i = 1; i < z + 1; i++) {
            System.out.println("Aenderung Nummer / Uebergabewert: " + i);
            cell.nextState(i);
            cell.printState();
        }
    }

    public static void main(String[] args) {
        Rule toggle = new ToggleRule();
        testCellBehavior(true, toggle);
    }
    
}
