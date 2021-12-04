package org.junit;
import static org.junit.Assert.*;

public class Test {
	static Test test;
	

	    @BeforeClass
	    public static void beforeClass() {
	        System.out.println("@BeforeClass");
	        test = new Test();
	    }

	    @Test
	    public void testInt() {
	        System.out.println("Test");
	        assertEquals(0, test);
	    }

	    @Test
	    public void testString() {
	        System.out.println("Test String");
	        assertEquals(1, test);
	    }

	  
	}


