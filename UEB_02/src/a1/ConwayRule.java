package a1;

public class ConwayRule implements Rule {
    private String ruleName = "Conway's Game of Life Rule";

    @Override
    public boolean computeNextState(boolean currentState, int input) {
        if (currentState) {
            return (input == 2 || input == 3);
        } else {
            return (input == 3);
        }
    }

    @Override
    public void printRuleName() {
        System.out.println(ruleName);
    }
}
