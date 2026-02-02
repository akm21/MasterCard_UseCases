package org.example.UC5;

public class Length {

    private static final double ABS_EPS_IN = 5e-5;
    private static final double REL_EPS = 1e-9;

    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(1.0 / 2.54);

        private final double toInchesFactor;

        LengthUnit(double toInchesFactor) {
            this.toInchesFactor = toInchesFactor;
        }

        public double toInches(double v) {
            return v * toInchesFactor;
        }
    }

    private double toBaseInches() {
        return unit.toInches(value);
    }

private static boolean almostEqual(double a,double b){
double diff = Math.abs(a-b);
double scale =Math.max(1.0,Math.max(Math.abs(a),))
}
}