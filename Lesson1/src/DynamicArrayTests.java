import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DynamicArrayTests extends Assert {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void init_DefaultArraySize_5() {
        DynamicArray dArr = new DynamicArray();
        int actualValue = dArr.getLength();
        assertEquals(5, actualValue);
    }

    @Test
    public void init_CustomArraySize_10() {
        DynamicArray dArr = new DynamicArray(10);
        int actualValue = dArr.getLength();
        assertEquals(10, actualValue);
    }

    @Test
    public void init_CustomArraySize_NegativeSize() throws RuntimeException {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Size of the array must be over -1");

        DynamicArray dArr = new DynamicArray(-1);
    }

    @Test
    public void setValue_int() {
        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 10);
        Object actualValue = dArr.getValue(1);

        assertEquals(10, actualValue);
    }

    @Test
    public void setValue_String() {
        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, "lala");
        Object actualValue = dArr.getValue(1);

        assertEquals("lala", actualValue);
    }

    @Test
    public void setValue_IndexGreaterThanArrayLength() throws RuntimeException {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Wrong index");

        DynamicArray dArr = new DynamicArray();
        dArr.setValue(10, "lala");
    }

    @Test
    public void setValue_IndexLessThanZero() throws RuntimeException {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Wrong index");

        DynamicArray dArr = new DynamicArray();
        dArr.setValue(-1, "lala");
    }
}
