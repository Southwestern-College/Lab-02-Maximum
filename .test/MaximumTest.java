import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MaximumTest extends ConsoleTestBase {

    @ParameterizedTest
    @CsvSource({
        "1,2,3,3",
        "1,3,2,3",
        "2,1,3,3",
        "2,3,1,3",
        "3,1,2,3",
        "3,2,1,3",
        "1,2,2,2",
        "2,1,2,2",
        "2,2,1,2",
        "2,2,2,2",
        "-3,-2,-1,-1"
    })
    void testMaximumProgram(int a, int b, int c, int expected) {

        provideInput(a + "\n" + b + "\n" + c + "\n");

        Maximum.main(new String[]{});

        String output = getOutput();

        assertTrue(output.contains(String.valueOf(expected)),
                "\nExpected: " + expected +
                "\nActual output:\n" + output);
    }
}
