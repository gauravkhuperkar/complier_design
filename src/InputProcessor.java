import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(args[0]);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while(bufferedReader.readLine() != null) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
