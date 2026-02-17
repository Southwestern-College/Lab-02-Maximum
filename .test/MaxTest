import java.io.*;
import java.util.Scanner;

public class MaxTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("maximum-input.txt"));
        input.useDelimiter("//Z");
        String read = input.next();

        for (int i = 0; i < 11; i++) {
            System.out.printf("**************** Test %d ****************%n", i);
            InputStream stream = new ByteArrayInputStream(read.getBytes());
            stream.skip(9*i);
            System.setIn(stream);
            Maximum.main(null);

        }


    }
}
