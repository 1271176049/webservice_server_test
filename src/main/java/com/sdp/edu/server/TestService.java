package com.sdp.edu.server;

public class TestService implements TestServiceInf {

	@Override
	public String test(String string) {
		System.err.println(string);
		return string;
	}

}
