package a1;

public class SixSevenRule implements Rule {
    private String ruleName = "SixSeven Rule";

    @Override
    public boolean computeNextState(boolean currentState, int input) {
        return input == 6 || input == 7;
    }

    @Override
    public void printRuleName() {
        System.out.println(ruleName);
    }

}
