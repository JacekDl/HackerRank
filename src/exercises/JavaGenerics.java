package exercises;


import java.io.IOException;
import java.lang.reflect.Method;

class ArrayPrinter{
    static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }
}

//https://www.hackerrank.com/challenges/java-generics/problem
public class JavaGenerics {
    public static void main(String args[]) {
        ArrayPrinter myPrinter = new ArrayPrinter();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : ArrayPrinter.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
