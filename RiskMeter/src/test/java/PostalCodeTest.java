package com.uregina.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

/**
 * Unit test for simple PostalCode.
 * 
 * @author Renz Rivero (SID: 200377174)
 * 
 * The Postal code is given in the following format "K1a-bxy" as: 
 * 		"K1" is a fixed prefix, 
 * 		"a" is any letter from 'A' to 'T' to indicate the vertical index of the region, 
 * 		"b" is a digit from '0' to '9' to indicate the horizontal index of the region, 
 * 		"x" is any uppercase letter and 
 * 		"y" is any digit. 
 * 
 * 		Assumes that the spacing character (4th) character can also be a space(' ')
 */
public class PostalCodeTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void alwaysFail() 
    {
        fail();
    }

    @Test
    public void validateCorrectPostalCodeLength_True()
    {
        PostalCode validator = new PostalCode();
        boolean legalPostalCode = validator.isValidPostalCode("K1a-0x1");
        assertTrue(legalPostalCode);
    }

    @Test
    public void validateShortPostalCodeLength_False()
    {
        PostalCode validator = new PostalCode();
        boolean illegalPostalCode = validator.isValidPostalCode("K1a-0x");
        assertFalse(illegalPostalCode);
    }

    @Test
    public void validateLongPostalCodeLength_False()
    {
        PostalCode validator = new PostalCode();
        boolean illegalPostalCode = validator.isValidPostalCode("K1a-0x1-");
        assertFalse(illegalPostalCode);
    }

    @Test
    public void validateCorrectPostalCodePrefix_True()
    {
        PostalCode validator = new PostalCode();
        boolean legalPostalCode = validator.isValidPostalCode("K1K-0x1");
        assertTrue(legalPostalCode);
    }

    @Test
    public void validateWrongPostalCodePrefix_False()
    {
        PostalCode validator = new PostalCode();
        boolean illegalPostalCode = validator.isValidPostalCode("K2K-011");
        assertFalse(illegalPostalCode);
    }

    @Test
    public void validateCorrectVerticalIndexRegion_True()
    {
        PostalCode validator = new PostalCode();
        boolean legalPostalCode = validator.isValidPostalCode("K1a-0x1");
        assertTrue(legalPostalCode);
    }

    @Test
    public void validateWrongVerticalIndexRegion_False()
    {
        PostalCode validator = new PostalCode();
        boolean illegalPostalCode = validator.isValidPostalCode("K1U-0x1");
        assertFalse(illegalPostalCode);
    }

    @Test
    public void validateCorrectSpacingCharacterDash_True()
    {
        PostalCode validator = new PostalCode();
        boolean legalPostalCode = validator.isValidPostalCode("K1a-0x1");
        assertTrue(legalPostalCode);
    }

    @Test
    public void validateCorrectSpacingCharacterSpace_True()
    {
        PostalCode validator = new PostalCode();
        boolean legalPostalCode = validator.isValidPostalCode("K1a 0x1");
        assertTrue(legalPostalCode);
    }

    @Test
    public void validateWrongSpacingCharacter_False()
    {
        PostalCode validator = new PostalCode();
        boolean illegalPostalCode = validator.isValidPostalCode("K1a!0x1");
        assertFalse(illegalPostalCode);
    }

    @Test
    public void validateCorrectHorizontalIndexRegion_True()
    {
        PostalCode validator = new PostalCode();
        boolean legalPostalCode = validator.isValidPostalCode("K1a-0x1");
        assertTrue(legalPostalCode);
    }

    @Test
    public void validateWrongHorizontalIndexRegion_False()
    {
        PostalCode validator = new PostalCode();
        boolean illegalPostalCode = validator.isValidPostalCode("K1a-bx1");
        assertFalse(illegalPostalCode);
    }

    @Test
    public void validate6thCharacterIsALetter_True()
    {
        PostalCode validator = new PostalCode();
        boolean legalPostalCode = validator.isValidPostalCode("K1a-0X1");
        assertTrue(legalPostalCode);
    }

    @Test
    public void validate6thCharacterIsALetter_False()
    {
        PostalCode validator = new PostalCode();
        boolean illegalPostalCode = validator.isValidPostalCode("K1a-011");
        assertFalse(illegalPostalCode);
    }

    @Test
    public void validateLastCharacterIsADigit_True()
    {
        PostalCode validator = new PostalCode();
        boolean legalPostalCode = validator.isValidPostalCode("K1a-0X1");
        assertTrue(legalPostalCode);
    }

    @Test
    public void validateLastCharacterIsADigit_False()
    {
        PostalCode validator = new PostalCode();
        boolean illegalPostalCode = validator.isValidPostalCode("K1a-0XA");
        assertFalse(illegalPostalCode);
    }
}
