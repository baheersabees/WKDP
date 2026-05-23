package a1;

public class RandomRule implements Rule {
    private String ruleName = "Random Rule";

    @Override
    public boolean computeNextState(boolean currentState, int input) {
        return Math.random() > 0.5;
    }

    @Override
    public void printRuleName() {
        System.out.println(ruleName);
    }
}
