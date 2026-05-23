package a1;

public class ToggleRule implements Rule {
    private String ruleName = "Toggle Rule";

    @Override
    public boolean computeNextState(boolean currentState, int input) {
        return !currentState;
    }

    @Override
    public void printRuleName() {
        System.out.println(ruleName);
    }
}
