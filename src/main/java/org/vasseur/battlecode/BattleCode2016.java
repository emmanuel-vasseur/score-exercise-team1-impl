package org.vasseur.battlecode;

import org.vasseur.battlecode.IBattleCode2016;

public class BattleCode2016 implements IBattleCode2016 {

	public int sum(int x, int y) {
		if (x == 0) {
			return y;
		} else if (y == 0) {
			return x;
		} else {
			return x + y;
		}
	}

}
