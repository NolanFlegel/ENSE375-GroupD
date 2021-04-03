import java.util.ArrayList;
// Implemented by: Jacob Chapman

// NOTES: There was no figure available to display the regions, so I made the assumption of what regions are in the following rectangle and 
//		how many people were in each region.
public class PatientHistogram 
{
	private int[][] patientCount; // 20x10 region

    	public PatientHistogram() 
    	{
			this.patientCount = new int[20][10];
    	}
    	/**
	*
	* @return boolean: true if the patient can be added from that region 
	*/
    	public boolean addAPatientToRegion(int VIndex, int HIndex) throws IndexOutOfBoundsException 
    	{
			if(VIndex < 0 || VIndex > 20 || HIndex < 0 || HIndex > 10){
				return false;
			}
    		
			this.patientCount[VIndex][HIndex]++;
			return true;
    	}
	/**
	*
	* @return boolean: true if the patient can be removed from that region 
	*/
    	public boolean deleteAPatientFromRegion(int VIndex,int HIndex) throws IndexOutOfBoundsException
    	{
    		// assuming there is a patient available in that region, and if the count is not equal to zero
    		if(VIndex < 0 || VIndex > 20 || HIndex < 0 || HIndex > 10){
				return false;
			}

			this.patientCount[VIndex][HIndex]--;

			if(this.patientCount[VIndex][HIndex]<0){
				this.patientCount[VIndex][HIndex]=0;
			}
			return true;
			
    	
    	}
    	public int getPatientsCountInRegion(int VIndex,int HIndex) throws IndexOutOfBoundsException
    	{
    		//ToDo: add you code here (you can update the return statement)
    		return this.patientCount[VIndex][HIndex];
    	}
}
