package com.microservice.es.ddd.cqrs.tms.common.trainer;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ClientTest  {
	
	private static final String CLIENT_NAME = "Pool Weight Lifting Club";

	@Test
	public void ClientShouldHaveName(){
		Client client = new Client();
		client.setClientName(CLIENT_NAME);
		
		assertEquals(CLIENT_NAME, client.getClientName());
		
	}

}
