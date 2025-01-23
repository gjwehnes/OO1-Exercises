import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import java.util.ArrayList;
import java.util.List;

public class Ex004Test {

	@Test
	public void testAdd() {
		Ex004 a = new Ex004();
		assertEquals(11,a.add(5,6));
		assertEquals(42,a.add(32,10));
		assertEquals(-5,a.add(-10,5));
	}

    
	@Test
	public void testAttributes() {

		boolean methodFound = false;
		boolean methodStatic = false;		
		int parameterCount = 0;
        boolean returnTypeCorrect = false;
        boolean parameterTypeCorrect = false;
        boolean parameterNameCorrect = false;
		
		for (Method method : Ex004.class.getMethods()) {
			if (method.getName().equals("add")){
				methodFound = true;
				methodStatic = Modifier.isStatic(method.getModifiers());
				parameterCount = method.getParameterCount();
				returnTypeCorrect = method.getReturnType().equals(long.class);
				Parameter parameter0 = method.getParameters()[0];
				Parameter parameter1 = method.getParameters()[1];
				parameterTypeCorrect = parameter0.getType().equals(long.class) && parameter1.getType().equals(long.class);
				parameterNameCorrect = parameter0.getName().equals("x") && parameter1.getName().equals("y");
			}
		}
		
		assertEquals(true, methodFound);
		assertEquals(false,methodStatic);
		assertEquals(true,returnTypeCorrect);
		assertEquals(2, parameterCount);
		assertEquals(true,parameterTypeCorrect);      
	}
}
