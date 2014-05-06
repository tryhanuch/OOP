package homeWork1;

/**
 * Created by tish on 27.01.14.
 */
public class Easy {
    public static void main(String[] args) {
//- из трех чисел, заданных как переменные а0, а1, а2 - найти максимальное и минимальное значение.

        int [] arr0 = new int[3];
        arr0[0] = 83;
        arr0[1] = 497;
        arr0[2] = 17;

        int max = arr0[0];
        int min = arr0[0];

        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] > max){
                max = arr0[i];
            }
            if (arr0[i] < min){
                min = arr0[i];
            }
        }
        System.out.println("min - "+min+", max - "+max);
        System.out.println();

//- вывести первую половину массива. - вывести вторую половину массива.

        int [] arr1 = new int[4];
        arr1[0] = 83;
        arr1[1] = 497;
        arr1[2] = 17;
        arr1[3] = 105;

        System.out.println("Первая половина массива:");
        for (int i = 0; i < arr1.length/2; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("Вторая половина массива:");
        for (int i = arr1.length/2; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();

//скопировать данные из первого массива во второй.

        int [] arr2 = new int[4];

        System.out.println("Копирование данных с масива arr1 в массив arr2 и его вывод на экран:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
            System.out.println(arr2[i]);
        }
        System.out.println();

//- есть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива который получается в результате суммы arr1[i] + arr2[i]

        System.out.println("Вывод массива arr3, который получается в результате суммы arr1 + arr2:");
        int [] arr3 = new int[4];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
            System.out.println(arr3[i]);
        }
        System.out.println();

//- инвертировать массив в обратном направлении

        System.out.println("Вывод массива arr3 в обратном направлении:");
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.println(arr3[i]);
        }
        System.out.println();

//найти среднее арифметическое в одномерном массиве состоящем из чисел

        System.out.println("Среднее арифметическое массива arr3:");
        int sArifm = 0;
        for (int i = 0; i < arr3.length; i++) {
            sArifm = sArifm + arr3[i];
        }
        sArifm = sArifm / arr3.length;
        System.out.println(sArifm);
        System.out.println();

//вывести в консоль сумму среднего арифметического первой половины + второй половины

        System.out.println("Сумма среднего арифметического первой половины и второй массива arr3:");
        int sArifm1 = 0;
        int sArifm2 = 0;
        for (int i = 0; i < arr3.length / 2; i++) {
            sArifm1 = sArifm1 + arr3[i];
        }
        sArifm1 = sArifm1 / (arr3.length / 2);

        for (int i = arr3.length / 2; i < arr3.length; i++) {
            sArifm2 = sArifm2 + arr3[i];
        }
        sArifm2 = sArifm2 / (arr3.length / 2);

        int sum = sArifm1 + sArifm2;
        System.out.println(sum);
        System.out.println();

//- вывести в консоль элементы той половины массива у которой среднее арифметическое максимальное

        System.out.println("Вывод ");


    }
}
