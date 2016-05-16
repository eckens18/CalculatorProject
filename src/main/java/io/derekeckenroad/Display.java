package io.derekeckenroad;

import java.util.Scanner;

public class Display {

    private DisplayMode currentDisplayMode;
    private ValueConversion currentValueConversion;

    //This sets up the user options and calls the engine that runs the calculator

    public void startEngine(){
        currentDisplayMode = DisplayMode.DECIMAL;
        currentValueConversion = ValueConversion.DEGREES;

        System.out.println("Welcome to the Derkulator!:\n" +
                "1:add   2:sub   3:mult  4:div   5:sqrt   6:sqr   7:exp    8:+/-  \n" +
                "9:invs  10:sin  11:cos  12:tan  13:-sin  14:-cos 15:-tan  16:log \n" +
                "17:fact 18:ce   19:exit 20:M+   21:MC    22:MRC  \n" +
                "===================================================================\n"+
                "Display Modes(Cycle or choose):\n" +
                "23:CycleModes   24:Dec  25:Bin  26:Oct   27:Hex\n" +
                "===================================================================\n"+
                "Convert from Degrees to Radians(Cycle or choose):\n" +
                "28:Cycle        29:Deg  30:Rad");

        engine();
    }

    //This is the the while loop that runs all the functionality of the calculator

    public void engine(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print(Calculator.result);
            int symbol = sc.nextInt();
            switch (symbol) {
                case 1:
                    Calculator.add(sc.nextDouble());
                    break;
                case 2:
                    Calculator.subtract(sc.nextDouble());
                    break;
                case 3:
                    Calculator.multiply(sc.nextDouble());
                    break;
                case 4:
                    Calculator.divide(sc.nextDouble());
                    break;
                case 5:
                    Calculator.squareRoot();
                    break;
                case 6:
                    Calculator.square();
                    break;
                case 7:
                    Calculator.exponent(sc.nextDouble());
                    break;
                case 8:
                    Calculator.posToNeg();
                    break;
                case 9:
                    Calculator.inverse();
                    break;
                case 10:
                    Trig.sine(Calculator.result);
                    break;
                case 11:
                    Trig.cosine(Calculator.result);
                    break;
                case 12:
                    Trig.tangent(Calculator.result);
                    break;
                case 13:
                    Trig.inverseSine(Calculator.result);
                    break;
                case 14:
                    Trig.inverseCosine(Calculator.result);
                    break;
                case 15:
                    Trig.inverseTangent(Calculator.result);
                    break;
                case 16:
                    Trig.log(Calculator.result);
                    break;
                case 17:
                    Trig.factorial(Calculator.result);
                    break;
                case 18:
                    clearResult();
                    break;
                case 19:
                    System.out.println("Goodbye!");
                    flag=false;
                    break;
                case 20:
                    Memory.addValueToMemory(Calculator.result);
                    break;
                case 21:
                    Memory.clearMemory();
                    break;
                case 22:
                    Memory.getMemoryValue();
                    break;
                case 23:
                    switchDisplayMode();
                    break;
                case 24:
                    switchDisplayMode(DisplayMode.DECIMAL);
                    break;
                case 25:
                    switchDisplayMode(DisplayMode.BINARY);
                    break;
                case 26:
                    switchDisplayMode(DisplayMode.OCTAL);
                    break;
                case 27:
                    switchDisplayMode(DisplayMode.HEXADECIMAL);
                    break;
                case 28:
                    switchValueConversion();
                    break;
                case 29:
                    Trig.convertToDegrees(Calculator.result);
                    break;
                case 30:
                    Trig.convertToRadians(Calculator.result);
                    break;
                default:
                    System.out.println("Sorry, not an option");
            }
        }
    }

    public double clearResult(){
        return Calculator.result = 0;
    }

    static void error(){
        System.out.println("Err");
    }

    //sets up an enum that's used in a switch statement to cycle through the options or to explicitly choose
    //which display mode you want

    public enum DisplayMode {
        DECIMAL,
        BINARY,
        OCTAL,
        HEXADECIMAL;
        }

    //This function allows you to choose which display mode you want then calls engine again

    public void switchDisplayMode(DisplayMode displayMode){

        switch (displayMode){
            case DECIMAL:
                break;
            case BINARY:
                System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(Calculator.result)));
                break;
            case OCTAL:
                System.out.println(Long.toOctalString(Double.doubleToRawLongBits(Calculator.result)));
                break;
            case HEXADECIMAL:
                System.out.println(Long.toHexString(Double.doubleToRawLongBits(Calculator.result)));
                break;
        }
        engine();
     }

    //setters and getters for Display mode

    public void setDisplayMode(DisplayMode displayMode){
        currentDisplayMode = displayMode;
    }

    public DisplayMode getDisplayMode(){
        return currentDisplayMode;
    }

    //This function allows you to cycle through display modes

    public void switchDisplayMode(){
        DisplayMode displayMode = getDisplayMode();
        switch (displayMode){
            case DECIMAL:
                setDisplayMode(DisplayMode.BINARY);
                break;
            case BINARY:
                System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(Calculator.result)));
                setDisplayMode(DisplayMode.OCTAL);
                break;
            case OCTAL:
                System.out.println(Long.toOctalString(Double.doubleToRawLongBits(Calculator.result)));
                setDisplayMode(DisplayMode.HEXADECIMAL);
                break;
            case HEXADECIMAL:
                System.out.println(Long.toHexString(Double.doubleToRawLongBits(Calculator.result)));
                setDisplayMode(DisplayMode.DECIMAL);
                break;
        }
        engine();
    }

    //sets up an enum that's used in a switch statement to cycle through the options or to explicitly choose
    //which value conversion you want

    public enum ValueConversion{
        DEGREES,
        RADIANS;
    }

    //setters and getters

    public void setValueConversion(ValueConversion valueConversion){
        currentValueConversion = valueConversion;
    }

    public ValueConversion getValueConversion(){
        return currentValueConversion;
    }

    //function allows you to cycle through Value conversions

    public void switchValueConversion(){
        ValueConversion valueConversion = getValueConversion();
        switch(valueConversion){
            case DEGREES:
                Trig.convertToDegrees(Calculator.result);
                setValueConversion(ValueConversion.RADIANS);
                break;
            case RADIANS:
                Trig.convertToRadians(Calculator.result);
                setValueConversion(ValueConversion.DEGREES);
                break;
        }
    }
}

