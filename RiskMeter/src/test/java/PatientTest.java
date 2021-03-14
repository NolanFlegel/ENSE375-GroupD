/**
 * Written by Nolan Flegel
 * SID: 200250037
 * Date: March 13, 2021
 * 
 * ENSE375 - Group D
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 * Unit test for Patient.
 */
public class PatientTest 
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
    public void createNewPatientNameTrue()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertEquals("Peter", patient.getName());     
        
    }

    @Test
    public void createNewPatientNameInvalidChar()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
        Exception exception = assertThrows(InvalidNameException.class, ()->{
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter012", "123456789", 99, postalCode);
        });

        String expectedException = "is an invalid patient name";
        String actualException = exception.getMessage();

        assertTrue(actualException.contains(expectedException));
          
              
        
    }

    @Test
    public void createNewPatientIDInvalidDigit()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
        Exception exception = assertThrows(InvalidNameException.class, ()->{
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter012", "103456789", 99, postalCode);
        });
        String expectedException = "is an invalid";
        String actualException = exception.getMessage();
        
        assertTrue(actualException.contains(expectedException));     
        
    }

    @Test
    public void createNewPatientIDTooLong()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {        
          Exception exception = assertThrows(InvalidNameException.class, ()->{
            PostalCode postalCode = new PostalCode("K1A-1A1");
            Patient patient = new Patient("Peter012", "123456789123", 99, postalCode);
          });
          String expectedException = "is an invalid";
          String actualException = exception.getMessage();
          
          assertTrue(actualException.contains(expectedException)); 
    }

    @Test
    public void getPatientNameFalse()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertNotEquals("not Peter", patient.getName());     
        
    }

    @Test
    public void getPatientIDFalse()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertNotEquals("678912345", patient.getID());     
        
    }

    @Test
    public void getPatientIDTrue()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertEquals("123456789", patient.getID());     
        
    }

    @Test
    public void getPatientAgeTrue()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertEquals(99, patient.getAge());     
    }

    @Test
    public void setPatientAgeTrue()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertTrue(patient.setAge(15));
    }

    @Test
    public void setPatientAgeTooLarge()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertFalse(patient.setAge(150));
    }

    @Test
    public void setPatientAgeTooSmall()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertFalse(patient.setAge(-1));   
    }

    @Test
    public void setPatientPostalCodeTrue()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertTrue(patient.setPostalCode(new PostalCode("K1A-1B1")));
    }


    //Cannot be tested until PostalCode is implemented.
    @Test
    public void setPatientPostalCodeInvalid()throws InvalidNameException, InvalidAgeException ,InvalidIDException, InvalidPostalCodeException
    {
          PostalCode postalCode = new PostalCode("K1A-1A1");
          Patient patient = new Patient("Peter", "123456789", 99, postalCode);
          assertFalse(patient.setPostalCode(new PostalCode("A1A-1B1")));
    }
}

