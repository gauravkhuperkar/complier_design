import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList inputString = new ArrayList();
        try {
            String text = bufferedReader.readLine();
            while (text != null){
                inputString.add(text);
                text = bufferedReader.readLine();
            }
            inputString.remove(inputString.size()-1);
            System.out.println("my array is "+ inputString);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
