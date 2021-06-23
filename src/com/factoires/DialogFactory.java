package com.factoires;

import com.io.Dialog;
import com.io.FilePhraseGetter;
import com.io.IDialog;
import com.io.console.ConsoleIn;
import com.io.console.ConsoleOut;

public class DialogFactory {

	public static IDialog get() {

//		return new Dialog(new SimplePhraseGetter(), new ConsoleIn(), new ConsoleOut());
		return new Dialog(new FilePhraseGetter(), new ConsoleIn(), new ConsoleOut());
	}
}
