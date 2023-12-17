public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayUtils.printArray(numbers);

        String[] names = {"John", "Jane", "Alice"};
        ArrayUtils.printArray(names);
    }


 
}

class ArrayUtils {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + "  ");
        }
    }
}

