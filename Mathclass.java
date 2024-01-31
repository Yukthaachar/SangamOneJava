
package yy1;

public class Mathclass {

    public static void main(String[] args) {

        int i = -5;
        long l = -10L;
        float f = 3.5f;
        double d1 = 7.25;
        double d2 = 3.0;
        
        // Testing Math methods
        int absInt = Math.abs(i);
        long absLong = Math.abs(l);
        float absFloat = Math.abs(f);
        double absDouble = Math.abs(d1);
        
        int maxInt = Math.max(10, 20);
        long maxLong = Math.max(30L, 40L);
        float maxFloat = Math.max(5.5f, 6.0f);
        double maxDouble = Math.max(d1, d2);
        
        int minInt = Math.min(15, 25);
        long minLong = Math.min(35L, 45L);
        float minFloat = Math.min(7.0f, 8.5f);
        double minDouble = Math.min(d1, d2);
        
        double expResult = Math.exp(d1);
        double sqrtResult = Math.sqrt(d1);
        double cbrtResult = Math.cbrt(d1);
        double powResult = Math.pow(d1, d2);
        
        long roundDouble = Math.round(d1);
        int roundFloat = Math.round(f);
        
        double sinResult = Math.sin(d1);
        double cosResult = Math.cos(d1);
        double tanResult = Math.tan(d1);
        
        double asinResult = Math.asin(0.5);
        double acosResult = Math.acos(0.5);
        double atanResult = Math.atan(0.5);
        
        double ceilResult = Math.ceil(d1);
        double floorResult = Math.floor(d1);

        // Output the results of the tests
        System.out.println("Absolute Int: " + absInt);
        System.out.println("Absolute Long: " + absLong);
        System.out.println("Absolute Float: " + absFloat);
        System.out.println("Absolute Double: " + absDouble);
        
        System.out.println("Max Int: " + maxInt);
        System.out.println("Max Long: " + maxLong);
        System.out.println("Max Float: " + maxFloat);
        System.out.println("Max Double: " + maxDouble);
        
        System.out.println("Min Int: " + minInt);
        System.out.println("Min Long: " + minLong);
        System.out.println("Min Float: " + minFloat);
        System.out.println("Min Double: " + minDouble);
        
        System.out.println("Exponential: " + expResult);
        System.out.println("Square Root: " + sqrtResult);
        System.out.println("Cube Root: " + cbrtResult);
        System.out.println("Power: " + powResult);
        
        System.out.println("Round Double: " + roundDouble);
        System.out.println("Round Float: " + roundFloat);
        
        System.out.println("Sine: " + sinResult);
        System.out.println("Cosine: " + cosResult);
        System.out.println("Tangent: " + tanResult);
        
        System.out.println("Arcsine: " + asinResult);
        System.out.println("Arccosine: " + acosResult);
        System.out.println("Arctangent: " + atanResult);
        
        System.out.println("Ceiling: " + ceilResult);
        System.out.println("Floor: " + floorResult);

    
    }
    
}
