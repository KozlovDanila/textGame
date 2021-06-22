package com.game;

import com.model.Skill;

import java.util.List;

public interface IMotion {

	MotionInfo motion(List<Skill> skills, int attack);
}
