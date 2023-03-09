package com.techlabs.unitestingapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


class StringUtilTest {
	StringUtil stringUtil;
	
	@BeforeEach
	void init()
	{
		stringUtil=new StringUtil();
	}

	@DisplayName("Testing Truncation")
	@Test	
	void testTruncateAInFirstTwoPosition() {
		assertAll(		
		()->assertEquals("BCD",stringUtil.truncateAInFirstTwoPosition("ABCD")),
		()->assertEquals("BCD",stringUtil.truncateAInFirstTwoPosition("AABCD")),
		()->assertEquals("BACD",stringUtil.truncateAInFirstTwoPosition("ABACD"))
		);
	}
	
	@DisplayName("First & Last Two Characters")
	@Test	
	void testAreFirstAndLastTwoCharactersSame() {
		assertAll(
		()->assertFalse(stringUtil.AreFirstAndLastTwoCharactersSame("ASDSA")),
		()->assertTrue(stringUtil.AreFirstAndLastTwoCharactersSame("ASDAS")),
		()->assertFalse(stringUtil.AreFirstAndLastTwoCharactersSame("ASA"))
		);
	}
	
}
