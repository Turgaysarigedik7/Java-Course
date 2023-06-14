package Arrays;

import java.util.Arrays;


public class ArrayExamples {
    public static void main(String[] args) {
        String arr[] = {"Turgay","Sefa","Sari"};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
        int arr1[] = {1, 2, 34, 5, 67, 8, 89, 566, 43, 42, 34, 345, 45, 5, 758};
        for (int i=0;i<arr1.length;i++)
            System.out.println(arr1[i]);
        for (int i:arr1) {
            System.out.println(i);
        }
        arr[0]="Burak";
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
       // Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1,34));
        System.out.println(Arrays.binarySearch(arr1,7));

        String str="java ogrenmek eger isterseniz ve tabii ki calisirsaniz cok kolay.";
        String strArr[] = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        String str2="javaogreniyoruzolacakbuisboylegiderse";
        String strArr1[]=str2.split("");
        System.out.println(Arrays.toString(strArr1));

        int random[] = {6,-4,12,2,8};
        int x = 12;
        int y = Arrays.binarySearch(random,x);
        System.out.println(y);





    }
}
