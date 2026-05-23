package a1;

public class Cell {
    private boolean state;
    private Rule regel;

    public Cell(boolean state, Rule regel) {
        this.state = state;
        this.regel = regel;
    }

    public void nextState(int input) {
        state = regel.computeNextState(state, input);
    }

    public void printState() {
        System.out.println("Status ist: " + state);
    }

    public void printMyRule() {
        regel.printRuleName();
    }
}
