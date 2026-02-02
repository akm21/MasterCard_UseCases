import org.example.UC3.LengthUnit;
import org.example.UC3.QuantityLength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementAppTest2 {
    @Test
    public void testEquality_SameFeetValues(){
        QuantityLength q1=new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2=new QuantityLength(1.0, LengthUnit.FEET);

        assertTrue(q1.equals(q2),"1.0 ft should be equal to 1.0 ft");
    }

    @Test
    public  void testEquality_SameInchValues(){
        QuantityLength q1=new QuantityLength(1.0,LengthUnit.INCHES);
        QuantityLength q2=new QuantityLength(1.0,LengthUnit.INCHES);

        assertTrue(q1.equals(q2),"1.0 inch should be equal to 1.0 inch");
    }

    @Test
    public  void testEquality_FeetAndInches(){
        QuantityLength q1=new QuantityLength(1.0,LengthUnit.FEET);
        QuantityLength q2=new QuantityLength(12.0,LengthUnit.INCHES);
        assertTrue(q1.equals(q2),"1.0 ft should be equal to 12.0 inches");
    }

    @Test
    public void testEquality_DifferentValues(){
        QuantityLength q1=new QuantityLength(1.0,LengthUnit.FEET);
        QuantityLength q2=new QuantityLength(2.0,LengthUnit.FEET);

        assertFalse(q1.equals(q2),"1.0 ft should not be equal to 2.0 ft");
    }

    @Test
    public  void testEquality_DifferentConvertedValues(){
        QuantityLength q1=new QuantityLength(1.0,LengthUnit.FEET);
        QuantityLength q2=new QuantityLength(10.0,LengthUnit.INCHES);
        assertFalse(q1.equals(q2),"1.0 ft should not be equal to 10.0 inches");
    }

    @Test
    public void testEquality_SameReference(){
        QuantityLength q1=new QuantityLength(1.0,LengthUnit.FEET);
        assertTrue(q1.equals(q1),"q1 should be equal to itself");
    }
    @Test
    public void testEquality_NullComparision(){
        QuantityLength q1=new QuantityLength(1.0,LengthUnit.FEET);
        assertFalse(q1.equals(null),"q1 should not be equal to null");
    }
    @Test
    public void testEquality_TypeSafety(){
        QuantityLength q1=new QuantityLength(1.0,LengthUnit.FEET);
        assertFalse(q1.equals("1.0"),"q1 should not be equal to different type");
    }

}
