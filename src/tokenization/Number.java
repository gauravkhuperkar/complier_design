package tokenization;

public class Number {
    private String number;

    public Number(String  number) {
        this.number = number;
    }

    public int evalute() {
        return Integer.parseInt(this.number);
    }
}
