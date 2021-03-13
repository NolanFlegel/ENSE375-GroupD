package com.uregina.app;
import com.uregina.exception.*;
import java.util.ArrayList;

public class PatientList 
{
	private ArrayList<Patient> patientList;

    	public PatientList() 
    	{
    		//ToDo: add you code here
			this.patientList = new ArrayList<Patient>();
    	}
    /**
	*
	* @return boolean: true if the patient can be added to the list 
	*/
    	public boolean addPatient(Patient patient)
    	{
    		//ToDo: add you code here
			if (patient == null){
				System.out.println("Null Patient, Not Added.");
				return false;
			}
			else{
				this.patientList.add(patient);
				System.out.println("Patient Added.");
				return true;
			}
    	}
    /**
	*
	* @return boolean: true if the patient is removed from the list 
	*/
    	public boolean deletePatient(int index)
    	{
    		//ToDo: add you code here
			if (this.patientList.size() > index){
				this.patientList.remove(index);
				System.out.println("Patient " + index +" Deleted.");
				return true;
			}
    		else{
				System.out.println("Patient " + index +" Does Not Exist.");
				return false;
			}
    	}

    	public Patient getPatient(String ID)
    	{
    		//ToDo: add you code here
			for(int i = 0; i < this.patientList.size(); i++){
			if(this.patientList.get(i).getID() == ID)
				System.out.println("Patient " + ID + " Found.");
				return this.patientList.get(i);
			}
			System.out.println("Patient " + ID + " Is Not on The List.");
    		return null;
    	}

    	public int getNumberofPatients()
    	{
    		//ToDo: add you code here (you can update the return statement)
    		return this.patientList.size();
    	}
}

