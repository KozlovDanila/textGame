package com.io.console;

import com.io.OUT;

public class ConsoleOut implements OUT {

	@Override
	public void out(String value) {
		System.out.println(value);
	}

}
