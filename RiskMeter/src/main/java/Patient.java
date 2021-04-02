/**
 * Written by Nolan Flegel
 * SID: 200250037
 * Date: March 13, 2021
 * 
 * ENSE375 - Group D
 */
import java.util.*;


public class Patient 
{
	private String name;
	private String ID;
	private int age;
	private PostalCode postalCode;
	private String nameRegex ="^[a-zA-Z\\s\\.]*$";
	private String idRegex = "^[1-9]{9}";
	
	public Patient(String name, String ID, int age, PostalCode postalCode) throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
	{
		boolean invalidPatient = true;

		if (!name.matches(this.nameRegex))
		{
			invalidPatient =false;
			throw new InvalidNameException(name);
			
		}
		else if (!ID.matches(this.idRegex))
		{	
			invalidPatient =false;
			throw new InvalidIDException(ID);
			
		}
		else if(!this.setAge(age))
		{	
			invalidPatient =false;
			throw new InvalidAgeException(age);
			
		}
		else if(!postalCode.isValidPostalCode(postalCode.getPostalCode()))
		{
			invalidPatient =false;
			throw new InvalidPostalCodeException();
			
		}
		
		if(invalidPatient){
		this.name = name;
		this.ID = ID;
		this.age = age;
		this.postalCode = postalCode;
		}
		
	}
	public String getName()
	{
		return this.name;
	}
	public String getID()
	{
		 
		return this.ID;
	}
	public int getAge()
	{
		
		return this.age;
	}
	public PostalCode getPostalCode()
	{	
		
		return this.postalCode;
	}
	/**
	*
	* @return boolean: true if the age is corrected set 
	*/
	public boolean setAge(int age)
	{	//assumption human age can be between 0 and 130

		if (age > 0 && age < 130){
			this.age = age;
			return true;
		}else{
			return false;
		}
		
		
	}
	/**
	*
	* @return boolean: true if the postal code is corrected set 
	*/
	public boolean setPostalCode(PostalCode postalCode)
	{
		String newPostalCode = postalCode.getPostalCode();
		if(postalCode.isValidPostalCode(newPostalCode)){
			this.postalCode = postalCode;
			return true;
		}else{
			return false;
		}

		
	}
}

