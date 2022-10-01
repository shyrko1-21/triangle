import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleTest {
    private Triangle triangle;

    @DataProvider
    public Object[][] testDataIsDataValid() {
        return new Object[][]{
                new Object[]{"5", "5", "5", true},
                new Object[]{"-1", "-2", "-3", false},
                new Object[]{"1", "2", "-3", false},
                new Object[]{"1", "2", "X", false}
        };
    }

    @DataProvider
    public Object[][] testDataIsTriangle() {
        return new Object[][]{
                new Object[]{1, 2, 4, false},
                new Object[]{5, 9, 10, true}
        };
    }

    @DataProvider
    public Object[][] testDataIsIsoscelesTriangle() {
        return new Object[][]{
                new Object[]{2, 4, 5, false},
                new Object[]{4, 4, 2, true}
        };
    }

    @DataProvider
    public Object[][] testDataIsEquilateralTriangle() {
        return new Object[][]{
                new Object[]{4, 4, 5, false},
                new Object[]{5, 5, 5, true}
        };
    }

    @BeforeTest
    public void setUp() {
        triangle = new Triangle();
    }

    @Test(dataProvider = "testDataIsDataValid")
    public void testIsDataValid(String a, String b, String c, boolean result) {
        boolean actResult = triangle.isDataValid(a, b, c);
        Assert.assertEquals(actResult, result);
    }

    @Test(dataProvider = "testDataIsTriangle")
    public void testIsTriangle(int a, int b, int c, boolean result) {
        boolean actResult = triangle.isTriangle(a,b,c);
        Assert.assertEquals(actResult, result);
    }

    @Test(dataProvider = "testDataIsIsoscelesTriangle")
    public void testIsIsoscelesTriangle(int a, int b, int c, boolean result) {
        boolean actResult = triangle.isIsoscelesTriangle(a,b,c);
        Assert.assertEquals(actResult, result);
    }

    @Test(dataProvider = "testDataIsEquilateralTriangle")
    public void testIsEquilateralTriangle(int a, int b, int c, boolean result) {
        boolean actResult = triangle.isEquilateralTriangle(a,b,c);
        Assert.assertEquals(actResult, result);
    }
}
