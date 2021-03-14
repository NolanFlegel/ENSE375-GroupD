
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
    public void AddPatient_PatientIndex_HasCharacters()
    {
        boolean result = addAPatientToRegion('A', 'a');
        assertFalse(result);
    }

    @Test
    public void AddPatient_PatientIndex_HasStrings()
    {
        boolean result = addAPatientToRegion("str", "str");
        assertFalse(result);
    }

    @Test
    public void AddPatient_PatientIndex_OutOfBounds()
    {
        boolean result = addAPatientToRegion(20, 11);
        assertFalse(result);
    }

    @Test
    public void DeletePatient_PatientIndex_OutOfBounds()
    {
        boolean result = deleteAPatientToRegion(20, 11);
        assertFalse(result);
    }
}
