import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DynamicArrayTests extends Assert {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void init_DefaultArraySize() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        int actualValue = dArr.getSize();

        assertEquals(5, actualValue);
    }

    @Test
    public void init_CustomArraySize_10() {
        // positive test

        DynamicArray dArr = new DynamicArray(10);

        int actualValue = dArr.getSize();

        assertEquals(10, actualValue);
    }

    @Test
    public void init_CustomArraySize_NegativeSize() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.negativeArraySize);

        DynamicArray dArr = new DynamicArray(-1);
    }

    @Test
    public void setValue_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 69420);
        Object actualValue = dArr.getValue(1);

        assertEquals(69420, actualValue);
    }

    @Test
    public void setValue_String() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, "69420");
        Object actualValue = dArr.getValue(1);

        assertEquals("69420", actualValue);
    }

    @Test
    public void setValue_IndexGreaterThanArrayLength() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray();
        dArr.setValue(10, "lala");
    }

    @Test
    public void setValue_IndexLessThanZero() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Wrong index");

        DynamicArray dArr = new DynamicArray();
        dArr.setValue(-1, "lala");
    }

    @Test
    public void resize_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.resize(69420);
        int actualValue = dArr.getSize();

        assertEquals(69420, actualValue);
    }

//    @Test
//    public void resize_NewArrayIsTheSame() {
//        // positive test
//
//        // tests
//    }

    @Test
    public void resize_NewSizeLessThanZero() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.negativeArraySize);

        DynamicArray dArr = new DynamicArray();
        dArr.resize(-1);
    }

    @Test
    public void getValue_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 69420);
        Object actualValue = dArr.getValue(1);

        assertEquals(69420, actualValue);
    }

    @Test
    public void getValue_String() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, "69420");
        Object actualValue = dArr.getValue(1);

        assertEquals("69420", actualValue);
    }

    @Test
    public void getValue_null() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        Object actualValue = dArr.getValue(1);

        assertEquals(null, actualValue);
    }

    @Test
    public void getValue_IndexLessThanZero() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray();
        dArr.getValue(-1);
    }

    @Test
    public void getSize_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray(69420);

        int actualValue = dArr.getSize();

        assertEquals(69420, actualValue);
    }
}
