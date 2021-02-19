import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DynamicArrayTests extends Assert {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    //  -- init tests --

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
        thrown.expectMessage(DynamicArray.negativeArraySizeError);

        DynamicArray dArr = new DynamicArray(-1);
    }

    //  -- /init tests --


    //  -- set tests --

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
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray();
        dArr.setValue(-1, "lala");
    }

    //  -- /set tests --


    //  -- resize tests --
    @Test
    public void resize_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.resize(69420);
        int actualValue = dArr.getSize();

        assertEquals(69420, actualValue);
    }

    @Test
    public void resize_NewSizeLessThanZero() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.negativeArraySizeError);

        DynamicArray dArr = new DynamicArray();
        dArr.resize(-1);
    }

    //  -- /resize tests --


    //  -- get tests --

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

    //  -- /get tests --


    //  -- findFirst tests --

    @Test
    public void findFirst_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 69420);
        int actualValue = dArr.findFirst(69420);

        assertEquals(1, actualValue);
    }

    @Test
    public void findFirst_int_10() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 10);
        int actualValue = dArr.findFirst(10);

        assertEquals(1, actualValue);
    }

    @Test
    public void findFirst_int_010() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 010);
        int actualValue = dArr.findFirst(010);

        assertEquals(1, actualValue);
    }

    @Test
    public void findFirst_NotExisting() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.noSuchElementError);

        DynamicArray dArr = new DynamicArray();
        dArr.findFirst("haha");
    }

    //  -- /findFirst tests --


    //  -- findLast tests --

    @Test
    public void findLast_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 69420);
        int actualValue = dArr.findLast(69420);

        assertEquals(1, actualValue);
    }

    @Test
    public void findLast_int_10() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 10);
        int actualValue = dArr.findLast(10);

        assertEquals(1, actualValue);
    }

    @Test
    public void findLast_int_010() {
        // positive test

        DynamicArray dArr = new DynamicArray();

        dArr.setValue(1, 010);
        int actualValue = dArr.findLast(010);

        assertEquals(1, actualValue);
    }

    @Test
    public void findLast_NotExisting() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.noSuchElementError);

        DynamicArray dArr = new DynamicArray();
        dArr.findLast("haha");
    }

    //  -- /findLast tests --


    //  -- addValue tests --

    @Test
    public void addValue_arraySize() {
        // positive test

        DynamicArray dArr = new DynamicArray(10);

        dArr.addValue(1);
        int actualValue = dArr.getSize();

        assertEquals(11, actualValue);
    }

    @Test
    public void addValue_appendedValueIndex() {
        // positive test

        DynamicArray dArr = new DynamicArray(5);

        dArr.addValue(1);
        int actualValue = dArr.findFirst(1);

        assertEquals(5, actualValue);
    }

    @Test
    public void addValue_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray(5);

        dArr.addValue(1);
        Object actualValue = dArr.getValue(5);

        assertEquals(1, actualValue);
    }

    //  -- /addValue tests --


    //  -- insertValue tests --

    @Test
    public void insertValue_arraySize() {
        // positive test

        DynamicArray dArr = new DynamicArray(6);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.insertValue(2, 69420);
        int actualValue = dArr.getSize();

        assertEquals(7, actualValue);
    }

    @Test
    public void insertValue_insertedElementIndex() {
        // positive test

        DynamicArray dArr = new DynamicArray(6);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.insertValue(2, 69420);
        int actualValue = dArr.findFirst(69420);

        assertEquals(2, actualValue);
    }

    @Test
    public void insertValue_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray(6);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.insertValue(2, 69420);
        Object actualValue = dArr.getValue(2);

        assertEquals(69420, actualValue);
    }

    @Test
    public void insertValue_NegativeIndex() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray();
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.insertValue(-1, 69420);
    }

    @Test
    public void insertValue_IndexGreaterArrayLength() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray(10);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.insertValue(11, 69420);
    }

    @Test
    public void insertValue_IndexEqualsArrayLength() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray(10);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.insertValue(10, 69420);
    }

    //  -- /insertValue tests --


    //  -- removeValue tests --

    @Test
    public void removeValue_arraySize() {
        // positive test

        DynamicArray dArr = new DynamicArray(6);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.removeValue(2);
        int actualValue = dArr.getSize();

        assertEquals(5, actualValue);
    }

    @Test
    public void removeValue_int_69420() {
        // positive test

        DynamicArray dArr = new DynamicArray(6);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, 69420);
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.removeValue(2);
        Object actualValue = dArr.getValue(2);

        assertEquals(2, actualValue);
    }

    @Test
    public void removeValue_NegativeIndex() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray();
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.removeValue(-1);
    }

    @Test
    public void removeValue_IndexGreaterArrayLength() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray(10);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.removeValue(11);
    }

    @Test
    public void removeValue_IndexEqualsArrayLength() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.wrongIndexError);

        DynamicArray dArr = new DynamicArray(10);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.removeValue(10);
    }

    @Test
    public void removeValue_removedElementIndex() throws RuntimeException {
        // negative test

        thrown.expect(RuntimeException.class);
        thrown.expectMessage(DynamicArray.noSuchElementError);

        DynamicArray dArr = new DynamicArray(6);
        dArr.setValue(0, "garbage");
        dArr.setValue(1, "garbage");
        dArr.setValue(2, "gotcha");
        dArr.setValue(3, 2);
        dArr.setValue(4, "garbage");

        dArr.removeValue(2);
        int actualValue = dArr.findFirst(69420);
    }

    //  -- /removeValue tests --
}
