import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ReverseTest {
    ArrayList <Integer> listInput; 
    ArrayList <Integer> listOutput;
    ArrayList <Integer> listTest;

    @Before
    public void setUp() throws Exception {
        listInput = new ArrayList <Integer>();
        listOutput = new ArrayList <Integer>();
        listTest = new ArrayList <Integer>();
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
        
        listTest.add(4);
        listTest.add(3);
        listTest.add(1);
        listTest.add(2);
        listTest.add(5);
        
        listOutput = (ArrayList<Integer>) ListFun.reverse(listInput);
        assertEquals(listTest, listOutput);
    }
    @Test
    public void test2() {
        listInput.add(124);
        listInput.add(0);
        listInput.add(13);
        listInput.add(1024);
        listInput.add(1024);
        listInput.add(4);
        
        listTest.add(4);
        listTest.add(1024);
        listTest.add(1024);
        listTest.add(13);
        listTest.add(0);
        listTest.add(124);
        
        listOutput = (ArrayList<Integer>) ListFun.reverse(listInput);
        assertEquals(listTest, listOutput);
    }
}