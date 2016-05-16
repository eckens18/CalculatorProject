package io.derekeckenroad;

public class Calculator {
    //The result that shows on the screen
    static double result = 0;
    //Simple math methods
    static double add(double addition){
        return result += addition;
    }
    static double subtract(double subtraction){
        return result -= subtraction;
    }
    static double multiply(double multiplier){
        return result *= multiplier;
    }
    static double divide(double div){
        if(div!=0) {
            return result /= div;
        } else {
            Display.error();
        }
        return 0 ;
    }
    static double squareRoot(){
        return result = java.lang.Math.sqrt(result);
    }
    static double square(){
        return result = result*result;
    }
    static double exponent(double exp){
        return result = Math.pow(result, exp);
    }
    static double posToNeg(){
        return result = -(result);
    }
    static double inverse(){
        return result = 1/result;
    }

}
