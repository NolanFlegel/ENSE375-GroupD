
import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse; 



//Patient(patientName,patientID,patientpostalCode(K1a-bxy),patientAge(9-Digit))


public class RemovePatientTest {

    //Test 1
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    //Test 2
    @Test
    public void deleteIfId_True() {

        App app = new App();
        String deletingPatientId = "123456789"; //sample id of patient
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); // sample patient entry
        boolean check = app.deletePatient(deletingPatientId);

        assertTrue(check);

    }

    //Test 3
    @Test
    public void dontDeleteIfId_False() {

        App app = new App();
        String deletingPatientId = "123456780";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 

        boolean check = app.deletePatient(deletingPatientId);

        assertFalse(check);

    }

    //Test 4
    @Test
    public void dontDeleteIfId_Short() {

        App app = new App();
        String deletingPatientId = "12345678";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 

        boolean check = app.deletePatient(deletingPatientId);

        assertFalse(check);

    }

    //Test 5
    @Test
    public void dontDeleteIfId_Long() {

        App app = new App();
        String deletingPatientId = "1234567899";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 

        boolean check = app.deletePatient(deletingPatientId);

        assertFalse(check);

    }

    //Test 6
    @Test
    public void dontDeleteIfId_Empty() {

        App app = new App();
        String deletingPatientId = " ";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 

        boolean check = app.deletePatient(deletingPatientId);

        assertFalse(check);

    }

    //Test 7
    @Test
    public void dontDeleteIfId_Invalid() {

        App app = new App();
        String deletingPatientId = "lskjflkj";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 
        boolean check = app.deletePatient(deletingPatientId);

        assertFalse(check);

    }


}