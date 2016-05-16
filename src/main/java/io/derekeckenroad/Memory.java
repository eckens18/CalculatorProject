package io.derekeckenroad;

public class Memory {

    //For the memory i just went ahead and set up a double variable that holds a value that i can either
    //add to clear or get.

    public static double memory = 0;

    static void addValueToMemory(double result){
        memory += result;
    }

    static void clearMemory(){
        memory = 0;
    }

    static void getMemoryValue(){
        System.out.println("Memory value is: "+memory);
    }
}
