
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 * Unit test for PatientList.
 */

// import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertEquals;

// import org.junit.Test;

/**
 * Unit test for PatientList.
 */
public class PatientListTest 
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
    public void realPatientAdd()
    {
        PatientList patientList = new PatientList();
        PostalCode postalCode = new PostalCode("123456");
        Patient patient = new Patient("Steve", "1234", 35, postalCode);

        assertTrue(patientList.addPatient(patient));
    }

    @Test
    public void nullPatientAdd()
    {
        PatientList patientList = new PatientList();
        Patient patient = null;

        assertFalse(patientList.addPatient(patient));
    }

    @Test
    public void existingPatientGet()
    {
        PatientList patientList = new PatientList();
        PostalCode postalCode = new PostalCode("123456");
        Patient patient = new Patient("Steve", "1234", 35, postalCode);

        assertTrue(patientList.getPatient("1234") == patient);
    }

    @Test
    public void nonExistingPatientGet()
    {
        PatientList patientList = new PatientList();

        assertTrue(patientList.getPatient("1234") == null);
    }

    @Test
    public void ExistingPatientDelete()
    {
        PatientList patientList = new PatientList();
        PostalCode postalCode = new PostalCode("123456");
        Patient patient = new Patient("Steve", "1234", 35, postalCode);

        assertTrue(patientList.deletePatient(0));
    }

    @Test
    public void nonExistingPatientDelete()
    {
        PatientList patientList = new PatientList();

        assertFalse(patientList.deletePatient(0));
    }

    @Test
    public void getNumPatients0()
    {
        PatientList patientList = new PatientList();

        assertTrue(patientList.getNumberofPatients() == 0);
    }

    @Test
    public void getNumPatients3()
    {
        PatientList patientList = new PatientList();
        PostalCode postalCode = new PostalCode("123456");
        Patient patient1 = new Patient("Steve", "1234", 35, postalCode);
        Patient patient2 = new Patient("Linda", "4321", 53, postalCode);
        Patient patient3 = new Patient("Bob", "1423", 33, postalCode);

        patientList.addPatient(patient1);
        patientList.addPatient(patient2);
        patientList.addPatient(patient3);

        assertTrue(patientList.getNumberofPatients() == 3);
    }


}

