package rocketBase;

import org.junit.Test;
import static org.junit.Assert.*;
import exceptions.RateException;

public class rate_test {
	
	@Test (expected = RateException.class)
	public void rate_2_Test() throws RateException {
		RateBLL.getRate(30);
	}
	
	@Test
	public void RateTest(){
		double pmt = RateBLL.getPayment(0.04, 20, 10000, 36000, false);
		double result = 107.56;
		assertTrue((pmt - result) < 0.01);
	}

}