package tokenization;

public class Subtraction implements Expression {
    private final String operator;
    private final Expression left;
    private final Expression right;

    public Subtraction(String operator, Expression left, Expression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return this.left.evaluate() - this.right.evaluate();
    }
}
