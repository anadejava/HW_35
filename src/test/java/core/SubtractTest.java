package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SubtractTest {
	@Test
	public void add_test_instanceOf() {
		assertThat(Calculator.subtract(8, 2), instanceOf(Double.class));
	}

	@Test
	public void add_test_2_param() {
		assertThat(Calculator.subtract(6, 2), equalTo(4.0));
	}

	@Test
	public void add_test_3_param() {
		assertThat(Calculator.subtract(20, 2, 2), equalTo(16.0));
	}

	@Test
	public void add_test_4_param() {
		assertThat(Calculator.subtract(20, 2, 2, 2), equalTo(14.0));
	}
}