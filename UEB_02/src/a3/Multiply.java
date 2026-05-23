package a3;

public class Multiply implements Operation{

    public int calculate(int a, int b){
        return a*b;
    }

    @Override
    public String getDescription() {
        return "Multiplikation";
    }
}
