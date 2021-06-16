package com.factoires;

import com.io.Dialog;
import com.io.IDialog;
import com.io.console.ConsoleIn;
import com.io.console.ConsoleOut;
import com.io.console.ConsolePhraseGetter;

public class DialogFactory {

	public static IDialog get() {
		return new Dialog(new ConsolePhraseGetter(), new ConsoleIn(), new ConsoleOut());
	}
}
