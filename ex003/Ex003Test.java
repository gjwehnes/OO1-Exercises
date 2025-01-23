import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Ex003Test {

	@Test
	public void test() {

		boolean methodFound = false;
		boolean methodStatic = false;		
		int parameterCount = 0;
        boolean returnTypeCorrect = false;
        boolean parameterTypeCorrect = false;
        boolean parameterNameCorrect = false;
		
		for (Method method : Ex003.class.getMethods()) {
			if (method.getName().equals("makeAllCaps")){
				methodFound = true;
				methodStatic = Modifier.isStatic(method.getModifiers());
				parameterCount = method.getParameterCount();
				returnTypeCorrect = method.getReturnType().equals(String.class);
				Parameter parameter = method.getParameters()[0];
				parameterTypeCorrect = parameter.getType().equals(String.class);
				parameterNameCorrect = parameter.getName().equals("input");
			}
		}
		
		assertEquals(true, methodFound);
		assertEquals(false,methodStatic);
		assertEquals(true,returnTypeCorrect);
		assertEquals(1, parameterCount);
		assertEquals(true,parameterTypeCorrect);
        //cannot be currently assessed; see https://stackoverflow.com/questions/6759880/getting-the-name-of-a-method-parameter/6759953#6759953
		//assertEquals(true,parameterNameCorrect);
        
    	Ex003 a = new Ex003();
    	assertEquals("CONVERT MIXED CASE",a.makeAllCaps("cOnVeRt MiXeD cAsE"));
    	assertEquals("TEST ANOTHER STRING",a.makeAllCaps("TEST another STRING"));
	}
}
