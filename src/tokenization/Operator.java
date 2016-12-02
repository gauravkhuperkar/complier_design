package tokenization;

public class Operator {
    private String opertor;
    private Number left;
    private Number right;

    public Operator(String opertor, Number left, Number right) {
        this.opertor = opertor;
        this.left = left;
        this.right = right;
    }

    public int evalute() {
        return 1;
    }
}
