import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {
//            Task 2

//        int[] numbers = {5, 8, 3, 1, 7, 64, 10};
//
//        // Визначення мінімального та максимального чисел
//        int minNumber = findMin(numbers);
//        int maxNumber = findMax(numbers);
//
//        // Виведення результатів
//        System.out.println("Мінімальне число: " + minNumber);
//        System.out.println("Максимальне число: " + maxNumber);
//    }
//
//    // Метод для знаходження мінімального числа в масиві
//    public static int findMin(int[] array) {
//        int min = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//
//        return min;
//    }
//
//    // Метод для знаходження максимального числа в масиві
//    public static int findMax(int[] array) {
//        int max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//
//        return max;


//        TASK 3
        int[] randomNums = {1, 34, 5, 7, 6, 10};

               System.out.println("Начальный массив: " + Arrays.toString(randomNums));

        for (int i = 0; i < randomNums.length; i++) {
            if (randomNums[i] % 2 == 0) {
                randomNums[i] = 0;
                System.out.println("Итоговый массив: " + Arrays.toString(randomNums));
            }
        }


        }

}
























