import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCisloVCisle {

	private CisloVCisle cisloVCisle;

	@Before
	public void setup() {
		cisloVCisle = new CisloVCisleImplementacia();

	}

	@Test
	public void testZrataj() {
		assertEquals(2, this.cisloVCisle.zrataj( 7, 717 ));
		assertEquals(1, this.cisloVCisle.zrataj( 7, 7 ));
		assertEquals(0, this.cisloVCisle.zrataj( 7, 123 ));
		assertEquals(1, this.cisloVCisle.zrataj( 1, 717 ));

	}

	public static void main(String[] args) {
		TestCisloVCisle tst = new TestCisloVCisle();
		tst.setup();
		tst.testZrataj();
	}
}
