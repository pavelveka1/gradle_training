package com.epam.mjc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test public void testIsPositiveNumber() {
        StringUtils strUtils = new StringUtils();
        assertTrue(strUtils.isPositiveNumber("678"));
    }

    @Test public void testIsNotPositiveNumber() {
        StringUtils strUtils = new StringUtils();
        assertFalse(strUtils.isPositiveNumber("-678"));
    }
}
