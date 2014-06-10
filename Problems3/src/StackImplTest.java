import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StackImplTest {
    StackImpl myStack;
    @Before
    public void setUp() throws Exception {
        myStack = new StackImpl(10);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals(true, myStack.isEmpty());
    }
    @Test
    public void test2() {
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        assertEquals(2, myStack.pop());
    }
    @Test
    public void test3() {
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.clear();
        assertEquals(true, myStack.isEmpty());
    }
    @Test
    public void test4(){
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(3, myStack.peak());
    }
    @Test
    public void test5(){
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(4, myStack.length());
    }
    
    @Test
    public void test6(){
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.pop();
        assertEquals(2, myStack.pop());
    }

}
