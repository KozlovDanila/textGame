package com.model;

public enum Way {
	GO_AHEAD("вперед"),
	GO_LEFT("налево"),
	GO_RIGHT("направо"),
	EXIT("выйти");

	private final String localisation;

	Way(String localisation) {
		this.localisation = localisation;
	}

	public String getLocalisation() {
		return localisation;
	}

	public static Way valueOfByLocalise(String value) {
		switch (value) {
			case "вперед":
				return GO_AHEAD;
			case "налево":
				return GO_LEFT;
			case "направо":
				return GO_RIGHT;
			default:
				return EXIT;
		}
	}
}
