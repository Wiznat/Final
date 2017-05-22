package rocketBase;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void RateTester() {
		ArrayList<RateDomainModel> Rate = RateDAL.getAllRates();
		assertTrue(Rate.size() > 0);
	}
}