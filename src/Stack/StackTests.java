package Stack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class StackTests {

    @Test
    public void init_test() {
        Stack<Integer> stacky = new Stack<Integer>();
    }

    @Test
    public void getsize_test() {
        Stack<Integer> stacky = new Stack<Integer>();
        int expected = 0;

        int actualValue = stacky.getSize();
        assertEquals(expected, actualValue);

        stacky.push(1);
        expected = 1;
        actualValue = stacky.getSize();
        assertEquals(expected, actualValue);
    }

    @Test
    public void push_size_justify() {
        Stack<Integer> stacky = new Stack<Integer>();
        int expected = 1;

        stacky.push(1);

        int actualValue = stacky.getSize();
        assertEquals(expected, actualValue);
    }

    @Test
    public void push_data_justify() {
        Stack<Integer> stacky = new Stack<Integer>();
        Object expected = 1;

        stacky.push(1);

        Object actualValue = stacky.peek();
        assertEquals(expected, actualValue);
    }
}
