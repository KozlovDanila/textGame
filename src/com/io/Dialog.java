package com.io;

public class Dialog implements IDialog {

	private final IPhraseGetter phraseGetter;
	private final IN in;
	private final OUT out;

	public Dialog(IPhraseGetter phraseGetter, IN in, OUT out) {
		this.phraseGetter = phraseGetter;
		this.in = in;
		this.out = out;
	}

	@Override
	public void out(Phrase phrase, String... args) {
		String s = phraseGetter.get(phrase);
		if (s != null) {
			out.out(String.format(s, args));
		}
	}

	@Override
	public String in() {
		return in.in();
	}
}
