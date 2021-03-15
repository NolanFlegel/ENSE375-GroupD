//package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import static org.junit.Assert.AsserEquals;
import org.junit.Test;


public class RiskCodeMapTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void to_Test_G_True() { // to test that if the riskfactor is 0 then the colour is Green 
		RiskCodeMap riskCodeMap = new RiskCodeMap(); //making an object of the main file
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

        neighboursCaseCount.add(0); // add the number 0 to arraylist.
		riskCodeMap.updateRiskInARegion(1, 1, 0, neighboursCaseCount); // updating the index, count, and arraylist of integers
        assertEquals('G',riskCodeMap.getRiskInARegion(1, 1)); //checking if the colour is B at index 1,1
    }

    @Test
    public void to_Test_B_True() { // to test that if the riskfactor is 2 then the colour is Blue 
		RiskCodeMap riskCodeMap = new RiskCodeMap(); //making an object of the main file
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

        neighboursCaseCount.add(0); // add the number 0 to arraylist.
        neighboursCaseCount.add(1); // add the number 1 to arraylist.
        neighboursCaseCount.add(2); // add the number 2 to arraylist.
		riskCodeMap.updateRiskInARegion(1, 1, 2, neighboursCaseCount); // updating the index, count, and arraylist of integers
        assertEquals('B',riskCodeMap.getRiskInARegion(1, 1)); 
    }


    @Test
    public void to_Test_Y_True() { // to test that if the riskfactor is 5 then the colour is Yellow
		RiskCodeMap riskCodeMap = new RiskCodeMap(); //making an object of the main file
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

        
        neighboursCaseCount.add(0); // add the number 0 to arraylist.
        neighboursCaseCount.add(1); // add the number 1 to arraylist.
        neighboursCaseCount.add(2); // add the number 2 to arraylist.
        neighboursCaseCount.add(3); // add the number 3 to arraylist.
        neighboursCaseCount.add(4); // add the number 4 to arraylist.
        neighboursCaseCount.add(5); // add the number 5 to arraylist.
 
		riskCodeMap.updateRiskInARegion(1, 1, 5, neighboursCaseCount); // updating the index, count, and arraylist of integers
        assertEquals('Y',riskCodeMap.getRiskInARegion(1, 1)); 
    }

	@Test
    public void to_Test_O_True() { // to test that if the riskfactor is 8 then the colour is Orange
		RiskCodeMap riskCodeMap = new RiskCodeMap();
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

        neighboursCaseCount.add(0); // add the number 0 to arraylist.
        neighboursCaseCount.add(1); // add the number 1 to arraylist.
        neighboursCaseCount.add(2); // add the number 2 to arraylist.
        neighboursCaseCount.add(3); // add the number 3 to arraylist.
        neighboursCaseCount.add(4); // add the number 4 to arraylist.
        neighboursCaseCount.add(5); // add the number 5 to arraylist.
        neighboursCaseCount.add(6); // add the number 6 to arraylist.
        neighboursCaseCount.add(7); // add the number 7 to arraylist.
        neighboursCaseCount.add(8); // add the number 8 to arraylist.
		neighboursCaseCount.add(9); // add the number 9 to arraylist.

		riskCodeMap.updateRiskInARegion(1, 1, 8, neighboursCaseCount);
        assertEquals('O',riskCodeMap.getRiskInARegion(1, 1));
    }

    @Test
    public void to_Test_R_True(){// to test that if the riskfactor is 10 then the colour is Red
		RiskCodeMap riskCodeMap = new RiskCodeMap();
		ArrayList<Integer> neighboursCaseCount = new ArrayList<Integer>();

        neighboursCaseCount.add(0); // add the number 0 to arraylist.
        neighboursCaseCount.add(1); // add the number 1 to arraylist.
        neighboursCaseCount.add(2); // add the number 2 to arraylist.
        neighboursCaseCount.add(3); // add the number 3 to arraylist.
        neighboursCaseCount.add(4); // add the number 4 to arraylist.
        neighboursCaseCount.add(5); // add the number 5 to arraylist.
        neighboursCaseCount.add(6); // add the number 6 to arraylist.
        neighboursCaseCount.add(7); // add the number 7 to arraylist.
        neighboursCaseCount.add(8); // add the number 8 to arraylist.
		neighboursCaseCount.add(9); // add the number 9 to arraylist.
        neighboursCaseCount.add(10); // add the number 9 to arraylist.
        
		riskCodeMap.updateRiskInARegion(1, 1, 10, neighboursCaseCount);
        assertEquals('R',riskCodeMap.getRiskInARegion(1, 1));
    }

}
