package com.leetcode;

import com.leetcode.util.ArrayUtils;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestRemoveElement {

	@Test
	public void testRemoveBruteForce() {
		// case 1
		int[] caseOne = {3, 2, 2, 3};
		System.out.println(RemoveElement.removeElementBruteForce(caseOne, 3));
		ArrayUtils.printArray(caseOne);
		// case 2
		int[] caseTwo = {0, 1, 2, 2, 3, 0, 4, 2};
		System.out.println(RemoveElement.removeElementBruteForce(caseTwo, 2));
		ArrayUtils.printArray(caseTwo);
	}

	@Test
	public void testRemove() {
		// case 1
		int[] caseOne = {3, 2, 2, 3};
		System.out.println(RemoveElement.removeElement(caseOne, 3));
		ArrayUtils.printArray(caseOne);
		// case 2
		int[] caseTwo = {0, 1, 2, 2, 3, 0, 4, 2};
		System.out.println(RemoveElement.removeElement(caseTwo, 2));
		ArrayUtils.printArray(caseTwo);
	}
}
