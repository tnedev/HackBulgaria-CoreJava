import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MonotonousTest {
    ArrayList <Integer> listInput; 

    @Before
    public void setUp() throws Exception {
        listInput = new ArrayList <Integer>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        listInput.add(5);
        listInput.add(2);
        listInput.add(1);
        listInput.add(3);
        listInput.add(4);
        
        assertEquals(false, ListFun.monotonous(listInput));
    }
    
    @Test
    public void test2() {
        listInput.add(1);
        listInput.add(1);
        listInput.add(2);
        listInput.add(2);
        listInput.add(3);
        
        assertEquals(true, ListFun.monotonous(listInput));
    }
    
    @Test
    public void test3() {
        listInput.add(10);
        listInput.add(10);
        listInput.add(8);
        listInput.add(8);
        listInput.add(4);
        
        assertEquals(true, ListFun.monotonous(listInput));
    }
    @Test
    public void test4() {
        listInput.add(10);
        listInput.add(10);
        listInput.add(8);
        listInput.add(4);
        listInput.add(8);
        
        assertEquals(false, ListFun.monotonous(listInput));
    }
}
