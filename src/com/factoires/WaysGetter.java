package com.factoires;

import com.model.Way;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WaysGetter {

	private static final Map<Way, String> ways = new HashMap<Way, String>() {{
		put(Way.GO_LEFT, Way.GO_LEFT.getLocalisation());
		put(Way.GO_RIGHT, Way.GO_RIGHT.getLocalisation());
		put(Way.GO_AHEAD, Way.GO_AHEAD.getLocalisation());
		put(Way.EXIT, Way.EXIT.getLocalisation());
	}};


	public static Object[] getWays() {
		return ways.values().toArray();
	}

	public static void removeWay(Way way) {
		ways.remove(way);
	}
}
