import java.util.Collection;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class CheckIsAdultTest  {
    private int age;
    private boolean expectedResult;

    public CheckIsAdultTest(int age, boolean expectedResult) {
    this.age = age;
    this.expectedResult = expectedResult;
}

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {16, false},  // Age less than 18
                {18, true},   // Age exactly 18
                {20, true},   // Age more than 18 in some countries
                {21, true}    // Age more than 18
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Unexpected result for age: " + age, expectedResult, isAdult);
    }
}import java.util.Collection;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class CheckIsAdultTest  {
    private int age;
    private boolean expectedResult;

    public CheckIsAdultTest(int age, boolean expectedResult) {
    this.age = age;
    this.expectedResult = expectedResult;
}

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {16, false},  // Age less than 18
                {18, true},   // Age exactly 18
                {20, true},   // Age more than 18 in some countries
                {21, true}    // Age more than 18
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Unexpected result for age: " + age, expectedResult, isAdult);
    }
}
