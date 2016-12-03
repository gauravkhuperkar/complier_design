package tokenization;

public class Addtion implements Expression {
    private final String operatorText;
    private final Expression left;
    private final Expression right;

    public Addtion(String operatorText, Expression left, Expression right) {
        this.operatorText = operatorText;
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return this.right.evaluate() + this.left.evaluate();
    }
}
