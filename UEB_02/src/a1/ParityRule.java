package a1;

public class ParityRule implements Rule {
    private String ruleName = "Parity Rule";

    @Override
    public boolean computeNextState(boolean currentState, int input) {
        return (input % 2 == 0) ? true : !currentState;
    }

    @Override
    public void printRuleName() {
        System.out.println(ruleName);
    }
}
