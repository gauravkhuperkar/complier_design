import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class InputProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String inputString = new String();
        try {
            String text = bufferedReader.readLine();
            while (text != null){
                inputString = inputString.concat(text);
                System.out.println(text);
                text = bufferedReader.readLine();
            }
            Scanner scanner  = new Scanner(inputString);
            String[] tokens = scanner.makeTokens();
            System.out.println("my array is "+ inputString);
            System.out.println("my tokens are "+ tokens);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
