package ${groupId};

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


@SuppressWarnings("RedundantThrows")
public class AppTest {

	@Test
	public void test() throws Exception {
		String val = "sample";
		assertThat(val)
				.as("assertion sample.")
				.isNotEmpty();
	}

}
