
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit test for PatientHistogram.
 */
public class PatientHistogramTest
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
    public void AddPatient_PatientIndex_OutOfBounds()
    {
        PatientHistogram patientHistogram = new PatientHistogram();
        boolean result = patientHistogram.addAPatientToRegion(20, 11);
        assertFalse(result);
    }

    @Test
    public void DeletePatient_PatientIndex_OutOfBounds()
    {
        PatientHistogram patientHistogram = new PatientHistogram();
        boolean result = patientHistogram.deleteAPatientFromRegion(20, 11);
        assertFalse(result);
    }

    @Test
    public void AddPatient_PatientIndex_Negative()
    {
        PatientHistogram patientHistogram = new PatientHistogram();
        boolean result = patientHistogram.addAPatientToRegion(20, -1);
        assertFalse(result);
    }

    @Test
    public void DeletePatient_PatientIndex_Negative()
    {
        PatientHistogram patientHistogram = new PatientHistogram();
        boolean result = patientHistogram.deleteAPatientFromRegion(20, -1);
        assertFalse(result);
    }
    
}
