package rpn;

import java.util.Stack;

public class Divide implements Operator {

    private String value;

    Divide(String value) {
        this.value = value;
    }

    @Override
    public Stack<Double> calculate(Stack<Double> tokenStack) {
        Double a = tokenStack.pop();
        Double b = tokenStack.pop();

        tokenStack.push(b / a);

        return tokenStack;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
