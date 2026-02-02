import org.example.UC1.QuantityMeasurementApp;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementAppTest {

    @Test
    void testEquality_SameValue(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(1.0);
         assertTrue(feet1.equals(feet2), "Two Feet Objects with value 1.0 ft should be wqual");
    }

    @Test
    void testEquality_DifferentValue(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(2.0);
        assertFalse(feet1.equals(feet2),"Feet values 1.0 ft and 2.0 ft should not be equal");
    }
    @Test
    void testEquality_NullComparison(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(1.0);
        assertFalse(feet1.equals(null),"Feet Object should not be equal to null");
    }

    @Test
    void testEquality_NonNumericinput() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);
        Object nonNumericObject = "1.0";
        assertFalse(feet.equals(nonNumericObject), "Feet object should not be equal to an object of different type");
    }
    @Test
    void testEquality_SameReference() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(feet.equals(feet), "Feet object must be equal to itself type");

    }

}
