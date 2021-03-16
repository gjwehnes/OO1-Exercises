import java.util.List;
import org.junit.runner.*;

public class Main {

	static JUnitCore core = new JUnitCore();
	static int totalRunCount = 0;
	static int totalFailureCount = 0;
	static ClassLoader classLoader = Main.class.getClassLoader();;

	public static void main(String[] args) {

		runTest("ex001.MainTest");
		runTest("ex002.MainTest");
		runTest("ex003.MainTest");
		runTest("ex004.MainTest");
		runTest("ex005.MainTest");
		runTest("ex006.StudentTest");
		runTest("ex007.BicycleTest");
		runTest("ex008.DogTest");
		runTest("ex009.CarTest");
		runTest("ex010.StoreProductTest");
		runTest("ex011.StockTest");
		runTest("ex012.PersonTest");
		runTest("ex013.InchWormTest");
		runTest("ex014.StringFormatterTest");

		System.out.println("*** TOTAL ***");
		System.out.println(String.format("[%10d tests started         ]", totalRunCount));
		System.out.println(String.format("[%10d tests passed          ]", totalRunCount - totalFailureCount));
		System.out.println(String.format("[%10d tests failed          ]", totalFailureCount));

	}

	private static void runTest(String className) {		
		
		Class testClass = null;
		
		try {
			testClass = classLoader.loadClass(className);
		} catch (ClassNotFoundException e) {
		}

		System.out.println("*** " + className + " ***");

		if (testClass == null) {
			System.out.println("Test could not be loaded");
            totalRunCount += 1;
			totalFailureCount += 1;
		}
		else {
			Result result = core.run(testClass);

			List<org.junit.runner.notification.Failure> failures = result.getFailures();

			if (failures.size() > 0) {
				System.out.println(String.format("Failures (%d)", failures.size()));
				for (org.junit.runner.notification.Failure failure : failures) {
					System.out.println("Test:   " + failure.getTestHeader());
					System.out.println("Msg:    " + failure.getMessage());

					String[] trace = failure.getTrace().split("\\r?\\n");
					for (int i = 0; i < trace.length; i++) {
						if (trace[i].contains(className)) {
							System.out.println("Trace:  " + trace[i]);
						}
					}
				}
			}

			System.out.println(String.format("Test run finished after %d ms", result.getRunTime()));
			System.out.println(String.format("[%10d tests started         ]", result.getRunCount()));
			System.out.println(String.format("[%10d tests passed          ]", result.getRunCount() - result.getFailureCount()));
			System.out.println(String.format("[%10d tests failed          ]", result.getFailureCount()));
			
			totalRunCount += result.getRunCount();
			totalFailureCount += result.getFailureCount();
		}		

	}

}
