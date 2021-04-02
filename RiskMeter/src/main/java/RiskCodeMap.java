import java.util.ArrayList;

public class RiskCodeMap
{
	private char[][] riskCode = new char[20][10];
    	public RiskCodeMap() 
    	{
			this.riskCode = new char[20][10]; // constructor for riskmap of size 20,10
		}

    	public boolean updateRiskInARegion(int VIndex,int HIndex,int caseCount,ArrayList<Integer> neighboursCaseCount) // finds the median and compares the for the risk assesment
    	{
    		int riskLevel=0;
    		int max = caseCount;
			int median = 0;
			int arrSize = neighboursCaseCount.size()-1;

			if(arrSize%2==0){ // finding the median to use it to compare
				double found_value =(neighboursCaseCount.get(arrSize/2)+neighboursCaseCount.get((arrSize-1)/2))/2.0; 
				median = (int)Math.round(found_value);
			}else{
					median = neighboursCaseCount.get(arrSize/2);
				} 		
    		if(max >= median) {
    			riskLevel = max;
    		}else {
    			riskLevel = median;
    		}
			
    		
    		if(riskLevel == 0) { // conditions of Green, Blue, Yellow, Orange and Red colours to be displayed
    			this.riskCode[VIndex][HIndex] = 'G'; // G will be assigned if the case count is to be seen as 0
    			return true;
    		}else if((riskLevel>=0) && (riskLevel < 3)) {
    			this.riskCode[VIndex][HIndex] = 'B';
    			return true;
    		}else if((riskLevel >=3) && (riskLevel < 7)) {
    			this.riskCode[VIndex][HIndex] = 'Y';
    			return true;
    		}else if((riskLevel >=7) && (riskLevel < 10)) {
    			this.riskCode[VIndex][HIndex] = 'O';
    			return true;
    		}else if(riskLevel >= 10) {
    			this.riskCode[VIndex][HIndex] = 'R';
    			return true;
    		}else{    		
    			return false;
			}

    	}
    	public char getRiskInARegion(int VIndex,int HIndex) throws IndexOutOfBoundsException
    	{ // throws an exception if the index is out of bound from [20][10] range.
    		return this.riskCode[VIndex][HIndex];
    	}
}
