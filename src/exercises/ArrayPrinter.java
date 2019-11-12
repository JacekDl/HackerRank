package exercises;

class ArrayPrinter{
    static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }
}
