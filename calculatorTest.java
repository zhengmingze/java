package ch1;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
public class calculatorTest {
	
	@Test
	public void testCapital() {
        String str2 = calculator.capital(50000, 0.01, 10);
     assertThat(str2,is("45264.3477"));
	}
	@Test
	public void testCompound_interest() {
        String str2 = calculator.compound_interest(50000, 0.01, 10);
        assertThat(str2, is("55231.1063"));
	}
	@Test
	public void testSimple_interest() {
		double str=calculator.simple_interest(50000, 0.01, 10);
		assertThat(str, is(55000.0));
	}

	@Test
	public void testTime() {
		int str=calculator.time(50000, 0.01, 100000);
		assertThat(str, is(70));
	}

	@Test
	public void testRate() {
		String str=calculator.rate(50000, 100000, 10);
		assertThat(str, is("0.0718"));
	}

	@Test
	public void testInvest(){
		String str=calculator.invest(50000, 0.01, 10);
		assertThat(str, is("528341.7333"));
	}

	@Test
	public void testRepayment() {
		String str=calculator.repayment(50000, 0.01, 10);
		assertThat(str, is("calculator.repayment.Repayment"));
		assertThat(str, is("460.2592"));
	}

}
