package org.vasseur.battlecode;

import static org.fest.assertions.api.Assertions.*;

import org.junit.Ignore;
import org.junit.Test;

public class BattleCode2016Test {

	BattleCode2016 battlecode = new BattleCode2016();

	@Test
	public void testSum() {
		assertThat(battlecode.sum(3,2)).isEqualTo(5);
    }

	@Test
	public void badTestSum() {
		assertThat(battlecode.sum(3,3)).isEqualTo(5);
    }

	@Test
	@Ignore
	public void skippedTestSum() {
		assertThat(battlecode.sum(3,3)).isEqualTo(6);
    }

}
