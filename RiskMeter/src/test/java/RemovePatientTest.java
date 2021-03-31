
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
    // Testing if the id is correct - Happy path
    @Test
    public void deleteIfId_True() {

        App app = new App();
        String deletingPatientId = "123456789"; //sample id of patient
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); // sample patient entry

        assertTrue(app.deletePatient(deletingPatientId));

    }

    //Test 3
    // Testing if the id contains 0 
    @Test
    public void dontDeleteIfId_False() {

        App app = new App();
        String deletingPatientId = "123456780";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 

        assertFalse(app.deletePatient(deletingPatientId));

    }

    //Test 4
    //Testing if the id contains 8 digits instead of 9
    @Test
    public void dontDeleteIfId_Short() {

        App app = new App();
        String deletingPatientId = "12345678";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 

        assertFalse(app.deletePatient(deletingPatientId));

    }

    //Test 5
    //Testing is the Id has 10 digits instead of 9
    @Test
    public void dontDeleteIfId_Long() {

        App app = new App();
        String deletingPatientId = "1234567899";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 

        assertFalse(app.deletePatient(deletingPatientId));

    }

    //Test 6
    //Testing is the id is empty
    @Test
    public void dontDeleteIfId_Empty() {

        App app = new App();
        String deletingPatientId = " ";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 


        assertFalse(app.deletePatient(deletingPatientId));

    }

    //Test 7
    //Testing if the is valid 
    @Test
    public void dontDeleteIfId_Invalid() {

        App app = new App();
        String deletingPatientId = "lskjflkj";
        app.addPatient("Trace", "123456789", "k1s-3X3", 42); 

        assertFalse(app.deletePatient(deletingPatientId));

    }


}