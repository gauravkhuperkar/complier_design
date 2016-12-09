public class Scanner {
    private String inputString;

    public Scanner(String inputString) {
        this.inputString = inputString;
    }

    public String[] makeTokens () {
        return this.inputString.split(";");
    }
}
