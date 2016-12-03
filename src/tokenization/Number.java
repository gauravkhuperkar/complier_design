package tokenization;

public class Number implements Expression {
    private String number;

    public Number(String  number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return Integer.parseInt(this.number);
    }
}
