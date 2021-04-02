//
//Created March 28 2021 by Shane Toma 
//
//
//package test; 
//import src.App; //this is the class we are testing

import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertTrue; //Assert True
import static org.junit.jupiter.api.Assertions.assertFalse; //Assert False

//String patientName,String patientID,String patientpostalCode, int patientAge

public class AddPatientTest {


    //Test1
    //Should return False
    @Test
    public void Invalid_Postal_Code_3rd_Pos () {
        App app = new App();
        assertFalse(app.addPatient("Jim", "123456789", "k1u-3X3", 27));
    }

    //Test2
    //Should return False
    @Test
    public void Invalid_Postal_Code_5th_Pos () {
        App app = new App();
        assertFalse(app.addPatient("Jim", "123456789", "k1s-pX3", 27));
    }

    //Test3
    //Should return False
    @Test
    public void Invalid_Postal_Code_6th_Pos () {
        App app = new App();
        assertFalse(app.addPatient("Jim", "123456789", "k1s-3l3", 27));
    }

    //Test4
    //Should return False
    @Test
    public void Invalid_Postal_Code_7th_Pos () {
        App app = new App();
        assertFalse(app.addPatient("Jim", "123456789", "k1s-3X!", 27));
    }

    //Test5
    //Should return False
    @Test
    public void Invalid_Postal_Code_Too_Long() {
        App app = new App();
        assertFalse(app.addPatient("Jim", "123456789", "k1s-3l3123", 27));
    }

    //Test6
    //Should return False
    @Test
    public void Invalid_Postal_Code_Too_Short () {
        App app = new App();
        assertFalse(app.addPatient("Jim", "123456789", "k1s-3l", 27));
    }
   

    //Test7
    //Should return False
    @Test
    public void Invalid_Name () {
        App app = new App();
        assertFalse(app.addPatient("Jim!!", "123456789", "k1s-3X3", 27));
    }

    //Test8
    //Should return False
    @Test
    public void Invalid_Age_Neg () {
        App app = new App();
        assertFalse(app.addPatient("Jim", "123456789", "k1s-3X3", -27));
    }

    //Test9
    //Should return False
    @Test
    public void Invalid_Age_150 () {
        App app = new App();
        assertFalse(app.addPatient("Jim", "123456789", "k1s-3X3", 150));
    }

    //Test10
    //Should return True
    @Test
    public void All_Valid () {
        App app = new App();
        assertTrue(app.addPatient("Jim", "123456789", "K1S-3X3", 27));
    }
}
