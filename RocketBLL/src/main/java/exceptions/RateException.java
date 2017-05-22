package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	private RateDomainModel rates;
	
	public RateException(RateDomainModel ratedomainmodel){
		rates=ratedomainmodel;
	}
	
	public RateDomainModel getrates(){
		return rates;
	}
}