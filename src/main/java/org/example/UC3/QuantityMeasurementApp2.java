package org.example.UC3;

public class QuantityMeasurementApp2 {

        public static void main(String[] args) {

            org.example.UC3.QuantityLength q1 = new org.example.UC3.QuantityLength(1.0, org.example.UC3.LengthUnit.FEET);
            org.example.UC3.QuantityLength q2 = new org.example.UC3.QuantityLength(12.0, org.example.UC3.LengthUnit.INCHES);
             System.out.println(q1.toString()+"   "+q2.toString());
            System.out.println("Input: Quantity (1.0, \"feet\") and Quantity (12.0, \"inches\")");
            System.out.println("Output: Equal (" + q1.equals(q2) + ")");

            org.example.UC3.QuantityLength q3 = new org.example.UC3.QuantityLength(1.0, org.example.UC3.LengthUnit.INCHES);
            org.example.UC3.QuantityLength q4 = new QuantityLength(1.0, LengthUnit.INCHES);

            System.out.println("Input: Quantity (1.0, \"inch\") and Quantity (1.0, \"inch\")");
            System.out.println("Output: Equal (" + q3.equals(q4) + ")");
        }
    }
