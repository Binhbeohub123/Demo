import org.example.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {

    @Test
    public void testSum(){
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sum(2,3),5);
    }

    @Test
    public void testSub(){
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sub(2,2),0);
    }
}
