import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //создаю массив из 12 элементов
        int[] array =  new int[12];
        //пользователь вводит 12 элементов массива
        for(int i = 0;i < array.length; i++){
            System.out.println("Введите " + i + " Элемент");
            array[i] = input.nextInt();
        }
        //ищу количество положительных чисел
        int count = 0;
        for(int i = 0;i < array.length; i++){
            if(array[i] >= 0){
                count++;
            }
        }
        // создается и заполняется положительный массив
        int[] plus_array = new int[count];
        count = 0;
        for(int i = 0;i < array.length;i++) {
            if (array[i] >= 0) {
                plus_array[count] = array[i];
                count++;
            }
        }
        selectionSort(plus_array);
        System.out.println(Arrays.toString(plus_array));
    }
    public static void selectionSort(int[] arrs) {
        for (int i = 0;i < arrs.length;i++) {
            int pos = i;
            // минимальное число из несортированной части массива
            int min = arrs[i];
            // ищем через цикл след минимальное число и его позицию
            for (int j = i + 1;j < arrs.length;j++) {
                if (min > arrs[j]) {
                    pos = j;
                    min = arrs[j];
                }
            }
            // перемещяем след минимальное число в отсартированный массив
            arrs[pos] = arrs[i];
            arrs[i] = min;
        }
    }
}
