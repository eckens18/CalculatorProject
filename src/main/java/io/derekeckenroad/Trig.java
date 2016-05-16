package io.derekeckenroad;


public class Trig {
    //I split up trig and advanced functions into this class
    static double sine(double a){
        return Calculator.result = Math.sin(a);
    }

    static double cosine(double a){
        return Calculator.result = Math.cos(a);
    }

    static double tangent(double a){
        return Calculator.result = Math.tan(a);
    }

    static double inverseSine(double a){
        return Calculator.result = Math.asin(a);
    }

    static double inverseCosine(double a){
        return Calculator.result = Math.acos(a);
    }

    static double inverseTangent(double a){
        return Calculator.result = Math.atan(a);
    }

    static double convertToRadians(double a){
        return Calculator.result = Math.toRadians(a);
    }

    static double convertToDegrees(double a){
        return Calculator.result = Math.toDegrees(a);
    }

    static double log(double a){
        return Calculator.result = Math.log(a);
    }

    static double factorial(double factor) {
        double f = 1;
        for (int i = 1; i <= factor; i++) {
            f *= i;
        }
        return Calculator.result = f;
    }
}
