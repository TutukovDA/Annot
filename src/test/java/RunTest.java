import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class RunTest {
    @Before
    public void before (){
        System.out.println("BeforeClass");
    }
    @After
    public void after(){
        System.out.println("AfterClass");
    }
    @Test
    public void test(){
        Assert.assertEquals(10,10);
        System.out.println("Тест 1");
    }
    @Test
    public void test2(){
        Assert.assertNotEquals(10,10);
        System.out.println("Тест 2");
    }
}