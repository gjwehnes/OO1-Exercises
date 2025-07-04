import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Ex002Test {

	@Test
	public void test() {
		
		boolean methodFound = false;
		boolean methodStatic = false;		
		int parameterCount = 0;
        boolean correctReturnType = false;
		
		for (Method method : Ex002.class.getMethods()) {
			if (method.getName().equals("beTrue")){
				methodFound = true;
				methodStatic = Modifier.isStatic(method.getModifiers());
				parameterCount = method.getParameterCount();
				correctReturnType = method.getReturnType().equals(boolean.class);
			}
		}
		
		assertEquals(true, methodFound);
		assertEquals(true,methodStatic);
		assertEquals(true,correctReturnType);
		assertEquals(0, parameterCount);
        assertEquals(true,Ex002.beTrue());
		
	}
	
}
