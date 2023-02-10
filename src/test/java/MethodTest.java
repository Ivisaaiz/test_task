import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MethodTest {


    @Test(dataProvider = "positiveCases")
    public void positiveCaseTest(String[] input, String expected) {
        assertEquals(Utils.printEqualStrings(input), expected);
    }

    @DataProvider
    public Object[][] positiveCases() {
        return new Object[][]{
                {new String[]{}, ""},
                {new String[]{"a"}, ""},
                {new String[]{"a", "a"}, "[a]=[0, 1]"},
                {new String[]{"qwe", "wqe", "qwee", "a", "a"}, "[a]=[3, 4][e, q, w]=[0, 1]"},
        };
    }
}
