package org.vasseur.battlecode;

import static org.fest.assertions.api.Assertions.*;

import org.junit.Test;

public class BattleCode2016Test {

	BattleCode2016 battlecode = new BattleCode2016();

	@Test
	public void testSum() {
		assertThat(battlecode.sum(3,2)).isEqualTo(5);
    }

}
