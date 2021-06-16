package com.io.console;

import com.io.IN;
import java.util.Scanner;

public class ConsoleIn implements IN {

	private static final Scanner scanner = new Scanner(System.in);

	@Override
	public String in() {
		return scanner.next();
	}
}
