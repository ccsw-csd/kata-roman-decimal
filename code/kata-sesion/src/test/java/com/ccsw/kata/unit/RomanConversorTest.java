package com.ccsw.kata.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ccsw.kata.RomanConversor;

/**
 * Kata Roman Test Class
 *
 * @author ccsw
 *
 */
public class RomanConversorTest {

    private RomanConversor romanConversor;

    @Before
    public void setUp() {
        this.romanConversor = new RomanConversor();
    }

    @Test
    public void convertSendIThenReturnOne() {
        assertEquals(1, romanConversor.convert("I"));
    }

    @Test
    public void convertSendIIThenReturnTwo() {
        assertEquals(2, romanConversor.convert("II"));
    }

    @Test
    public void testConvertSendIII_OK() {
        assertEquals(3, romanConversor.convert("III"));
    }

    @Test
    public void testConvertSendIV_OK() {
        assertEquals(4, romanConversor.convert("IV"));
    }

    @Test
    public void testConvertSendVIII_OK() {
        assertEquals(8, romanConversor.convert("VIII"));
    }

    @Test
    public void testConvertSendMCMXC_OK() {
        assertEquals(1990, romanConversor.convert("MCMXC"));
    }

}
