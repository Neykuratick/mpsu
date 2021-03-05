import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class DLinkedListTests extends Assert {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    // -- name --



    // -- /name --







    //  -- init tests --

    @Test
    public void list_create() {
        // positive test

        DLinkedList list = new DLinkedList();
    }

    @Test
    public void list_create_listSize() {
        // positive test

        DLinkedList list = new DLinkedList();

        int actual = list.size;
        int expected = 0;
        assertEquals(actual, expected);
    }

    //  -- /init tests --

    // -- push --

    @Test
    public void push_listSize() {
        // positive test

        DLinkedList list = new DLinkedList();

        list.push(1);

        int actual = list.size;
        int expected = 1;
        assertEquals(actual, expected);

        list.push(1);
        list.push(1);
        list.push(1);

        actual = list.size;
        expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    public void push_value_proof() {
        // positive test

        DLinkedList list = new DLinkedList();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        Object expected = 1;
        Object actual = list.getValueIndex(3);
        assertEquals(actual, expected);

        expected = 2;
        actual = list.getValueIndex(2);
        assertEquals(actual, expected);

        expected = 3;
        actual = list.getValueIndex(1);
        assertEquals(actual, expected);

        expected = 4;
        actual = list.getValueIndex(0);
        assertEquals(actual, expected);
    }

    // -- /push --
}
