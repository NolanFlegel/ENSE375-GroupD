package com.uregina.app;
import com.uregina.exception.*;
import java.util.ArrayList;
// Implemented by: Jacob Chapman

// NOTES: THere was no figure available to display the regions, so I made the assumption of what regions are in the following rectangle and 
//		how many people were in each region.
public class PatientHistogram 
{
	private int[][] patientCount = new patientCount[20][10]; // 20x10 region

    	public PatientHistogram() 
    	{
			for(int i = 0; i < patientCount[i].length; i++)
			{
				for(int j = 0; j < patientCount[i][j].length; j++)
				{
					patientCount[i][j] = 100; //assuming each region has 100 active cases
				}
			} 
    	}
    	/**
	*
	* @return boolean: true if the patient can be added from that region 
	*/
    	public boolean addAPatientToRegion(int VIndex, int HIndex) //col, row
    	{
    		
    		//Assuming there is a region available for that patient, then if the count is greater than 0 return true
			if(patientCount[VIndex][HIndex] >= 0) 
			{
				return true;
			}
			
    	}
	/**
	*
	* @return boolean: true if the patient can be removed from that region 
	*/
    	public boolean deleteAPatientFromRegion(int VIndex,int HIndex)
    	{
    		// assuming there is a patient available in that region, and if the count is not equal to zero
    		if(patientCount[VIndex][HIndex] >= 0)
			{
				return true;
			}
    	
    	}
    	public int getPatientsCountInRegion(int VIndex,int HIndex) throws IndexOutOfBoundsException
    	{
    		//ToDo: add you code here (you can update the return statement)
    		return patientCount[VIndex][HIndex];
    	}
}
