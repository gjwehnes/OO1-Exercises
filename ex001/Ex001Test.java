import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Ex001Test {

	@Test
	public void test() {

		boolean methodFound = false;
		boolean methodStatic = false;		
        boolean correctReturnType = false;
		int parameterCount = 0;
		
		for (Method method : Ex001.class.getMethods()) {
			if (method.getName().equals("getAnswer")){
				methodFound = true;
				methodStatic = Modifier.isStatic(method.getModifiers());
				parameterCount = method.getParameterCount();
				correctReturnType = method.getReturnType().equals(int.class);
			}
		}
		
		assertEquals(true, methodFound);
		assertEquals(false,methodStatic);
		assertEquals(true,correctReturnType);
		assertEquals(0, parameterCount);

        Ex001 ex001 = new Ex001();
		assertEquals(42, ex001.getAnswer());
	
	}
}
