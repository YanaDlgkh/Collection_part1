package ru.dolgikh.homeworks.collection.part1;
import java.util.ArrayList;

public class TestApp {


    public static void main(String[] args) {

        System.out.println("ПЕРВАЯ ЧАСТЬ");

        System.out.println(sequenceOfValues(1, 15));
        var list = sequenceOfValues(-10, 8);
        System.out.println(list);
        System.out.println(sumOfElementMoreThanFive(list));
        System.out.println(overwrite(5, list));
        System.out.println(increase(10, list));
    }

//   1.  Реализуйте метод, принимающий в качестве аргументов числа min и max,
//    и возвращающий ArrayList с набором последовательных значений в указанном диапазоне
//    (min и max включительно, шаг - 1);

    public static ArrayList<Integer> sequenceOfValues(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i < max + 1; i++) {
            list.add(i);
        }
        return list;
    }


// 2. Реализуйте метод, принимающий в качестве аргумента список целых чисел,
// суммирующий все элементы, значение которых больше 5, и возвращающий сумму;

    public static int sumOfElementMoreThanFive(ArrayList<Integer> integerArrayList) {

        int sum = 0;
        for (var i : integerArrayList) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }


// 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
// метод должен переписать каждую заполненную ячейку списка указанным числом;


    public static ArrayList<Integer> overwrite(int number, ArrayList<Integer> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, number);
        }
        return arrayList;
    }

//    4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
//    увеличивающий каждый элемент списка на указанное число;

    public static ArrayList<Integer> increase(int number, ArrayList<Integer> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + number);
        }
        return arrayList;
    }
}




