package tiger.api.test.runner;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
	
	public Karate runTest() {
		return Karate.run("classpath:features")
				.tags("@smoke");
	}

}
