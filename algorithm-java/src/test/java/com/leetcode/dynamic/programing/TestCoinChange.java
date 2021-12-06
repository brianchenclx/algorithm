package com.leetcode.dynamic.programing;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestCoinChange {

	@Test
	public void testCoinChange() {
		int[] coins = new int[]{1, 2, 5};
		int amount = 11;
		int result = CoinChange.coinChange(coins, amount);
		System.out.println("result:" + result);
	}

	@Test
	public void testCoinChangeByLoop() {
		int[] coins = new int[]{1, 2, 5};
		int amount = 11;
		int result = CoinChange.coinChangeByLoop(coins, amount);
		System.out.println("result:" + result);
	}
}
