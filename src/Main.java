import javafx.beans.property.Property;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;21
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        File file = new File("26.txt");
        Scanner scan = new Scanner(file);
        int n = scan.nextInt();
        int[] array = new int[n];
        int itterEven = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            if(array[i] % 2 == 0){
                itterEven++;
            }
        }
        Arrays.sort(array);
        int[] arrayEven = new int[itterEven];
        itterEven = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] % 2 == 0){
                arrayEven[itterEven] = array[i];
                itterEven++;
            }
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < arrayEven.length; i++) {
            for (int j = i + 1; j < arrayEven.length - 1; j++) {
                if(binSearch(array, 0, array.length - 1, ((arrayEven[i] + arrayEven[j]) / 2)) != -1){
                    count++;
                    if(max < (arrayEven[i] + arrayEven[j]) / 2) {
                        max = (arrayEven[i] + arrayEven[j]) / 2;
                    }
                }
            }
        }
        System.out.println(max + " " + count);

//        int n = scan.nextInt();
//        int sumEven = 0;
//        int sumOdd = 0;
//        int sumMin = 0;
//        int minFirst = 0;
//        for (int i = 0; i < n; i++) {
//            int first = scan.nextInt();
//            int second = scan.nextInt();
//            int third = scan.nextInt();
//            System.out.println(first + " " + second + " " + third);
//            int min = min(first, min(second, third));
//            sumMin += min;
//            if(min == first){
//                if(second % 2 == 0){
//                    sumEven += second;
//                    sumOdd += third;
//                }else{
//                    sumEven += third;
//                    sumOdd += second;
//                }
//                if(second - min < third - min){
//                    if((second - min < minFirst) && ((second - min) % 2 == 1)){
//                        minFirst = second - min;
//                    }else{
//                        if((third - min < minFirst) && ((third - min) % 2 == 1)){
//                            minFirst = third - min;
//                        }
//                    }
//                }else{
//                    if((third - min < minFirst) && ((third - min) % 2 == 1)){
//                        minFirst = third - min;
//                    }else{
//                        if((second - min < minFirst) && ((second - min) % 2 == 1)){
//                            minFirst = second - min;
//                        }
//                    }
//                }
//            }else{
//                if(second == min){
//                    if(first % 2 == 0){
//                        sumEven += first;
//                        sumOdd += third;
//                    }else {
//                        sumEven += third;
//                        sumOdd += first;
//                    }
//                    if(first - min < third - min){
//                        if((first - min < minFirst) && ((first - min) % 2 == 1)){
//                            minFirst = first - min;
//                        }else{
//                            if((third - min < minFirst) && ((third - min) % 2 == 1)){
//                                minFirst = third - min;
//                            }
//                        }
//                    }else{
//                        if((third - min < minFirst) && ((third - min) % 2 == 1)){
//                            minFirst = third - min;
//                        }else{
//                            if((first - min < minFirst) && ((first - min) % 2 == 1)){
//                                minFirst = first - min;
//                            }
//                        }
//                    }
//                }else{
//                    if(first % 2 == 0){
//                        sumEven += first;
//                        sumOdd += second;
//                    }else {
//                        sumEven += second;
//                        sumOdd += first;
//                    }
//                    if(second - min < first - min){
//                        if((second - min < minFirst) && ((second - min) % 2 == 1)){
//                            minFirst = second - min;
//                        }else{
//                            if((first - min < minFirst) && ((first - min) % 2 == 1)){
//                                minFirst = first - min;
//                            }
//                        }
//                    }else{
//                        if((first - min < minFirst) && ((first - min) % 2 == 1)){
//                            minFirst = first - min;
//                        }else{
//                            if((second - min < minFirst) && ((second - min) % 2 == 1)){
//                                minFirst = second - min;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        if(sumEven % 2 == sumOdd % 2){
//            sumMin += minFirst;
//        }
//        System.out.println(sumMin);






//        int n = scan.nextInt();
//        int size = scan.nextInt();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int memory = 0;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            int a = scan.nextInt();
//            if(a >= 210 && a <= 220 && memory + a <= size){
//                memory += a;
//                count++;
//            }else{
//                arrayList.add(a);
//            }
//        }
//        Collections.sort(arrayList);
//        int index = 0;
//        int copyMemory = memory;
//        int itter = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(copyMemory + arrayList.get(i) <= size){
//                copyMemory += arrayList.get(i);
//                count++;
//                index = i;
//                itter++;
//            }
//        }
//        int[] array = new int[itter];
//        itter = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(memory + arrayList.get(i) <= size){
//                memory += arrayList.get(i);
//                array[itter] = arrayList.get(i);
//                itter++;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = index + 1; j < arrayList.size(); j++) {
//                if(array[i] < arrayList.get(j) && ((memory - array[i]) + arrayList.get(j) <= size)){
//                    memory -= array[i];
//                    array[i] = arrayList.get(j);
//                    memory += array[i];
//                }else{
//                    break;
//                }
//            }
//        }

    }

    static int binSearch(int[] array, int low, int high, int number){
        int f = -1;
        while(low < high){
            int mid = (low + high) / 2;
            if(array[mid] > number){
                high = mid - 1;
            }else if(array[mid] < number){
                    low = mid + 1;
                }else if(array[mid] == number){
                    f = mid;
                    break;
                }
        }
        return f;
    }

    static int max(int a, int b){
        if(a > b){
            return a;
        }
        else {
            return b;
        }
    }
    static String f(int n, String answer){
        answer += (n + 1);
        if(n > 1){
            answer += (2 * n);
            f(n - 1, answer);
            f(n - 3, answer);
        }
        return answer;
    }

    static void quickSort(int[] array, int low, int high){
        if(array.length == 0){
            return;
        }
        if(low >= high){
            return;
        }

        int middle = low + ((high - low) / 2);
        int element = array[middle];

        int i = low;
        int j = high;

        while(i <= j) {
            while (array[i] < element) {
                i++;
            }
            while (array[j] > element) {
                j--;
            }


            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if(low < j){
            quickSort(array, low, j);
        }
        if(high > i){
            quickSort(array, i, high);
        }
    }

    static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }

    static void rec(int sum){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a == 0){
            System.out.println(sum);
        }else{
            rec(sum + a);
        }
    }



    static void f(int n){
        if(n > 0){
            f(n - 3);
            System.out.print(n);
            f(n / 3);
        }
    }


    static boolean IsPrime(int n, int itter){
        if(n == itter){
            return true;
        }
        if(n % itter == 0){
            return false;
        }
        return IsPrime(n, itter + 1);
    }


    static int power(int a, int n){
        if(n == 1){
            return a;
        }
        return a * power(a, n - 1);
    }



    static int min(int a, int b){
        if(a > b){
            return b;
        }else{
            return a;
        }
    }


    static int min4(int a, int b, int c, int d){
        return min(min(a, b), min(c, d));
    }


    static int gcd(int a, int b){
        while(b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    static int fact(int n){
        if(n == 1){
            return n;
        }
        return n * fact(n - 1);
    }

}