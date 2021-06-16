package com.factoires;

import com.model.Monster;
import com.model.Way;
import java.util.ArrayList;

public class MonsterFactory {

	public static Monster get(Way way) {
		switch (way) {
			case GO_AHEAD:
				return new Monster("1", 1, new ArrayList<>());
			case GO_LEFT:
				return new Monster("2", 1, new ArrayList<>());
			case GO_RIGHT:
				return new Monster("3", 1, new ArrayList<>());
			default:
				return new Monster("4", 1, new ArrayList<>());
		}
	}
}
